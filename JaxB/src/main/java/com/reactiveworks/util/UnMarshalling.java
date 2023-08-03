package com.reactiveworks.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.model.Employee1;

public class UnMarshalling {
	private static final Logger log = LogManager.getLogger(Marshalling.class);

	public  void jaxbXmlFileToObject() {
	     
	    File xmlFile = new File("src//main//resources//employee.xml");
	     
	    JAXBContext jaxbContext;
	    try
	    {
	      jaxbContext = JAXBContext.newInstance(Employee1.class);
	      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	       
	      Employee1 employee = (Employee1) jaxbUnmarshaller.unmarshal(xmlFile);
	       
	     log.info(employee);
	    }
	    catch (JAXBException e) 
	    {
	      e.printStackTrace();
	    }
	  }

}
