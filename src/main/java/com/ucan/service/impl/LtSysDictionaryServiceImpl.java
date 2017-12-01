package com.ucan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ucan.dao.LtSysDictionaryMapper;
import com.ucan.dataSouce.DataSource;
import com.ucan.model.LtSysDictionary;
import com.ucan.service.LtSysDictionaryService;
@Service
@DataSource(sourceName="sqlServerDataSource")
public class LtSysDictionaryServiceImpl implements LtSysDictionaryService{
	@Autowired
	private LtSysDictionaryMapper ltSysDictionaryMapper;
	@Override
	@DataSource(sourceName="oracleDataSource")
	public LtSysDictionary selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return ltSysDictionaryMapper.selectByPrimaryKey(id);
	}

}
