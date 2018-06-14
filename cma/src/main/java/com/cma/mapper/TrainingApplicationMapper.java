package com.cma.mapper;

import com.cma.pojo.TrainingApplication;
import com.cma.pojo.TrainingApplicationExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingApplicationMapper extends GeneralMapper<TrainingApplication> {
    long countByExample(TrainingApplicationExample example);

    int deleteByExample(TrainingApplicationExample example);

    List<TrainingApplication> selectByExample(TrainingApplicationExample example);

    int updateByExampleSelective(@Param("record") TrainingApplication record, @Param("example") TrainingApplicationExample example);

    int updateByExample(@Param("record") TrainingApplication record, @Param("example") TrainingApplicationExample example);
}