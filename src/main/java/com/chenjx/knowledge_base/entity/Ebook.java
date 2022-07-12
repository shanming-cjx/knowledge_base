package com.chenjx.knowledge_base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 电子书
 * @author chenjx
 * @since 2022-07-12
 */
@Data
@TableName("ebook")
public class Ebook implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    private Long id;

    // 名称
    private String name;

    // 分类1
    private Long category1Id;

    // 分类2
    private Long category2Id;

    //描述
    private String description;

    // 封面
    private String cover;

    // 文档数
    private Integer docCount;

    // 阅读数
    private Integer viewCount;

    //点赞数
    private Integer voteCount;

    @Override
    public String toString() {
        return "Ebook{" +
            "id=" + id +
            ", name=" + name +
            ", category1Id=" + category1Id +
            ", category2Id=" + category2Id +
            ", description=" + description +
            ", cover=" + cover +
            ", docCount=" + docCount +
            ", viewCount=" + viewCount +
            ", voteCount=" + voteCount +
        "}";
    }
}
