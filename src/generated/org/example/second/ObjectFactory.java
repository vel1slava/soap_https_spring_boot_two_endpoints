
package org.example.second;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.second package. 
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

    private final static QName _SecondOperationRequest_QNAME = new QName("http://www.example.org/second/", "secondOperationRequest");
    private final static QName _SecondOperationResponse_QNAME = new QName("http://www.example.org/second/", "secondOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.second
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SecondOperationRequest }
     * 
     */
    public SecondOperationRequest createSecondOperationRequest() {
        return new SecondOperationRequest();
    }

    /**
     * Create an instance of {@link SecondOperationResponse }
     * 
     */
    public SecondOperationResponse createSecondOperationResponse() {
        return new SecondOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondOperationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/second/", name = "secondOperationRequest")
    public JAXBElement<SecondOperationRequest> createSecondOperationRequest(SecondOperationRequest value) {
        return new JAXBElement<SecondOperationRequest>(_SecondOperationRequest_QNAME, SecondOperationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/second/", name = "secondOperationResponse")
    public JAXBElement<SecondOperationResponse> createSecondOperationResponse(SecondOperationResponse value) {
        return new JAXBElement<SecondOperationResponse>(_SecondOperationResponse_QNAME, SecondOperationResponse.class, null, value);
    }

}
