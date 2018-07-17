package com.cma.dao;

import com.cma.dao.example.TestingInstitutionInformationExample;
import com.cma.pojo.TestingInstitutionInformation;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestingInstitutionInformationMapper extends GeneralMapper<TestingInstitutionInformation> {
    long countByExample(TestingInstitutionInformationExample example);

    int deleteByExample(TestingInstitutionInformationExample example);

    List<TestingInstitutionInformation> selectByExample(TestingInstitutionInformationExample example);

    int updateByExampleSelective(@Param("record") TestingInstitutionInformation record, @Param("example") TestingInstitutionInformationExample example);

    int updateByExample(@Param("record") TestingInstitutionInformation record, @Param("example") TestingInstitutionInformationExample example);
}