package com.cma.dao;

import com.cma.pojo.IntermediateChecksRecord;
import com.cma.pojo.IntermediateChecksRecordExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntermediateChecksRecordMapper extends GeneralMapper<IntermediateChecksRecord> {
    long countByExample(IntermediateChecksRecordExample example);

    int deleteByExample(IntermediateChecksRecordExample example);

    List<IntermediateChecksRecord> selectByExample(IntermediateChecksRecordExample example);

    int updateByExampleSelective(@Param("record") IntermediateChecksRecord record, @Param("example") IntermediateChecksRecordExample example);

    int updateByExample(@Param("record") IntermediateChecksRecord record, @Param("example") IntermediateChecksRecordExample example);
}