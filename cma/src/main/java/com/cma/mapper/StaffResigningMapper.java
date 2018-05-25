package com.cma.mapper;

import com.cma.pojo.StaffResigning;
import com.cma.pojo.StaffResigningExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffResigningMapper extends GeneralMapper<StaffResigning> {
    long countByExample(StaffResigningExample example);

    int deleteByExample(StaffResigningExample example);

    List<StaffResigning> selectByExample(StaffResigningExample example);

    int updateByExampleSelective(@Param("record") StaffResigning record, @Param("example") StaffResigningExample example);

    int updateByExample(@Param("record") StaffResigning record, @Param("example") StaffResigningExample example);
}