package com.cma.dao;

import com.cma.dao.example.CapacityVerificationProjectExample;
import com.cma.pojo.CapacityVerificationProject;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapacityVerificationProjectMapper extends GeneralMapper<CapacityVerificationProject> {
    long countByExample(CapacityVerificationProjectExample example);

    int deleteByExample(CapacityVerificationProjectExample example);

    List<CapacityVerificationProject> selectByExample(CapacityVerificationProjectExample example);

    int updateByExampleSelective(@Param("record") CapacityVerificationProject record, @Param("example") CapacityVerificationProjectExample example);

    int updateByExample(@Param("record") CapacityVerificationProject record, @Param("example") CapacityVerificationProjectExample example);
}