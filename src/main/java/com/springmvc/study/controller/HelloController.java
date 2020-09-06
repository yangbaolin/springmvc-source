package com.springmvc.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @author 2020-09-06
 * @Description
 **/
@RestController
@RequestMapping("test")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "你好，世界~！";
    }
    
}
