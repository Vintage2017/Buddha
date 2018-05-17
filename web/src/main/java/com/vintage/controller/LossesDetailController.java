package com.vintage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description： controller
 * @author： Vintage Wang
 * @create： 2018-01-09
 **/
@Controller
@RequestMapping("buddha/web")
public class LossesDetailController {

    @Autowired
    private static final Logger logger =LoggerFactory.getLogger(LossesDetailController.class);



}
