package com.cma.dao;

import com.cma.dao.example.InternalAuditManagementExample;
import com.cma.pojo.InternalAuditManagement;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternalAuditManagementMapper extends GeneralMapper<InternalAuditManagement> {
    long countByExample(InternalAuditManagementExample example);

    int deleteByExample(InternalAuditManagementExample example);

    List<InternalAuditManagement> selectByExample(InternalAuditManagementExample example);

    int updateByExampleSelective(@Param("record") InternalAuditManagement record, @Param("example") InternalAuditManagementExample example);

    int updateByExample(@Param("record") InternalAuditManagement record, @Param("example") InternalAuditManagementExample example);
}