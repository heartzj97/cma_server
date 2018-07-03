package com.cma.dao;

import com.cma.pojo.StaffQualification;
import com.cma.pojo.StaffQualificationExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffQualificationMapper extends GeneralMapper<StaffQualification> {
    long countByExample(StaffQualificationExample example);

    int deleteByExample(StaffQualificationExample example);

    List<StaffQualification> selectByExample(StaffQualificationExample example);

    int updateByExampleSelective(@Param("record") StaffQualification record, @Param("example") StaffQualificationExample example);

    int updateByExample(@Param("record") StaffQualification record, @Param("example") StaffQualificationExample example);
}