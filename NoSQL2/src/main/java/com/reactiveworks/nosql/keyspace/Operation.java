package com.reactiveworks.nosql.keyspace;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.reactiveworks.nosql.cassandradatabase.CassandraConnection;


public class Operation {
	private static Logger log = LogManager.getLogger(Operation.class);
	
	CassandraConnection conn = new CassandraConnection();
	public Operation() {
		
		conn.connectdb("localhost", 9042);
	}
	public void CreateKeySpace() {
		try {
			final String createmovieKeySpace = "CREATE KEYSPACE IF NOT EXISTS movies_keyspace WITH "
					+ "replication = {'class' : 'SimpleStrategy','replication_factor' :3}";	
			conn.getSession().execute(createmovieKeySpace);
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	} 
	public void CreateTable() {
		try {
			final String createtable = "CREATE TABLE IF NOT EXISTS movies_keyspace.movies"
					+ "(title varchar, year int, description varchar,rating varchar, PRIMARY KEY (title, year))";	
			conn.getSession().execute(createtable);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}   
	public void InsertData() {
		try {
			final String insertQuery = "INSERT INTO movies_keyspace.movies (title,year,description,rating) Values(?,?,?,?)";	
			PreparedStatement psInsert = conn.getSession().prepare(insertQuery);
//			BoundStatement bsInsert = psInsert.bind("Chasing Liberty", 2004, "Romance", "5.0");
//			BoundStatement bsInsert = psInsert.bind("Fast Five", 2012, "Action", "6.0");
			BoundStatement bsInsert = psInsert.bind("Annabelle", 2019, "Horror", "4.5");

			conn.getSession().execute(bsInsert);
			
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void UpdateData() {
		try {
			final String updateQuery = "UPDATE movies_keyspace.movies SET rating= ? WHERE tittle = ? AND year = ?";
			
			PreparedStatement psUpdate = conn.getSession().prepare(updateQuery);
			BoundStatement bsUpdate = psUpdate.bind("10.0","Annabelle",2019);
			conn.getSession().execute(bsUpdate);
			
			conn.close(); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} 
	public void SearchData() {
		try {
			final String selectQuery = "SELECT * FROM movies_keyspace.movies WHERE title= ? AND year = ?";
			
			PreparedStatement psSelect = conn.getSession().prepare(selectQuery);
			BoundStatement bsSelect = psSelect.bind("Annabelle",2019);
			ResultSet rs = conn.getSession().execute(bsSelect);
			 
		 	rs.forEach(r -> { 
				log.info("movie name : " + r.getString("title"));
				log.info("movie desc : " + r.getString("descreiption"));
				log.info("rating : " + r.getString("rating"));
			});
	
//			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
