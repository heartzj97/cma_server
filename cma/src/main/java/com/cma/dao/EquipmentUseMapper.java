package com.cma.dao;

import com.cma.dao.example.EquipmentUseExample;
import com.cma.pojo.EquipmentUse;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentUseMapper extends GeneralMapper<EquipmentUse> {
    long countByExample(EquipmentUseExample example);

    int deleteByExample(EquipmentUseExample example);

    List<EquipmentUse> selectByExample(EquipmentUseExample example);

    int updateByExampleSelective(@Param("record") EquipmentUse record, @Param("example") EquipmentUseExample example);

    int updateByExample(@Param("record") EquipmentUse record, @Param("example") EquipmentUseExample example);
}