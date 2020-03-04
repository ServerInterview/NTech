package com.ntech.userserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "hello " + name;
    }
}