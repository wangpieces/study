package com.wangpiece.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang.xu
 * @desc
 * @date 2018-10-21 15:19
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping
    public String hello() {
        return "hello world!";
    }
}
