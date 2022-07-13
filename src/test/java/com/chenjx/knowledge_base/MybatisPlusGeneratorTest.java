package com.chenjx.knowledge_base;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class MybatisPlusGeneratorTest {

    @Test
    void generator() {
        FastAutoGenerator.create("jdbc:mysql://localhost:3308/knowledge_base?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false&serverTimezone=GMT%2b8", "knowledge", "123456")
                .globalConfig(builder -> {
                    builder.author("chenjx") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://MybatisPlusGeneratorTest"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.chenjx") // 设置父包名
                            .moduleName("knowledge_base") // 设置父包模块名
                            .serviceImpl("service_impl")//设置服务层实现类包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://MybatisPlusGeneratorTest/mapperXml")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ebook") // 设置需要生成的表名
                            .entityBuilder()//设置实体类配置
                            .enableLombok()//开启lombok
                            .enableChainModel()//开启链式编程
                            .enableTableFieldAnnotation()//开启生成实体时生成字段注解
                            .naming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略：下划线转驼峰命名
                            .controllerBuilder()//设置controller层配置
                            .enableRestStyle();//使用RestController注解
                    //.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateConfig(builder -> {
                    builder.entity("template/entity.java");//自定义模板，不可写.ftl文件后缀名，mybatis会自动匹配
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
