package com.cma.mapper;

import com.cma.pojo.EquipmentMaintenance;
import com.cma.pojo.EquipmentMaintenanceExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentMaintenanceMapper extends GeneralMapper<EquipmentMaintenance> {
    long countByExample(EquipmentMaintenanceExample example);

    int deleteByExample(EquipmentMaintenanceExample example);

    List<EquipmentMaintenance> selectByExample(EquipmentMaintenanceExample example);

    int updateByExampleSelective(@Param("record") EquipmentMaintenance record, @Param("example") EquipmentMaintenanceExample example);

    int updateByExample(@Param("record") EquipmentMaintenance record, @Param("example") EquipmentMaintenanceExample example);
}