package com.chenjx.knowledge_base.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test")
public class Test {
    @TableId("id")
    private Integer id;
    private String name;
    private String password;
}
