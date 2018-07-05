package com.cma.dao;

import com.cma.dao.example.ManagementReviewFileExample;
import com.cma.pojo.ManagementReviewFile;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagementReviewFileMapper extends GeneralMapper<ManagementReviewFile> {
    long countByExample(ManagementReviewFileExample example);

    int deleteByExample(ManagementReviewFileExample example);

    List<ManagementReviewFile> selectByExample(ManagementReviewFileExample example);

    int updateByExampleSelective(@Param("record") ManagementReviewFile record, @Param("example") ManagementReviewFileExample example);

    int updateByExample(@Param("record") ManagementReviewFile record, @Param("example") ManagementReviewFileExample example);
}