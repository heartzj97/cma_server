package com.cma.dao;

import com.cma.pojo.SupervisionPlan;
import com.cma.pojo.SupervisionPlanExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisionPlanMapper extends GeneralMapper<SupervisionPlan> {
    long countByExample(SupervisionPlanExample example);

    int deleteByExample(SupervisionPlanExample example);

    List<SupervisionPlan> selectByExample(SupervisionPlanExample example);

    int updateByExampleSelective(@Param("record") SupervisionPlan record, @Param("example") SupervisionPlanExample example);

    int updateByExample(@Param("record") SupervisionPlan record, @Param("example") SupervisionPlanExample example);
}