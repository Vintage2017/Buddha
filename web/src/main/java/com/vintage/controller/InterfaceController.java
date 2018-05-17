package com.vintage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @description： 外部查询接口
 * 有多个系统从本系统请求参数，对外暴露的接口不能多，但是要实现差异化的查询服务
 * 同一个接口具有不多个不同的具体实现
 * java编程思想 第九章 9.6节 适配接口 应用策略模式
 * @author： Vintage Wang
 * @create： 2018-01-09
 **/
@Controller
@RequestMapping("web/query")
public class InterfaceController {

    private static final Logger logger = LoggerFactory.getLogger(InterfaceController.class);




}
