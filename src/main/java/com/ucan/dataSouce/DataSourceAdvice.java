/*package com.ucan.dataSouce;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import com.ucan.service.impl.CallsServiceImpl;
import com.ucan.service.impl.LtSysDictionaryServiceImpl;

//@Slf4j
@Aspect
@Component
public class DataSourceAdvice {

	 	@Around("execution(* com.ucan.service.*.*(..))")
	    public Object doAround(ProceedingJoinPoint jp) throws Throwable {
		 System.out.println("DataSourceAdvice start ..");
		 	
	        if (jp.getTarget() instanceof CallsServiceImpl) {
	        	CustomerContextHolder.setDataSource(CustomerContextHolder.getSqlServerDataSource());
	        } else if (jp.getTarget() instanceof LtSysDictionaryServiceImpl) {
	        	CustomerContextHolder.setDataSource(CustomerContextHolder.getOracleDataSource());
	        }
		 	 System.out.println("DataSourceAdvice end ..");
	        return jp.proceed();
	    }
	 	@Before("execution(* com.ucan.service.*.*(..))")
	 	 public void dynamicSetDataSoruce(JoinPoint joinPoint) throws Exception {
	        Class<?> clazz = joinPoint.getTarget().getClass();

	        String className = clazz.getName();
	        System.out.println("1----- className==="+className);
	        if (ClassUtils.isAssignable(clazz, Proxy.class)) {
	            className = joinPoint.getSignature().getDeclaringTypeName();
	        }
	        System.out.println("2----- className==="+className);
	        String methodName = joinPoint.getSignature().getName();
	        System.out.println("methodName==="+methodName);
	        Object[] arguments = joinPoint.getArgs();
	        System.out.println("arguments=="+arguments.toString());
	        if(methodName.equals("selectByPrimaryKey")){
	        	CustomerContextHolder.setDataSource(CustomerContextHolder.getOracleDataSource());
	        }else{
	        	CustomerContextHolder.setDataSource(CustomerContextHolder.getSqlServerDataSource());
	        }
	        
	 	}
	 
}
*/