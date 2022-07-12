package com.chenjx.knowledge_base.service_impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenjx.knowledge_base.entity.Ebook;
import com.chenjx.knowledge_base.mapper.EbookMapper;
import com.chenjx.knowledge_base.service.IEbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电子书 服务实现类
 *
 * @author chenjx
 * @since 2022-07-12
 */
@Service
public class EbookServiceImpl extends ServiceImpl<EbookMapper, Ebook> implements IEbookService {

    @Resource
    private EbookMapper ebookMapper;

    @Override
    public List<Ebook> selectListForAll() {
        return ebookMapper.selectList(null);
    }
}
