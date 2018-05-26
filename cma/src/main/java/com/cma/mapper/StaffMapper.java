package com.cma.mapper;

import com.cma.pojo.Staff;
import com.cma.pojo.StaffExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper extends GeneralMapper<Staff> {
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    List<Staff> selectByExample(StaffExample example);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);
}