package com.reactiveworks.xml.response;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlResponse {
	public static void main(String[] args) {
		  try {
			  // Load XML input and XSLT stylesheet
	          File xmlInputFile = new File("src\\main\\resources\\SearchQuest.xml");       //input.xml
	          File xsltStylesheetFile = new File("src\\main\\resources\\searchQuest.xsl"); //transform.xsl

	          // Create a TransformerFactory
	          TransformerFactory factory = TransformerFactory.newInstance();

	          // Create a Transformer from the XSLT stylesheet
	          Transformer transformer = factory.newTransformer(new StreamSource(xsltStylesheetFile));

	            // Perform the transformation
	          transformer.transform(new StreamSource(xmlInputFile), new StreamResult(new File("output.xml")));

	          System.out.println("XML output generated successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	     } 
	}
}
