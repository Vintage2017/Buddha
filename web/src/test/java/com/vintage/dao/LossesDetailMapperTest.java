package com.vintage.dao;

import com.google.gson.Gson;
import com.vintage.entity.LossesDetail;
import com.vintage.entity.LossesDetailExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @description： 挂账数据测试类
 * @author： Vintage Wang
 * @create： 2018-01-09
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class LossesDetailMapperTest {

    @Autowired
    private LossesDetailMapper lossesDetailMapper;


    @Test
    public void selectByExample() {
        LossesDetailExample example = new LossesDetailExample();

        example.createCriteria()
                .andPayeeNameEqualTo("玫瑰网点");

        List<LossesDetail> details = lossesDetailMapper.selectByExample(example);

        System.out.println(new Gson().toJson(details));
    }
}