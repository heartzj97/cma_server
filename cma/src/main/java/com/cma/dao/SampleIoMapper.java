package com.cma.dao;

import com.cma.dao.example.SampleIoExample;
import com.cma.pojo.SampleIo;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SampleIoMapper extends GeneralMapper<SampleIo> {
    long countByExample(SampleIoExample example);

    int deleteByExample(SampleIoExample example);

    List<SampleIo> selectByExample(SampleIoExample example);

    int updateByExampleSelective(@Param("record") SampleIo record, @Param("example") SampleIoExample example);

    int updateByExample(@Param("record") SampleIo record, @Param("example") SampleIoExample example);
}