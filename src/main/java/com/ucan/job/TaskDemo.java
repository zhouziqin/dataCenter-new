package com.ucan.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ucan.service.CallsService;
import com.ucan.service.LtSysDictionaryService;

//@Component
@Service
public class TaskDemo {
	@Autowired
	private CallsService callsService;
	@Autowired
	private LtSysDictionaryService ltSysDictionaryService;
	public void  ceshi(){
		System.out.println("callsService=="+callsService.listCalls().size());
		System.out.println("ltSysDictionaryService=="+ltSysDictionaryService.selectByPrimaryKey(1).getName());
	}

}
