package com.reactivework.cityexercise.cityservicespackage;

import java.util.List;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.reactivework.cityexercise.citymodelclasspackage.City;
import com.reactivework.cityexercise.cityutilpackage.CassandraConnection;

public class Cassandra_CRUD_Services {
	CassandraConnection conn = new CassandraConnection();
	public Cassandra_CRUD_Services() {
		conn.connectdb("localhost", 9042);
	}
	public void CreateKeySpace() {
		try {
			final String createmovieKeySpace = "CREATE KEYSPACE IF NOT EXISTS CityExercise_keySpace WITH "
					+ "replication = {'class' : 'SimpleStrategy','replication_factor' :3}";	
			conn.getSession().execute(createmovieKeySpace);
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
	public void CreateTable() {
		try {
			final String createtable = "CREATE TABLE IF NOT EXISTS CityExercise_keySpace.CityExercise"
					+ "(Id INT PRIMARY KEY, Name varchar, Country_Code varchar,city varchar,population BIGINT)";	
			conn.getSession().execute(createtable);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void InsertData(List<City> data) {
		try {
			final String insertQuery = "INSERT INTO CityExercise_keySpace.CityExercise(Id,Name,Country_Code,city,population) Values(?,?,?,?,?)";	
			PreparedStatement psInsert = conn.getSession().prepare(insertQuery);
			for(City city : data) {
				BoundStatement bsInsert = psInsert.bind(city.getId(), city.getName(), city.getCouCode(), city.getCity(),city.getPopulation());
				conn.getSession().execute(bsInsert);
			}
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
/*	public void UpdateData() {
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
	} */
	

}
