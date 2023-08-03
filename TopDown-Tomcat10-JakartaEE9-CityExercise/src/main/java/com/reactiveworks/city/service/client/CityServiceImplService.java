
package com.reactiveworks.city.service.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CityServiceImplService", targetNamespace = "http://service.city.reactiveworks.com/", wsdlLocation = "http://localhost:9090/TopDown-Tomcat10-JakartaEE9-CityExercise/CityService?wsdl")
public class CityServiceImplService
    extends Service
{

    private final static URL CITYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CITYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CITYSERVICEIMPLSERVICE_QNAME = new QName("http://service.city.reactiveworks.com/", "CityServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/TopDown-Tomcat10-JakartaEE9-CityExercise/CityService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CITYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CITYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CityServiceImplService() {
        super(__getWsdlLocation(), CITYSERVICEIMPLSERVICE_QNAME);
    }

    public CityServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CITYSERVICEIMPLSERVICE_QNAME, features);
    }

    public CityServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CITYSERVICEIMPLSERVICE_QNAME);
    }

    public CityServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CITYSERVICEIMPLSERVICE_QNAME, features);
    }

    public CityServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CityServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CityServiceImpl
     */
    @WebEndpoint(name = "CityServiceImplPort")
    public CityServiceImpl getCityServiceImplPort() {
        return super.getPort(new QName("http://service.city.reactiveworks.com/", "CityServiceImplPort"), CityServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CityServiceImpl
     */
    @WebEndpoint(name = "CityServiceImplPort")
    public CityServiceImpl getCityServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.city.reactiveworks.com/", "CityServiceImplPort"), CityServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CITYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CITYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CITYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
