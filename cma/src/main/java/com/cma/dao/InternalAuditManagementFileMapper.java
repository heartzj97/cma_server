package com.cma.dao;

import com.cma.dao.example.InternalAuditManagementFileExample;
import com.cma.pojo.InternalAuditManagementFile;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InternalAuditManagementFileMapper extends GeneralMapper<InternalAuditManagementFile> {
    long countByExample(InternalAuditManagementFileExample example);

    int deleteByExample(InternalAuditManagementFileExample example);

    List<InternalAuditManagementFile> selectByExample(InternalAuditManagementFileExample example);

    int updateByExampleSelective(@Param("record") InternalAuditManagementFile record, @Param("example") InternalAuditManagementFileExample example);

    int updateByExample(@Param("record") InternalAuditManagementFile record, @Param("example") InternalAuditManagementFileExample example);
}