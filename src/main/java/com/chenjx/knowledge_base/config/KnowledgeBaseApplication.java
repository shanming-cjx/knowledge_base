package com.chenjx.knowledge_base.config;


import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;



@SpringBootApplication//本身包含@ComponentScan，默认扫描所在包的路路径
@ComponentScan({"com.chenjx"})//扫描指定包路劲
@MapperScan({"com.chenjx.knowledge_base.mapper"})
public class KnowledgeBaseApplication {
    private static final Logger LOG = LoggerFactory.getLogger(KnowledgeBaseApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(KnowledgeBaseApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("Spring启动成功!！");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
