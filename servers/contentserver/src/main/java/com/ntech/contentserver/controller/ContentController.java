package com.ntech.contentserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author dan
 */
@RestController
public class ContentController {


    @GetMapping("/content1")
    public String content1(@RequestParam("name") String name){
        return "hello there " + name;
    }

}
