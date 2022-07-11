package com.chenjx.knowledge_base.service_impl;

import com.chenjx.knowledge_base.entity.Test;
import com.chenjx.knowledge_base.mapper.TestMapper;
import com.chenjx.knowledge_base.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestMapperImpl implements ITestService {
    @Resource
    private TestMapper testMapper;

    @Override
    public List<Test> list(){
//        return testMapper.list();
        return testMapper.list();
    }
}
