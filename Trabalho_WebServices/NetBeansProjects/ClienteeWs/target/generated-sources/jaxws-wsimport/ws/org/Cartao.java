
package ws.org;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cartao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cartao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cartao", propOrder = {
    "c"
})
public class Cartao {

    protected String c;

    /**
     * Obtém o valor da propriedade c.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC() {
        return c;
    }

    /**
     * Define o valor da propriedade c.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC(String value) {
        this.c = value;
    }

}
