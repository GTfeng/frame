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
    public Stu getById(Page page, Stu params) {
//        QueryWrapper<Stu> wrapper = new QueryWrapper<>();
        Stu stu = this.getById(params.getId());
        return stu;
    }

}
