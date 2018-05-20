package com.cma.mapper;

import com.cma.pojo.StaffTesting;
import com.cma.pojo.StaffTestingExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffTestingMapper extends GeneralMapper<StaffTesting> {
    long countByExample(StaffTestingExample example);

    int deleteByExample(StaffTestingExample example);

    List<StaffTesting> selectByExample(StaffTestingExample example);

    int updateByExampleSelective(@Param("record") StaffTesting record, @Param("example") StaffTestingExample example);

    int updateByExample(@Param("record") StaffTesting record, @Param("example") StaffTestingExample example);
}