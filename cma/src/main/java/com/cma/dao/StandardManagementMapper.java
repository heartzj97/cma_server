package com.cma.dao;

import com.cma.dao.example.StandardManagementExample;
import com.cma.pojo.StandardManagement;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StandardManagementMapper extends GeneralMapper<StandardManagement> {
    long countByExample(StandardManagementExample example);

    int deleteByExample(StandardManagementExample example);

    List<StandardManagement> selectByExample(StandardManagementExample example);

    int updateByExampleSelective(@Param("record") StandardManagement record, @Param("example") StandardManagementExample example);

    int updateByExample(@Param("record") StandardManagement record, @Param("example") StandardManagementExample example);
}