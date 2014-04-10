
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getRouteDescriptionResult" type="{http://webservices.maplink2.com.br}ArrayOfSegmentDescription" minOccurs="0"/>
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
    "getRouteDescriptionResult"
})
@XmlRootElement(name = "getRouteDescriptionResponse")
public class GetRouteDescriptionResponse {

    protected ArrayOfSegmentDescription getRouteDescriptionResult;

    /**
     * Obtém o valor da propriedade getRouteDescriptionResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public ArrayOfSegmentDescription getGetRouteDescriptionResult() {
        return getRouteDescriptionResult;
    }

    /**
     * Define o valor da propriedade getRouteDescriptionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSegmentDescription }
     *     
     */
    public void setGetRouteDescriptionResult(ArrayOfSegmentDescription value) {
        this.getRouteDescriptionResult = value;
    }

}
