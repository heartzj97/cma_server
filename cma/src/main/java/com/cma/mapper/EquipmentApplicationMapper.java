package com.cma.mapper;

import com.cma.pojo.EquipmentApplication;
import com.cma.pojo.EquipmentApplicationExample;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentApplicationMapper extends GeneralMapper<EquipmentApplication> {
    long countByExample(EquipmentApplicationExample example);

    int deleteByExample(EquipmentApplicationExample example);

    List<EquipmentApplication> selectByExample(EquipmentApplicationExample example);

    int updateByExampleSelective(@Param("record") EquipmentApplication record, @Param("example") EquipmentApplicationExample example);

    int updateByExample(@Param("record") EquipmentApplication record, @Param("example") EquipmentApplicationExample example);
}