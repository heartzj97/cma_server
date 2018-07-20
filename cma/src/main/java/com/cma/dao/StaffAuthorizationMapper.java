package com.cma.dao;

import com.cma.dao.example.StaffAuthorizationExample;
import com.cma.pojo.StaffAuthorization;
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