package org.example.first;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2017-01-24T14:16:24.634+02:00
 * Generated source version: 3.1.9
 * 
 */
@WebServiceClient(name = "FirstService", 
                  wsdlLocation = "file:/C:/dev/project/tests/soap_server/soap_https_spring_boot_two_endpoints/src/main/webapp/WEB-INF/wsdl/First.wsdl",
                  targetNamespace = "http://www.example.org/first/") 
public class FirstService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/first/", "FirstService");
    public final static QName FirstServicePort = new QName("http://www.example.org/first/", "FirstServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/dev/project/tests/soap_server/soap_https_spring_boot_two_endpoints/src/main/webapp/WEB-INF/wsdl/First.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FirstService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/dev/project/tests/soap_server/soap_https_spring_boot_two_endpoints/src/main/webapp/WEB-INF/wsdl/First.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FirstService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FirstService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FirstService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public FirstService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FirstService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FirstService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns FirstServicePortType
     */
    @WebEndpoint(name = "FirstServicePort")
    public FirstServicePortType getFirstServicePort() {
        return super.getPort(FirstServicePort, FirstServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FirstServicePortType
     */
    @WebEndpoint(name = "FirstServicePort")
    public FirstServicePortType getFirstServicePort(WebServiceFeature... features) {
        return super.getPort(FirstServicePort, FirstServicePortType.class, features);
    }

}
