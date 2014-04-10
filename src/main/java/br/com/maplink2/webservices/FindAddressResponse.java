
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="findAddressResult" type="{http://webservices.maplink2.com.br}AddressInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "findAddressResult"
})
@XmlRootElement(name = "findAddressResponse")
public class FindAddressResponse {

    @XmlElement(required = true)
    protected AddressInfo findAddressResult;

    /**
     * Obtém o valor da propriedade findAddressResult.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getFindAddressResult() {
        return findAddressResult;
    }

    /**
     * Define o valor da propriedade findAddressResult.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setFindAddressResult(AddressInfo value) {
        this.findAddressResult = value;
    }

}
