package com.cma.dao;

import com.cma.dao.example.SupervisionRecordExample;
import com.cma.pojo.SupervisionRecord;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisionRecordMapper extends GeneralMapper<SupervisionRecord> {
    long countByExample(SupervisionRecordExample example);

    int deleteByExample(SupervisionRecordExample example);

    List<SupervisionRecord> selectByExample(SupervisionRecordExample example);

    int updateByExampleSelective(@Param("record") SupervisionRecord record, @Param("example") SupervisionRecordExample example);

    int updateByExample(@Param("record") SupervisionRecord record, @Param("example") SupervisionRecordExample example);
}