package com.cma.dao;

import com.cma.pojo.StaffFile;
import com.cma.pojo.StaffFileExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffFileMapper extends GeneralMapper<StaffFile> {
    long countByExample(StaffFileExample example);

    int deleteByExample(StaffFileExample example);

    List<StaffFile> selectByExample(StaffFileExample example);

    int updateByExampleSelective(@Param("record") StaffFile record, @Param("example") StaffFileExample example);

    int updateByExample(@Param("record") StaffFile record, @Param("example") StaffFileExample example);
}