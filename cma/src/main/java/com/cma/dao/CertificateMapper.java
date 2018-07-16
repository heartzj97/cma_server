package com.cma.dao;

import com.cma.dao.example.CertificateExample;
import com.cma.pojo.Certificate;
import com.cma.util.GeneralMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CertificateMapper extends GeneralMapper<Certificate> {
    long countByExample(CertificateExample example);

    int deleteByExample(CertificateExample example);

    List<Certificate> selectByExample(CertificateExample example);

    int updateByExampleSelective(@Param("record") Certificate record, @Param("example") CertificateExample example);

    int updateByExample(@Param("record") Certificate record, @Param("example") CertificateExample example);
}