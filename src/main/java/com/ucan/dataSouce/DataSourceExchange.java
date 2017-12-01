package com.ucan.dataSouce;


import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceExchange implements MethodInterceptor{
	
	private static Logger logger=LoggerFactory.getLogger(DataSourceExchange.class);
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {Class<?> clazz=invocation.getThis().getClass();
			// 默认使用类型注解
			 if (clazz.isAnnotationPresent(DataSource.class)) {
			     DataSource dataSource = clazz.getAnnotation(DataSource.class);
			     CustomerContextHolder.setDataSource(dataSource.sourceName());
			     logger.info("默认使用类型注解 ,dataSource：{}",dataSource.sourceName());
			 }
			 // 方法注解可以覆盖类型注解
			 Method m = invocation.getMethod();
	          if (m != null && m.isAnnotationPresent(DataSource.class)) {
	             DataSource dataSource = m.getAnnotation(DataSource.class);
	              CustomerContextHolder.setDataSource(dataSource.sourceName());
	              logger.info("方法注解 ,dataSource：{}",dataSource.sourceName());
	          }
			
			return invocation.proceed();
		} catch (Exception ex) {
			logger.info("拦截报错",ex);
		}
		return null;
	}

}
