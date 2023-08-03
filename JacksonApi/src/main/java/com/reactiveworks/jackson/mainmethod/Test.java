package com.reactiveworks.jackson.mainmethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.jackson.model.Employee;
import com.reactiveworks.jackson.util.JsonUtil;

public class Test {
	private static Logger log = LogManager.getLogger(Test.class);
	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.setEmpNo(201);
		emp.setName("rama");
		emp.setSalary(2000000);
		
		String jsonEmployee = JsonUtil.convertJavaToJson(emp);
		log.info(jsonEmployee);
		
		
		Employee emp1 = JsonUtil.convertJsonToJava(jsonEmployee, Employee.class);
		log.info(emp1.getName()+ ","+ emp1.getEmpNo() + "," + emp1.getSalary() );
	}
	

}
