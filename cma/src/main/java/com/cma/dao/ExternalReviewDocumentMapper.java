package com.cma.dao;

import com.cma.dao.example.ExternalReviewDocumentExample;
import com.cma.pojo.ExternalReviewDocument;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalReviewDocumentMapper extends GeneralMapper<ExternalReviewDocument> {
    long countByExample(ExternalReviewDocumentExample example);

    int deleteByExample(ExternalReviewDocumentExample example);

    List<ExternalReviewDocument> selectByExample(ExternalReviewDocumentExample example);

    int updateByExampleSelective(@Param("record") ExternalReviewDocument record, @Param("example") ExternalReviewDocumentExample example);

    int updateByExample(@Param("record") ExternalReviewDocument record, @Param("example") ExternalReviewDocumentExample example);
}