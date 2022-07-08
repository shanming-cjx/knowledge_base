package com.chenjx.knowledge_base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

//    @RequestMapping(value = "/test", method = RequestMethod.GET)//效果与下等同，http共8种常见4种
    @GetMapping("/test")
    public String text(){
        return "Hello World!!!";
    }
}
