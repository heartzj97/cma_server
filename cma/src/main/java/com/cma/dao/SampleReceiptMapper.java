package com.cma.dao;

import com.cma.dao.example.SampleReceiptExample;
import com.cma.pojo.SampleReceipt;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleReceiptMapper extends GeneralMapper<SampleReceipt> {
    long countByExample(SampleReceiptExample example);

    int deleteByExample(SampleReceiptExample example);

    List<SampleReceipt> selectByExample(SampleReceiptExample example);

    int updateByExampleSelective(@Param("record") SampleReceipt record, @Param("example") SampleReceiptExample example);

    int updateByExample(@Param("record") SampleReceipt record, @Param("example") SampleReceiptExample example);
}