package com.reactiveworks.r2dbc.services;

import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.r2dbc.connection.ConnectionDataBase;

import io.r2dbc.spi.Connection;
import reactor.core.publisher.Mono;

public class CRUD {

	private static Logger log = LogManager.getLogger(CRUD.class);
	public void Create() throws FileNotFoundException {
		ConnectionDataBase conn = new  ConnectionDataBase();
		Mono<Connection> connectionMono = Mono.from(conn.getConnection().create());
		String createSql = 
				"CREATE TABLE Employee2my (" + 
						"id SERIAL PRIMARY KEY,"+
						"first_name VARCHAR(255),"+
						"last_name VARCHAR(255)," +
						"age INTEGER)";

		connectionMono.flatMapMany(connection -> connection.createStatement(createSql).execute()).blockLast();
	}

	public void Insert() throws FileNotFoundException {
		ConnectionDataBase conn = new  ConnectionDataBase();
		Mono<Connection> connectionMono = Mono.from(conn.getConnection().create());
		String insertSql = 
				"INSERT INTO Employee2my(first_name, last_name, age)"+
						"VALUES" +
						"('Hello', 'Kitty', 20)," +
						"('Hantsy', 'Bai', 40)";

		connectionMono.flatMapMany(connection -> connection.createStatement(insertSql).execute()).blockLast();
	}


	public void Update() throws FileNotFoundException {
		ConnectionDataBase conn = new  ConnectionDataBase();
		Mono<Connection> connectionMono = Mono.from(conn.getConnection().create());
		String updateSql = 
				" Update Employee2my set first_name = 'Hi' where id =1;";

		connectionMono.flatMapMany(connection -> connection.createStatement(updateSql).execute()).blockLast();
	}

	public void Delete() throws FileNotFoundException {

		ConnectionDataBase conn = new  ConnectionDataBase();
		Mono<Connection> connectionMono = Mono.from(conn.getConnection().create());

		String updateSql = 
				" Delete from Employee2my where id =1;";

		connectionMono.flatMapMany(connection -> connection.createStatement(updateSql).execute()).blockLast();
	}

	public void Read() throws FileNotFoundException {
		ConnectionDataBase conn = new  ConnectionDataBase();
		Mono<Connection> connectionMono = Mono.from(conn.getConnection().create());
		connectionMono.flatMapMany(connection -> connection.createStatement("select * from Employee2my").execute())
		.flatMap(result -> result.map((row, rowMetadata) -> {
			return "ID: " + row.get("id") + ", Name: " + row.get("first_Name") + ", age: " + row.get("age");
		})).doOnNext(log::info).blockLast();
	}
}
