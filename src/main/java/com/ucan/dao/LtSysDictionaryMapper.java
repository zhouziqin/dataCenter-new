package com.ucan.dao;

import com.ucan.model.LtSysDictionary;
import com.ucan.model.LtSysDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LtSysDictionaryMapper {
    int countByExample(LtSysDictionaryExample example);

    int deleteByExample(LtSysDictionaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LtSysDictionary record);

    int insertSelective(LtSysDictionary record);

    List<LtSysDictionary> selectByExample(LtSysDictionaryExample example);

    LtSysDictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LtSysDictionary record, @Param("example") LtSysDictionaryExample example);

    int updateByExample(@Param("record") LtSysDictionary record, @Param("example") LtSysDictionaryExample example);

    int updateByPrimaryKeySelective(LtSysDictionary record);

    int updateByPrimaryKey(LtSysDictionary record);
}