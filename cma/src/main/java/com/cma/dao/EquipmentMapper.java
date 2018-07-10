package com.cma.dao;

import com.cma.dao.example.EquipmentExample;
import com.cma.pojo.Equipment;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMapper extends GeneralMapper<Equipment> {
    long countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    List<Equipment> selectByExample(EquipmentExample example);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);
}