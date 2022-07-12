package com.chenjx.knowledge_base;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class MybatisPlusGeneratorTest {

    @Test
    void generator(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3308/knowledge_base?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false&serverTimezone=GMT%2b8", "knowledge", "123456")
                .globalConfig(builder -> {
                    builder.author("chenjx") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            //.fileOverride() // 覆盖已生成文件
                            .outputDir("D://MybatisPlusGeneratorTest"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.chenjx") // 设置父包名
                            .moduleName("knowledge_base") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://MybatisPlusGeneratorTest")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("test"); // 设置需要生成的表名
                    //.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}