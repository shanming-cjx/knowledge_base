package com.chenjx.knowledge_base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Value("${text.t:hello}")
    private String text;

//    @RequestMapping(value = "/test", method = RequestMethod.GET)//效果与下等同，http共8种常见4种
    @GetMapping("/test")
    public String text(){
        return "Hello World!!!" + text;
    }
}
