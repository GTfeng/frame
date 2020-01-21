package com.frame.frame.web.service;

import com.frame.frame.web.entity.Stu;
import com.frame.frame.web.mapper.StuMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author shr
 * @Date 2020-01-20 17:51
 * @Version 1.0
 */
@Service
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private StuMapper stuMapper;

    @Test
    public void testSelect() {
        System.out.println("----Select All method----");
        List<Stu> stuList = stuMapper.selectList(null);
        Assert.assertEquals(50, stuList.size());
        stuList.forEach(System.out::println);
    }
}
