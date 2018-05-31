package com.cma.mapper;

import com.cma.pojo.StaffTrainingResult;
import com.cma.pojo.StaffTrainingResultExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffTrainingResultMapper extends GeneralMapper<StaffTrainingResult> {
    long countByExample(StaffTrainingResultExample example);

    int deleteByExample(StaffTrainingResultExample example);

    List<StaffTrainingResult> selectByExample(StaffTrainingResultExample example);

    int updateByExampleSelective(@Param("record") StaffTrainingResult record, @Param("example") StaffTrainingResultExample example);

    int updateByExample(@Param("record") StaffTrainingResult record, @Param("example") StaffTrainingResultExample example);
    
    List<StaffTrainingResult> findStaffTrainingResultByUserId(Long value);
    
    List<StaffTrainingResult> findStaffTrainingResultByTrainingId(Long value);
}