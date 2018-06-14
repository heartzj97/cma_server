package com.cma.mapper;

import com.cma.pojo.IntermediateChecksPlan;
import com.cma.pojo.IntermediateChecksPlanExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntermediateChecksPlanMapper extends GeneralMapper<IntermediateChecksPlan> {
    long countByExample(IntermediateChecksPlanExample example);

    int deleteByExample(IntermediateChecksPlanExample example);

    List<IntermediateChecksPlan> selectByExample(IntermediateChecksPlanExample example);

    int updateByExampleSelective(@Param("record") IntermediateChecksPlan record, @Param("example") IntermediateChecksPlanExample example);

    int updateByExample(@Param("record") IntermediateChecksPlan record, @Param("example") IntermediateChecksPlanExample example);
}