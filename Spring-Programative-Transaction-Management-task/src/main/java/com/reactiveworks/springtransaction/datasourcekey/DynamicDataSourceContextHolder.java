package com.reactiveworks.springtransaction.datasourcekey;


public class DynamicDataSourceContextHolder {

	private static ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	
 
	public static void setDataSourceKey(String dataSourceKey) {
        contextHolder.set(dataSourceKey);
    }

    public static String getDataSourceKey() {
        return contextHolder.get();
    }

    public static void clearDataSourceKey() {
        contextHolder.remove();
    }
}
