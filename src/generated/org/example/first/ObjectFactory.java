
package org.example.first;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.first package. 
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

    private final static QName _FirstOperationRequest_QNAME = new QName("http://www.example.org/first/", "firstOperationRequest");
    private final static QName _FirstOperationResponse_QNAME = new QName("http://www.example.org/first/", "firstOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.first
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FirstOperationRequest }
     * 
     */
    public FirstOperationRequest createFirstOperationRequest() {
        return new FirstOperationRequest();
    }

    /**
     * Create an instance of {@link FirstOperationResponse }
     * 
     */
    public FirstOperationResponse createFirstOperationResponse() {
        return new FirstOperationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstOperationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/first/", name = "firstOperationRequest")
    public JAXBElement<FirstOperationRequest> createFirstOperationRequest(FirstOperationRequest value) {
        return new JAXBElement<FirstOperationRequest>(_FirstOperationRequest_QNAME, FirstOperationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/first/", name = "firstOperationResponse")
    public JAXBElement<FirstOperationResponse> createFirstOperationResponse(FirstOperationResponse value) {
        return new JAXBElement<FirstOperationResponse>(_FirstOperationResponse_QNAME, FirstOperationResponse.class, null, value);
    }

}
