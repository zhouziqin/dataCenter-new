package com.ucan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ucan.model.LtSysDictionary;
import com.ucan.service.CallsService;
import com.ucan.service.LtSysDictionaryService;

public class ceshi {
	  public static void main(String[] args) {
	        //初始化ApplicationContext
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");

	        LtSysDictionaryService ltSysDictionaryService = applicationContext.getBean(LtSysDictionaryService.class);
	        CallsService sqlServerMapper = applicationContext.getBean(CallsService.class);
	        
	        //设置数据源为MySql,使用了AOP测试时请将下面这行注释
	       // MultipleDataSource.setDataSourceKey("mySqlDataSource");
	        LtSysDictionary l= ltSysDictionaryService.selectByPrimaryKey(1);
	        System.out.println(l.getName());
	        //设置数据源为SqlServer,使用AOP测试时请将下面这行注释
	       // MultipleDataSource.setDataSourceKey("sqlServerDataSource");
//	       System.out.println( sqlServerMapper.listCalls().size());
	    }
}
