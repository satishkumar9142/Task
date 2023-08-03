package com.reactiveworks.mainmethod;

import javax.xml.bind.JAXBException;

import com.reactiveworks.util.Marshalling;
import com.reactiveworks.util.UnMarshalling;

public class MainMethod {
	public static void main(String[] args) throws JAXBException {
		
		Marshalling marshller = new Marshalling();
		 marshller.javaObjTOXml();
		
		UnMarshalling unmashaller = new UnMarshalling();
		unmashaller.jaxbXmlFileToObject();
	}
}
