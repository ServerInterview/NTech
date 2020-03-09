package com.ntech.userserver.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dan
 */
@RestController
public class UserInfoController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {

        return "hello " + name;
    }


    @PostMapping("/SignUp")
    public String SignUp(@RequestParam("email") String email, @RequestParam("name") String name, @RequestParam("psd") String psd){
        //todo
        if (StringUtils.isNotEmpty(email)
        && StringUtils.isNotEmpty(name)
        && StringUtils.isNotEmpty(psd)
        )
        {
            //todo check and add
            return "new user coming email:" + email + " name:" + name + " psd:" + psd;
        }
        return "failed";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("psd") String psd) {
        //todo
        if (!StringUtils.isEmpty(email) && StringUtils.isEmpty(psd)) {
            // todo check
            //todo  back to main page
            return email + " login success";
        } else {
            //登陆失败
            return "failed";
        }
    }
    @PostMapping("/logout")
    public String logout(){
        //todo
        return  "success";
    }



}
