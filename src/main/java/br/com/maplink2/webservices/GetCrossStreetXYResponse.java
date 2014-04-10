
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
 *         &lt;element name="GetCrossStreetXYResult" type="{http://webservices.maplink2.com.br}ArrayOfCrossStreetLocation" minOccurs="0"/>
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
    "getCrossStreetXYResult"
})
@XmlRootElement(name = "GetCrossStreetXYResponse")
public class GetCrossStreetXYResponse {

    @XmlElement(name = "GetCrossStreetXYResult")
    protected ArrayOfCrossStreetLocation getCrossStreetXYResult;

    /**
     * Obtém o valor da propriedade getCrossStreetXYResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossStreetLocation }
     *     
     */
    public ArrayOfCrossStreetLocation getGetCrossStreetXYResult() {
        return getCrossStreetXYResult;
    }

    /**
     * Define o valor da propriedade getCrossStreetXYResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossStreetLocation }
     *     
     */
    public void setGetCrossStreetXYResult(ArrayOfCrossStreetLocation value) {
        this.getCrossStreetXYResult = value;
    }

}
