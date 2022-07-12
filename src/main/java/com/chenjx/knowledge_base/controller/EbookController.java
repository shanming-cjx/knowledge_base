package com.chenjx.knowledge_base.controller;

import com.chenjx.knowledge_base.resp.CommonResp;
import com.chenjx.knowledge_base.service_impl.EbookServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 电子书 前端控制器
 * @author chenjx
 * @since 2022-07-12
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    EbookServiceImpl ebookService;

    @GetMapping("/list")
    public CommonResp<?> list() {
        return CommonResp.success(ebookService.selectListForAll());
    }
}
