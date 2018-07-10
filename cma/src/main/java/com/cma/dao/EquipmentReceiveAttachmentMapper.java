package com.cma.dao;

import com.cma.dao.example.EquipmentReceiveAttachmentExample;
import com.cma.pojo.EquipmentReceiveAttachment;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentReceiveAttachmentMapper extends GeneralMapper<EquipmentReceiveAttachment> {
    long countByExample(EquipmentReceiveAttachmentExample example);

    int deleteByExample(EquipmentReceiveAttachmentExample example);

    List<EquipmentReceiveAttachment> selectByExample(EquipmentReceiveAttachmentExample example);

    int updateByExampleSelective(@Param("record") EquipmentReceiveAttachment record, @Param("example") EquipmentReceiveAttachmentExample example);

    int updateByExample(@Param("record") EquipmentReceiveAttachment record, @Param("example") EquipmentReceiveAttachmentExample example);
}