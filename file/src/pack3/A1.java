package pack3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class A1 {
	public static void main(String[] args) {
		
	   try {
            // Load XML input and XSLT stylesheet
            
            File xmlInputFile = new File("S:\\xml\\xsl\\SearchQuest.xml");      //input.xml
            File xsltStylesheetFile = new File("S:\\xml\\xsl\\searchQuest.xsl");//transform.xsl

            // Create a TransformerFactory
            TransformerFactory factory = TransformerFactory.newInstance();

            // Create a Transformer from the XSLT stylesheet
            Transformer transformer = factory.newTransformer(new StreamSource(xsltStylesheetFile));

            // Perform the transformation
            transformer.transform(new StreamSource(xmlInputFile), new StreamResult(new File("output.xml")));

            System.out.println("HTML output generated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } 
		
	/*	try {
	        TransformerFactory tFactory=TransformerFactory.newInstance();
        
	        Source xslDoc = new StreamSource("S:\\xml\\xsl\\XmlRequest.xml");
	        Source xmlDoc = new StreamSource("S:\\xml\\xsl\\xmlresponse.xsl");
        
	        String outputFileName = "CompanyInfo.txt";
        
	        OutputStream htmlFile = new FileOutputStream(outputFileName);
	        Transformer trasform = tFactory.newTransformer(xslDoc);
	        trasform.transform(xmlDoc, new StreamResult(htmlFile));
	    }
	    catch (FileNotFoundException e) 
	    {
	        e.printStackTrace();
	    }
	    catch (TransformerConfigurationException e) 
	    {
	        e.printStackTrace();
	    }
	    catch (TransformerFactoryConfigurationError e) 
	    {
	        e.printStackTrace();
	    }
	    catch (TransformerException e) 
	    {
	        e.printStackTrace();
	    } */
    }
}
//  