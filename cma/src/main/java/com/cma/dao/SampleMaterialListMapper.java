package com.cma.dao;

import com.cma.dao.example.SampleMaterialListExample;
import com.cma.pojo.SampleMaterialList;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleMaterialListMapper extends GeneralMapper<SampleMaterialList> {
    long countByExample(SampleMaterialListExample example);

    int deleteByExample(SampleMaterialListExample example);

    List<SampleMaterialList> selectByExample(SampleMaterialListExample example);

    int updateByExampleSelective(@Param("record") SampleMaterialList record, @Param("example") SampleMaterialListExample example);

    int updateByExample(@Param("record") SampleMaterialList record, @Param("example") SampleMaterialListExample example);
}