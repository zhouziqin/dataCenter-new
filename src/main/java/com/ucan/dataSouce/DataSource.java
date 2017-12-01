package com.ucan.dataSouce;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
	  String sourceName() default DataSource.oracle;
	  public static String oracle = "dataSource_oracle";
	  public static String sqlServer = "dataSource_sqlserver";
	 
}
