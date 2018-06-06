package com.cma.mapper;

import com.cma.pojo.StaffTraining;
import com.cma.pojo.StaffTrainingExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffTrainingMapper extends GeneralMapper<StaffTraining> {
    long countByExample(StaffTrainingExample example);

    int deleteByExample(StaffTrainingExample example);

    List<StaffTraining> selectByExample(StaffTrainingExample example);

    int updateByExampleSelective(@Param("record") StaffTraining record, @Param("example") StaffTrainingExample example);

    int updateByExample(@Param("record") StaffTraining record, @Param("example") StaffTrainingExample example);
    StaffTraining getTrainById(Long value);
}