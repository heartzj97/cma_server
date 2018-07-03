package com.cma.dao;

import com.cma.pojo.StaffSupervising;
import com.cma.pojo.StaffSupervisingExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffSupervisingMapper extends GeneralMapper<StaffSupervising> {
    long countByExample(StaffSupervisingExample example);

    int deleteByExample(StaffSupervisingExample example);

    List<StaffSupervising> selectByExample(StaffSupervisingExample example);

    int updateByExampleSelective(@Param("record") StaffSupervising record, @Param("example") StaffSupervisingExample example);

    int updateByExample(@Param("record") StaffSupervising record, @Param("example") StaffSupervisingExample example);
}