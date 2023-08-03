
package com.reactiveworks.client;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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

    private final static QName _NewOperationResponse_QNAME = new QName("http://services.reactiveworks.com/", "newOperationResponse");
    private final static QName _NewOperation_QNAME = new QName("http://services.reactiveworks.com/", "newOperation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.reactiveworks.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NewOperationResponse }
     * 
     */
    public NewOperationResponse createNewOperationResponse() {
        return new NewOperationResponse();
    }

    /**
     * Create an instance of {@link NewOperation }
     * 
     */
    public NewOperation createNewOperation() {
        return new NewOperation();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link NewOperationResponse.Return }
     * 
     */
    public NewOperationResponse.Return createNewOperationResponseReturn() {
        return new NewOperationResponse.Return();
    }

    /**
     * Create an instance of {@link NewOperation.Arg0 }
     * 
     */
    public NewOperation.Arg0 createNewOperationArg0() {
        return new NewOperation.Arg0();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.reactiveworks.com/", name = "newOperationResponse")
    public JAXBElement<NewOperationResponse> createNewOperationResponse(NewOperationResponse value) {
        return new JAXBElement<NewOperationResponse>(_NewOperationResponse_QNAME, NewOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.reactiveworks.com/", name = "newOperation")
    public JAXBElement<NewOperation> createNewOperation(NewOperation value) {
        return new JAXBElement<NewOperation>(_NewOperation_QNAME, NewOperation.class, null, value);
    }

}
