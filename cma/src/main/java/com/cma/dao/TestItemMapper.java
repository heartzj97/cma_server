package com.cma.dao;

import com.cma.dao.example.TestItemExample;
import com.cma.pojo.TestItem;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestItemMapper extends GeneralMapper<TestItem> {
    long countByExample(TestItemExample example);

    int deleteByExample(TestItemExample example);

    List<TestItem> selectByExample(TestItemExample example);

    int updateByExampleSelective(@Param("record") TestItem record, @Param("example") TestItemExample example);

    int updateByExample(@Param("record") TestItem record, @Param("example") TestItemExample example);
}