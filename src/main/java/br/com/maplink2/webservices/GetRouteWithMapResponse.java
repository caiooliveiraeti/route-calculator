
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
 *         &lt;element name="getRouteWithMapResult" type="{http://webservices.maplink2.com.br}RouteInfo"/>
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
    "getRouteWithMapResult"
})
@XmlRootElement(name = "getRouteWithMapResponse")
public class GetRouteWithMapResponse {

    @XmlElement(required = true)
    protected RouteInfo getRouteWithMapResult;

    /**
     * Obtém o valor da propriedade getRouteWithMapResult.
     * 
     * @return
     *     possible object is
     *     {@link RouteInfo }
     *     
     */
    public RouteInfo getGetRouteWithMapResult() {
        return getRouteWithMapResult;
    }

    /**
     * Define o valor da propriedade getRouteWithMapResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInfo }
     *     
     */
    public void setGetRouteWithMapResult(RouteInfo value) {
        this.getRouteWithMapResult = value;
    }

}
