package com.cma.dao;

import com.cma.dao.example.SupervisionExample;
import com.cma.pojo.Supervision;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupervisionMapper extends GeneralMapper<Supervision> {
    long countByExample(SupervisionExample example);

    int deleteByExample(SupervisionExample example);

    List<Supervision> selectByExample(SupervisionExample example);

    int updateByExampleSelective(@Param("record") Supervision record, @Param("example") SupervisionExample example);

    int updateByExample(@Param("record") Supervision record, @Param("example") SupervisionExample example);
}