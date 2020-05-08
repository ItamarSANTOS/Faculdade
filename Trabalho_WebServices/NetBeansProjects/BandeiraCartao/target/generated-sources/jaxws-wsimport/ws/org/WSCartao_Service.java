
package ws.org;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSCartao", targetNamespace = "http://org.ws/", wsdlLocation = "http://localhost:8080/BandeiraCartao/WSCartao?WSDL")
public class WSCartao_Service
    extends Service
{

    private final static URL WSCARTAO_WSDL_LOCATION;
    private final static WebServiceException WSCARTAO_EXCEPTION;
    private final static QName WSCARTAO_QNAME = new QName("http://org.ws/", "WSCartao");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/BandeiraCartao/WSCartao?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCARTAO_WSDL_LOCATION = url;
        WSCARTAO_EXCEPTION = e;
    }

    public WSCartao_Service() {
        super(__getWsdlLocation(), WSCARTAO_QNAME);
    }

    public WSCartao_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCARTAO_QNAME, features);
    }

    public WSCartao_Service(URL wsdlLocation) {
        super(wsdlLocation, WSCARTAO_QNAME);
    }

    public WSCartao_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCARTAO_QNAME, features);
    }

    public WSCartao_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSCartao_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSCartao
     */
    @WebEndpoint(name = "WSCartaoPort")
    public WSCartao getWSCartaoPort() {
        return super.getPort(new QName("http://org.ws/", "WSCartaoPort"), WSCartao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSCartao
     */
    @WebEndpoint(name = "WSCartaoPort")
    public WSCartao getWSCartaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://org.ws/", "WSCartaoPort"), WSCartao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCARTAO_EXCEPTION!= null) {
            throw WSCARTAO_EXCEPTION;
        }
        return WSCARTAO_WSDL_LOCATION;
    }

}