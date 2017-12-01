package com.ucan.dao;

import com.ucan.model.Calls;
import com.ucan.model.CallsExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallsMapper {
    int countByExample(CallsExample example);

    int deleteByExample(CallsExample example);

    int deleteByPrimaryKey(BigDecimal inum);

    int insert(Calls record);

    int insertSelective(Calls record);

    List<Calls> selectByExample(CallsExample example);

    Calls selectByPrimaryKey(BigDecimal inum);

    int updateByExampleSelective(@Param("record") Calls record, @Param("example") CallsExample example);

    int updateByExample(@Param("record") Calls record, @Param("example") CallsExample example);

    int updateByPrimaryKeySelective(Calls record);

    int updateByPrimaryKey(Calls record);
    
    public  List<Calls> getAll();
}