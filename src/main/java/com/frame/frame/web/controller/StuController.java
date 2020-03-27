package com.frame.frame.web.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.frame.frame.base.XR;
import com.frame.frame.base.application.XApiController;
import com.frame.frame.web.entity.Stu;
import com.frame.frame.web.service.StuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author shr
 * @Date 2020-01-21 14:19
 * @Version 1.0
 */
@Api(tags = "学生表测试")
@Controller
@RequestMapping(value = "/stu")
public class StuController extends XApiController {
    private static final Logger LOG = LoggerFactory.getLogger(StuController.class);

    private final StuService stuService;

    public StuController(StuService stuService) {
        this.stuService = stuService;
    }


    @ApiOperation(value = "分页查询", notes = "暂不允许带入查询条件", httpMethod = "POST")
//    @ApiImplicitParams({
//
//    })
    @PostMapping("page.sdo")
    @ResponseBody
    public XR<IPage<Stu>> page(Page page, Stu params) {
        XR<IPage<Stu>> r = XR.ok(stuService.page(page, params));
        return r;
    }

    @RequestMapping("/")
    public String testHTTP() {
        return "HTTP";
    }

    @PostMapping(value = "getById.sdo", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Stu getById(Page page, @RequestBody List<Stu> params) {
        Stu stu = stuService.getById(params.get(0).getId());
//        System.out.println("getById.sdo");
        return stu;
    }

    @PostMapping("getByIds.sdo")
    @ResponseBody
    public XR<IPage<Stu>> getByIds(Page page, @RequestBody List<Stu> params) {
        XR<IPage<Stu>> r = XR.ok(stuService.getByIds(page, params));
        return r;
    }

    @PostMapping("updateStus.sdo")
    @ResponseBody
    public XR<IPage<Stu>> updateStus(Page page, @RequestBody List<Stu> params) {
        XR<IPage<Stu>> r = XR.ok(stuService.updateStus(page, params));
        return r;
    }

    @PostMapping("deleteByIds.sdo")
    @ResponseBody
    public XR<IPage<Stu>> deleteByIds(Page page, @RequestBody List<Stu> params) {
        XR<IPage<Stu>> r = XR.ok(stuService.deleteByIds(page, params));
        return r;
    }
}
