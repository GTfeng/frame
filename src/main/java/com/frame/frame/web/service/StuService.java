package com.frame.frame.web.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frame.frame.web.entity.Stu;
import com.frame.frame.web.mapper.StuMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shr
 * @Date 2020-01-21 14:29
 * @Version 1.0
 */
@Service
public class StuService extends ServiceImpl<StuMapper, Stu> {
    private final StuMapper stuMapper;

    public StuService(StuMapper stuMapper) {
        this.stuMapper = stuMapper;
    }

    @Transactional(rollbackFor = {Exception.class})
    public IPage<Stu> page(Page page, Stu params) {
        QueryWrapper<Stu> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<Stu> wr = wrapper.lambda();
        if (Strings.isNotEmpty(params.getAddr())) {
            wr.like(Stu::getAddr, params.getAddr());
        }
        IPage<Stu> p = this.page(page, wrapper);
        System.out.println(p);
        return p;
    }

    //    public IPage<Stu> getById(Page page,Stu params){
    @Transactional(rollbackFor = {Exception.class})
    public IPage<Stu> getByIds(Page page, List<Stu> params) {
        QueryWrapper<Stu> wrapper = new QueryWrapper<>();
        LambdaQueryWrapper<Stu> wr = wrapper.lambda();

        /**
         * note function1  stupid
         wr = wr.eq(Stu::getId, params.get(0).getId());
         for (int i = 1; i < params.size(); i++) {
         wr = wr.or().eq(Stu::getId, params.get(i).getId());
         }
         **/

        /**
         * note function2  .in
         * note it's nice
         */
        List<Integer> ids = new ArrayList<>();
        for (Stu stu : params) {
            ids.add(stu.getId());
        }
        wr = wr.in(Stu::getId, ids);

        IPage<Stu> p = this.page(page, wr);
        return p;
    }

}
