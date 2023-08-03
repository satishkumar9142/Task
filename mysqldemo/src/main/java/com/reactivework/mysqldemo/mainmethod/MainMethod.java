package com.reactivework.mysqldemo.mainmethod;

import com.reactivework.mysqldemo.cassandradatabase.UtilForCassandra;
import com.reactivework.mysqldemo.csvreaderpackage.DeliveryCSVReader;


import com.reactivework.mysqldemo.csvreaderpackage.MatchCSVReader;
import com.reactivework.mysqldemo.datareadfrommysql.readDeliveries;
import com.reactivework.mysqldemo.datareadfrommysql.readmatches;
import com.reactivework.mysqldemo.modelpackage.Match;
import com.reactivework.mysqldemo.mysqlexception.MysqlException;
import com.reactivework.mysqldemo.readandwritethroughconnectionpool.ReadmatchesThrouhConncectionPool;

public class MainMethod {
	public static void main(String[] args) throws MysqlException  {

//		MatchCSVReader csv = new MatchCSVReader();
//		csv.getAllDataOfMatches();
		
//		DeliveryCSVReader dcsv = new DeliveryCSVReader();
//		dcsv.getAllDataOfDeliveries();
		
//		readmatches.ReadDataFromMySql();
		
//		readDeliveries.ReadDataFromMySql();
		
//		ReadmatchesThrouhConncectionPool read = new ReadmatchesThrouhConncectionPool();
//		read.ReadMatch();
		
		UtilForCassandra util = new UtilForCassandra();
		util.connect("localhost", 9042);
		
		final String createmoviekeySpace = "CREATE KEYSPACE IF NOT EXISTS movies_keyspace WITH "
				+ "replication = {'class' : 'SimpleStrategy','replication_factor' :3}";
	}
}