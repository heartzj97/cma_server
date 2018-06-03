package com.cma.mapper;

import com.cma.pojo.StaffAuthorization;
import com.cma.pojo.StaffAuthorizationExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffAuthorizationMapper extends GeneralMapper<StaffAuthorization> {
    long countByExample(StaffAuthorizationExample example);

    int deleteByExample(StaffAuthorizationExample example);

    List<StaffAuthorization> selectByExample(StaffAuthorizationExample example);

    int updateByExampleSelective(@Param("record") StaffAuthorization record, @Param("example") StaffAuthorizationExample example);

    int updateByExample(@Param("record") StaffAuthorization record, @Param("example") StaffAuthorizationExample example);
}