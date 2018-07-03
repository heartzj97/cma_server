package com.cma.dao;

import com.cma.pojo.SampleReceive;
import com.cma.pojo.SampleReceiveExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleReceiveMapper extends GeneralMapper<SampleReceive> {
    long countByExample(SampleReceiveExample example);

    int deleteByExample(SampleReceiveExample example);

    List<SampleReceive> selectByExample(SampleReceiveExample example);

    int updateByExampleSelective(@Param("record") SampleReceive record, @Param("example") SampleReceiveExample example);

    int updateByExample(@Param("record") SampleReceive record, @Param("example") SampleReceiveExample example);
}