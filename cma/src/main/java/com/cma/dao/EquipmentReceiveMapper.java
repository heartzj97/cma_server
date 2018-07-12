package com.cma.dao;

import com.cma.dao.example.EquipmentReceiveExample;
import com.cma.pojo.EquipmentReceive;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentReceiveMapper extends GeneralMapper<EquipmentReceive> {
    long countByExample(EquipmentReceiveExample example);

    int deleteByExample(EquipmentReceiveExample example);

    List<EquipmentReceive> selectByExample(EquipmentReceiveExample example);

    int updateByExampleSelective(@Param("record") EquipmentReceive record, @Param("example") EquipmentReceiveExample example);

    int updateByExample(@Param("record") EquipmentReceive record, @Param("example") EquipmentReceiveExample example);
}