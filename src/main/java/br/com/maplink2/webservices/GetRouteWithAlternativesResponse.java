
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
 *         &lt;element name="getRouteWithAlternativesResult" type="{http://webservices.maplink2.com.br}AlternativeRouteInfo"/>
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
    "getRouteWithAlternativesResult"
})
@XmlRootElement(name = "getRouteWithAlternativesResponse")
public class GetRouteWithAlternativesResponse {

    @XmlElement(required = true)
    protected AlternativeRouteInfo getRouteWithAlternativesResult;

    /**
     * Obtém o valor da propriedade getRouteWithAlternativesResult.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeRouteInfo }
     *     
     */
    public AlternativeRouteInfo getGetRouteWithAlternativesResult() {
        return getRouteWithAlternativesResult;
    }

    /**
     * Define o valor da propriedade getRouteWithAlternativesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeRouteInfo }
     *     
     */
    public void setGetRouteWithAlternativesResult(AlternativeRouteInfo value) {
        this.getRouteWithAlternativesResult = value;
    }

}
