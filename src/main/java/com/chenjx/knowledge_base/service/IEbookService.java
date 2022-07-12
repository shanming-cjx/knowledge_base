package com.chenjx.knowledge_base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenjx.knowledge_base.entity.Ebook;

import java.util.List;

/**
 * 电子书 服务类
 *
 * @author chenjx
 * @since 2022-07-12
 */
public interface IEbookService extends IService<Ebook> {
    List<Ebook> selectListForAll();
}
