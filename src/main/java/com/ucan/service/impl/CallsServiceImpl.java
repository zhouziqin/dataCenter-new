package com.ucan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucan.dao.CallsMapper;
import com.ucan.dataSouce.DataSource;
import com.ucan.model.Calls;
import com.ucan.service.CallsService;
@Service
@DataSource(sourceName="sqlServerDataSource")
public class CallsServiceImpl implements CallsService{
	@Autowired
	private CallsMapper callsMapper;
	@Override
	public List<Calls> listCalls() {
		return callsMapper.getAll();
		// TODO Auto-generated method stub
//		System.out.println("listCalls 查询 size is 0");
//		return new ArrayList<Calls>();
	}

}
