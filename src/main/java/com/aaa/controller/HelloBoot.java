package com.aaa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * fileName:HelloBoot
 * description:
 * author:Ldl
 * createTime:2019-03-20 9:32
 */
@RestController
public class HelloBoot {
    @RequestMapping("hello")
    public String hello(){
        return "Hello boot";
    }
}
