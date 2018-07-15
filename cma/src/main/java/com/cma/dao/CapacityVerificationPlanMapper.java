package com.cma.dao;

import com.cma.dao.example.CapacityVerificationPlanExample;
import com.cma.pojo.CapacityVerificationPlan;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapacityVerificationPlanMapper extends GeneralMapper<CapacityVerificationPlan> {
    long countByExample(CapacityVerificationPlanExample example);

    int deleteByExample(CapacityVerificationPlanExample example);

    List<CapacityVerificationPlan> selectByExample(CapacityVerificationPlanExample example);

    int updateByExampleSelective(@Param("record") CapacityVerificationPlan record, @Param("example") CapacityVerificationPlanExample example);

    int updateByExample(@Param("record") CapacityVerificationPlan record, @Param("example") CapacityVerificationPlanExample example);
}