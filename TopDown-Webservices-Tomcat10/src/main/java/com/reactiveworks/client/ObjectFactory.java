
package com.reactiveworks.client;



import javax.xml.namespace.QName;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reactiveworks.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCurrentTemperatureResponse_QNAME = new QName("http://services.reactiveworks.com/", "getCurrentTemperatureResponse");
    private final static QName _GetCurrentTemperature_QNAME = new QName("http://services.reactiveworks.com/", "getCurrentTemperature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrentTemperature }
     * 
     */
    public GetCurrentTemperature createGetCurrentTemperature() {
        return new GetCurrentTemperature();
    }

    /**
     * Create an instance of {@link GetCurrentTemperatureResponse }
     * 
     */
    public GetCurrentTemperatureResponse createGetCurrentTemperatureResponse() {
        return new GetCurrentTemperatureResponse();
    }

    /**
     * Create an instance of {@link GetCurrentTemperatureRq }
     * 
     */
    public GetCurrentTemperatureRq createGetCurrentTemperatureRq() {
        return new GetCurrentTemperatureRq();
    }

    /**
     * Create an instance of {@link GetCurrentTemperatureRs }
     * 
     */
    public GetCurrentTemperatureRs createGetCurrentTemperatureRs() {
        return new GetCurrentTemperatureRs();
    }

    /**
     * Create an instance of {@link GetCurrentTemperature.Arg0 }
     * 
     */
    public GetCurrentTemperature.Arg0 createGetCurrentTemperatureArg0() {
        return new GetCurrentTemperature.Arg0();
    }

    /**
     * Create an instance of {@link GetCurrentTemperatureResponse.Return }
     * 
     */
    public GetCurrentTemperatureResponse.Return createGetCurrentTemperatureResponseReturn() {
        return new GetCurrentTemperatureResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTemperatureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.reactiveworks.com/", name = "getCurrentTemperatureResponse")
    public JAXBElement<GetCurrentTemperatureResponse> createGetCurrentTemperatureResponse(GetCurrentTemperatureResponse value) {
        return new JAXBElement<GetCurrentTemperatureResponse>(_GetCurrentTemperatureResponse_QNAME, GetCurrentTemperatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTemperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.reactiveworks.com/", name = "getCurrentTemperature")
    public JAXBElement<GetCurrentTemperature> createGetCurrentTemperature(GetCurrentTemperature value) {
        return new JAXBElement<GetCurrentTemperature>(_GetCurrentTemperature_QNAME, GetCurrentTemperature.class, null, value);
    }

}
