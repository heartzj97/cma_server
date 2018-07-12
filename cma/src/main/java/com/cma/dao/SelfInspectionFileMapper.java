package com.cma.dao;

import com.cma.dao.example.SelfInspectionFileExample;
import com.cma.pojo.SelfInspectionFile;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelfInspectionFileMapper extends GeneralMapper<SelfInspectionFile> {
    long countByExample(SelfInspectionFileExample example);

    int deleteByExample(SelfInspectionFileExample example);

    List<SelfInspectionFile> selectByExample(SelfInspectionFileExample example);

    int updateByExampleSelective(@Param("record") SelfInspectionFile record, @Param("example") SelfInspectionFileExample example);

    int updateByExample(@Param("record") SelfInspectionFile record, @Param("example") SelfInspectionFileExample example);
}