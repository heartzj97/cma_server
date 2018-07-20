package com.cma.dao;

import com.cma.dao.example.ExternalReviewManagementExample;
import com.cma.pojo.ExternalReviewManagement;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalReviewManagementMapper extends GeneralMapper<ExternalReviewManagement> {
    long countByExample(ExternalReviewManagementExample example);

    int deleteByExample(ExternalReviewManagementExample example);

    List<ExternalReviewManagement> selectByExample(ExternalReviewManagementExample example);

    int updateByExampleSelective(@Param("record") ExternalReviewManagement record, @Param("example") ExternalReviewManagementExample example);

    int updateByExample(@Param("record") ExternalReviewManagement record, @Param("example") ExternalReviewManagementExample example);
}