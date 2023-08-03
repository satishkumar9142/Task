package com.reactiveworks.gson.mainmethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.gson.model.Address;
import com.reactiveworks.gson.model.Employee;
import com.reactiveworks.gson.util.GsonD;

public class Test {
	private static Logger log = LogManager.getLogger(GsonD.class);

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("ramu");
		emp.setEmpNo(123);
		emp.setSalary(324524);
		Address add = new Address();
		add.setCity("lucknow");
		add.setState("UP");
		add.setStreet("xyz");
		add.setZipCode("123456");
		emp.setAddress(add);
		
		GsonD gson = new GsonD();
		String json = gson.getJson(emp);
		log.info(json);
		
		Employee emp1 = gson.getObje(json);
		log.info(emp1.getName());
		log.info(emp1.getEmpNo());
		log.info(emp1.getSalary());
		log.info(emp1.getAddress().getZipCode());
		
	}
}
