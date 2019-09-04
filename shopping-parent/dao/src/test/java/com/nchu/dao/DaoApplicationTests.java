package com.nchu.dao;

import com.nchu.mapper.AreaMapper;
import com.nchu.model.Area;
import com.nchu.model.AreaExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DaoApplicationTests {

    @Resource
    private AreaMapper areaMapper;
    @Test
    public void contextLoads() {

        AreaExample example=new AreaExample();
        AreaExample.Criteria criteria=example.createCriteria();
        //不等于
        //criteria.andIdNotEqualTo(59L);
        //查询等于的条件
        //criteria.andIdEqualTo(59L);
        //在什么之间
        criteria.andAreaidBetween("110101","110202");
        //criteria.andAddressEqualTo("金燕龙办公楼");
        List<Area> areas=areaMapper.selectByExample(example);
        System.out.println(areas);
    }

}
