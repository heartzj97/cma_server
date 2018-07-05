package com.cma.dao;

import com.cma.dao.example.SampleReceiptMaterialListExample;
import com.cma.pojo.SampleReceiptMaterialList;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleReceiptMaterialListMapper extends GeneralMapper<SampleReceiptMaterialList> {
    long countByExample(SampleReceiptMaterialListExample example);

    int deleteByExample(SampleReceiptMaterialListExample example);

    List<SampleReceiptMaterialList> selectByExample(SampleReceiptMaterialListExample example);

    int updateByExampleSelective(@Param("record") SampleReceiptMaterialList record, @Param("example") SampleReceiptMaterialListExample example);

    int updateByExample(@Param("record") SampleReceiptMaterialList record, @Param("example") SampleReceiptMaterialListExample example);
}