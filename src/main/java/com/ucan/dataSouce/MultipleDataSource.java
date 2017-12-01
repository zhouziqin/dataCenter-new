package com.ucan.dataSouce;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource{
	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		System.out.println("CustomerContextHolder.getDataSource()=="+CustomerContextHolder.getDataSource());
		return CustomerContextHolder.getDataSource();
	}
	
	/*public Connection getDataSource(){
		return dataSource.getConnection();
	}*/
}
