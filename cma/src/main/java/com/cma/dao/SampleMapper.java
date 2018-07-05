package com.cma.dao;

import com.cma.dao.example.SampleExample;
import com.cma.pojo.Sample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleMapper extends GeneralMapper<Sample> {	
    long countByExample(SampleExample example);

    int deleteByExample(SampleExample example);

    List<Sample> selectByExample(SampleExample example);

    int updateByExampleSelective(@Param("record") Sample record, @Param("example") SampleExample example);

    int updateByExample(@Param("record") Sample record, @Param("example") SampleExample example);
    
}