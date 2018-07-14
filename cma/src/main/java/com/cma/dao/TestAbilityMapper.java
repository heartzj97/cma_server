package com.cma.dao;

import com.cma.dao.example.TestAbilityExample;
import com.cma.pojo.TestAbility;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestAbilityMapper extends GeneralMapper<TestAbility> {
    long countByExample(TestAbilityExample example);

    int deleteByExample(TestAbilityExample example);

    List<TestAbility> selectByExample(TestAbilityExample example);

    int updateByExampleSelective(@Param("record") TestAbility record, @Param("example") TestAbilityExample example);

    int updateByExample(@Param("record") TestAbility record, @Param("example") TestAbilityExample example);
}