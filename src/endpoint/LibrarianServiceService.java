
package endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LibrarianServiceService", targetNamespace = "http://endpoint/", wsdlLocation = "http://127.0.0.1:8888/lib?wsdl")
public class LibrarianServiceService
    extends Service
{

    private final static URL LIBRARIANSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException LIBRARIANSERVICESERVICE_EXCEPTION;
    private final static QName LIBRARIANSERVICESERVICE_QNAME = new QName("http://endpoint/", "LibrarianServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:8888/lib?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LIBRARIANSERVICESERVICE_WSDL_LOCATION = url;
        LIBRARIANSERVICESERVICE_EXCEPTION = e;
    }

    public LibrarianServiceService() {
        super(__getWsdlLocation(), LIBRARIANSERVICESERVICE_QNAME);
    }

    public LibrarianServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), LIBRARIANSERVICESERVICE_QNAME, features);
    }

    public LibrarianServiceService(URL wsdlLocation) {
        super(wsdlLocation, LIBRARIANSERVICESERVICE_QNAME);
    }

    public LibrarianServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LIBRARIANSERVICESERVICE_QNAME, features);
    }

    public LibrarianServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibrarianServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ILibrarianService
     */
    @WebEndpoint(name = "LibrarianServicePort")
    public ILibrarianService getLibrarianServicePort() {
        return super.getPort(new QName("http://endpoint/", "LibrarianServicePort"), ILibrarianService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ILibrarianService
     */
    @WebEndpoint(name = "LibrarianServicePort")
    public ILibrarianService getLibrarianServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint/", "LibrarianServicePort"), ILibrarianService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LIBRARIANSERVICESERVICE_EXCEPTION!= null) {
            throw LIBRARIANSERVICESERVICE_EXCEPTION;
        }
        return LIBRARIANSERVICESERVICE_WSDL_LOCATION;
    }

}
