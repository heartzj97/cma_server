package com.cma.dao;

import com.cma.dao.example.TestingInstitutionResourceExample;
import com.cma.pojo.TestingInstitutionResource;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestingInstitutionResourceMapper extends GeneralMapper<TestingInstitutionResource> {
    long countByExample(TestingInstitutionResourceExample example);

    int deleteByExample(TestingInstitutionResourceExample example);

    List<TestingInstitutionResource> selectByExample(TestingInstitutionResourceExample example);

    int updateByExampleSelective(@Param("record") TestingInstitutionResource record, @Param("example") TestingInstitutionResourceExample example);

    int updateByExample(@Param("record") TestingInstitutionResource record, @Param("example") TestingInstitutionResourceExample example);
}