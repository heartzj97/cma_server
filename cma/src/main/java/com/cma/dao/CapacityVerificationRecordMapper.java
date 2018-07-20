package com.cma.dao;

import com.cma.dao.example.CapacityVerificationRecordExample;
import com.cma.pojo.CapacityVerificationRecord;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapacityVerificationRecordMapper extends GeneralMapper<CapacityVerificationRecord> {
    long countByExample(CapacityVerificationRecordExample example);

    int deleteByExample(CapacityVerificationRecordExample example);

    List<CapacityVerificationRecord> selectByExample(CapacityVerificationRecordExample example);

    int updateByExampleSelective(@Param("record") CapacityVerificationRecord record, @Param("example") CapacityVerificationRecordExample example);

    int updateByExample(@Param("record") CapacityVerificationRecord record, @Param("example") CapacityVerificationRecordExample example);
}