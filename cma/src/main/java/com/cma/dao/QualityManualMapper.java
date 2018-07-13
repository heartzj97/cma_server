package com.cma.dao;

import com.cma.dao.example.QualityManualExample;
import com.cma.pojo.QualityManual;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QualityManualMapper extends GeneralMapper<QualityManual> {
    long countByExample(QualityManualExample example);

    int deleteByExample(QualityManualExample example);

    List<QualityManual> selectByExample(QualityManualExample example);

    int updateByExampleSelective(@Param("record") QualityManual record, @Param("example") QualityManualExample example);

    int updateByExample(@Param("record") QualityManual record, @Param("example") QualityManualExample example);
}