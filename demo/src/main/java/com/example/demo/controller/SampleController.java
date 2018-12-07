package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author James Kao on 2018/11/28
 */
@RestController
public class SampleController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello JK";
    }
}