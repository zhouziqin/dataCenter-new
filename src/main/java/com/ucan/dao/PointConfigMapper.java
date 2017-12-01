package com.ucan.dao;

import com.ucan.model.PointConfig;
import com.ucan.model.PointConfigExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointConfigMapper {
    int countByExample(PointConfigExample example);

    int deleteByExample(PointConfigExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(PointConfig record);

    int insertSelective(PointConfig record);

    List<PointConfig> selectByExample(PointConfigExample example);

    PointConfig selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") PointConfig record, @Param("example") PointConfigExample example);

    int updateByExample(@Param("record") PointConfig record, @Param("example") PointConfigExample example);

    int updateByPrimaryKeySelective(PointConfig record);

    int updateByPrimaryKey(PointConfig record);
}