package com.reactiveworks.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.model.Employee;

public class Marshalling {
	private static final Logger log = LogManager.getLogger(Marshalling.class);
	public void javaObjTOXml() throws JAXBException {
		Employee employee = new Employee();
		employee.setEmpNo(301);
		employee.setName("rama");
		employee.setSalary(23000.0);
	
	// create JAXBContext object, to create JAXBContext object we can newInstance method.
		
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		
	// Create Marshaller object from  JaxBContext	
		Marshaller marshaller = context.createMarshaller();
		
	// call marshal from marshaller object	
		
	// marshaller.marshal(employee, System.out);
		
		File  file = new File("emp.xml");
		marshaller.marshal(employee,file);
		log.info("done");
	}
}
