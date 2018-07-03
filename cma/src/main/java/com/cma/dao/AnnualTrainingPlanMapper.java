package com.cma.dao;

import com.cma.pojo.AnnualTrainingPlan;
import com.cma.pojo.AnnualTrainingPlanExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnnualTrainingPlanMapper extends GeneralMapper<AnnualTrainingPlan> {
    long countByExample(AnnualTrainingPlanExample example);

    int deleteByExample(AnnualTrainingPlanExample example);

    List<AnnualTrainingPlan> selectByExample(AnnualTrainingPlanExample example);

    int updateByExampleSelective(@Param("record") AnnualTrainingPlan record, @Param("example") AnnualTrainingPlanExample example);

    int updateByExample(@Param("record") AnnualTrainingPlan record, @Param("example") AnnualTrainingPlanExample example);
}