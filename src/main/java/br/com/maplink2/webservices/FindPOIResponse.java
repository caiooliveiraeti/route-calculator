
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
 *         &lt;element name="findPOIResult" type="{http://webservices.maplink2.com.br}POIInfo"/>
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
    "findPOIResult"
})
@XmlRootElement(name = "findPOIResponse")
public class FindPOIResponse {

    @XmlElement(required = true)
    protected POIInfo findPOIResult;

    /**
     * Obtém o valor da propriedade findPOIResult.
     * 
     * @return
     *     possible object is
     *     {@link POIInfo }
     *     
     */
    public POIInfo getFindPOIResult() {
        return findPOIResult;
    }

    /**
     * Define o valor da propriedade findPOIResult.
     * 
     * @param value
     *     allowed object is
     *     {@link POIInfo }
     *     
     */
    public void setFindPOIResult(POIInfo value) {
        this.findPOIResult = value;
    }

}
