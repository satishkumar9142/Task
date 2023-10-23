package com.reactiveworks.springtransaction.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.reactiveworks.springtransaction.datasourcekey.DynamicDataSourceContextHolder;

public class DynamicDataSource extends AbstractRoutingDataSource {
	
	@Override
	protected Object determineCurrentLookupKey() {
		return DynamicDataSourceContextHolder.getDataSourceKey();
	}	
}
