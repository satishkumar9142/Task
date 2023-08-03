
package com.reactiveworks.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.reactiveworks.cxf package. 
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

    private final static QName _GetAddResponse_QNAME = new QName("http://cxf.reactiveworks.com/", "getAddResponse");
    private final static QName _GetAdd_QNAME = new QName("http://cxf.reactiveworks.com/", "getAdd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAdd }
     * 
     */
    public GetAdd createGetAdd() {
        return new GetAdd();
    }

    /**
     * Create an instance of {@link GetAddResponse }
     * 
     */
    public GetAddResponse createGetAddResponse() {
        return new GetAddResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.reactiveworks.com/", name = "getAddResponse")
    public JAXBElement<GetAddResponse> createGetAddResponse(GetAddResponse value) {
        return new JAXBElement<GetAddResponse>(_GetAddResponse_QNAME, GetAddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.reactiveworks.com/", name = "getAdd")
    public JAXBElement<GetAdd> createGetAdd(GetAdd value) {
        return new JAXBElement<GetAdd>(_GetAdd_QNAME, GetAdd.class, null, value);
    }

}
