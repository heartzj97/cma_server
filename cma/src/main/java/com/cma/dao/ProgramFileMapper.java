package com.cma.dao;

import com.cma.dao.example.ProgramFileExample;
import com.cma.pojo.ProgramFile;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgramFileMapper extends GeneralMapper<ProgramFile> {
    long countByExample(ProgramFileExample example);

    int deleteByExample(ProgramFileExample example);

    List<ProgramFile> selectByExample(ProgramFileExample example);

    int updateByExampleSelective(@Param("record") ProgramFile record, @Param("example") ProgramFileExample example);

    int updateByExample(@Param("record") ProgramFile record, @Param("example") ProgramFileExample example);
}