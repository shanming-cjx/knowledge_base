package com.chenjx.knowledge_base.controller;

import com.chenjx.knowledge_base.entity.Test;
import com.chenjx.knowledge_base.service_impl.TestMapperImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Test1 {

    @Value("${text.t:hello}")
    private String text;
    @Resource
    private TestMapperImpl testMapperImpl;

//    @RequestMapping(value = "/test", method = RequestMethod.GET)//效果与下等同，http共8种常见4种
    @GetMapping("/test")
    public String text(){
        return "Hello World!!!" + text;
    }

    @GetMapping("/test/mybatis_plus")
    public List<Test> test(){
        return testMapperImpl.list();
    }

}
