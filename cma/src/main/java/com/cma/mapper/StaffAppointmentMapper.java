package com.cma.mapper;

import com.cma.pojo.StaffAppointment;
import com.cma.pojo.StaffAppointmentExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffAppointmentMapper extends GeneralMapper<StaffAppointment> {
    long countByExample(StaffAppointmentExample example);

    int deleteByExample(StaffAppointmentExample example);

    List<StaffAppointment> selectByExample(StaffAppointmentExample example);

    int updateByExampleSelective(@Param("record") StaffAppointment record, @Param("example") StaffAppointmentExample example);

    int updateByExample(@Param("record") StaffAppointment record, @Param("example") StaffAppointmentExample example);
}