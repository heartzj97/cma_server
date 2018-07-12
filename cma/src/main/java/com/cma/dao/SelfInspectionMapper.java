package com.cma.dao;

import com.cma.dao.example.SelfInspectionExample;
import com.cma.pojo.SelfInspection;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelfInspectionMapper extends GeneralMapper<SelfInspection> {
    long countByExample(SelfInspectionExample example);

    int deleteByExample(SelfInspectionExample example);

    List<SelfInspection> selectByExample(SelfInspectionExample example);

    int updateByExampleSelective(@Param("record") SelfInspection record, @Param("example") SelfInspectionExample example);

    int updateByExample(@Param("record") SelfInspection record, @Param("example") SelfInspectionExample example);
}