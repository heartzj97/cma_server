package com.cma.mapper;

import com.cma.pojo.AllAnnualPlan;
import com.cma.pojo.AllAnnualPlanExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllAnnualPlanMapper extends GeneralMapper<AllAnnualPlan> {
    long countByExample(AllAnnualPlanExample example);

    int deleteByExample(AllAnnualPlanExample example);

    List<AllAnnualPlan> selectByExample(AllAnnualPlanExample example);

    int updateByExampleSelective(@Param("record") AllAnnualPlan record, @Param("example") AllAnnualPlanExample example);

    int updateByExample(@Param("record") AllAnnualPlan record, @Param("example") AllAnnualPlanExample example);
}