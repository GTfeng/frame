package com.frame.frame.web.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.frame.frame.base.XR;
import com.frame.frame.base.application.XApiController;
import com.frame.frame.web.entity.Stu;
import com.frame.frame.web.service.StuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
