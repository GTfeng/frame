package com.frame.frame.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frame.frame.web.entity.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StuMapper extends BaseMapper<Stu> {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Stu record);
//
//    int insertSelective(Stu record);
//
//    Stu selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(Stu record);
//
//    int updateByPrimaryKey(Stu record);
}