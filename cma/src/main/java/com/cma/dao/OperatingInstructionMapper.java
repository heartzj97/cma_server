package com.cma.dao;

import com.cma.dao.example.OperatingInstructionExample;
import com.cma.pojo.OperatingInstruction;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatingInstructionMapper extends GeneralMapper<OperatingInstruction> {
    long countByExample(OperatingInstructionExample example);

    int deleteByExample(OperatingInstructionExample example);

    List<OperatingInstruction> selectByExample(OperatingInstructionExample example);

    int updateByExampleSelective(@Param("record") OperatingInstruction record, @Param("example") OperatingInstructionExample example);

    int updateByExample(@Param("record") OperatingInstruction record, @Param("example") OperatingInstructionExample example);
}