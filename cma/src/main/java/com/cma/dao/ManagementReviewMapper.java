package com.cma.dao;

import com.cma.dao.example.ManagementReviewExample;
import com.cma.pojo.ManagementReview;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagementReviewMapper extends GeneralMapper<ManagementReview> {
    long countByExample(ManagementReviewExample example);

    int deleteByExample(ManagementReviewExample example);

    List<ManagementReview> selectByExample(ManagementReviewExample example);

    int updateByExampleSelective(@Param("record") ManagementReview record, @Param("example") ManagementReviewExample example);

    int updateByExample(@Param("record") ManagementReview record, @Param("example") ManagementReviewExample example);
}