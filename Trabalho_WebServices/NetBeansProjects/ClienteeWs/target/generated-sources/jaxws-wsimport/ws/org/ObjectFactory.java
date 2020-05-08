
package ws.org;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.org package. 
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

    private final static QName _Cartao_QNAME = new QName("http://org.ws/", "cartao");
    private final static QName _CartaoResponse_QNAME = new QName("http://org.ws/", "cartaoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.org
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cartao }
     * 
     */
    public Cartao createCartao() {
        return new Cartao();
    }

    /**
     * Create an instance of {@link CartaoResponse }
     * 
     */
    public CartaoResponse createCartaoResponse() {
        return new CartaoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cartao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "cartao")
    public JAXBElement<Cartao> createCartao(Cartao value) {
        return new JAXBElement<Cartao>(_Cartao_QNAME, Cartao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.ws/", name = "cartaoResponse")
    public JAXBElement<CartaoResponse> createCartaoResponse(CartaoResponse value) {
        return new JAXBElement<CartaoResponse>(_CartaoResponse_QNAME, CartaoResponse.class, null, value);
    }

}
