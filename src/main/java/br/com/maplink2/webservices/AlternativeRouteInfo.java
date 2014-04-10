
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AlternativeRouteInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AlternativeRouteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mainRoute" type="{http://webservices.maplink2.com.br}RouteInfo"/>
 *         &lt;element name="alternatives" type="{http://webservices.maplink2.com.br}ArrayOfRouteInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeRouteInfo", propOrder = {
    "mainRoute",
    "alternatives"
})
public class AlternativeRouteInfo {

    @XmlElement(required = true)
    protected RouteInfo mainRoute;
    protected ArrayOfRouteInfo alternatives;

    /**
     * Obtém o valor da propriedade mainRoute.
     * 
     * @return
     *     possible object is
     *     {@link RouteInfo }
     *     
     */
    public RouteInfo getMainRoute() {
        return mainRoute;
    }

    /**
     * Define o valor da propriedade mainRoute.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInfo }
     *     
     */
    public void setMainRoute(RouteInfo value) {
        this.mainRoute = value;
    }

    /**
     * Obtém o valor da propriedade alternatives.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteInfo }
     *     
     */
    public ArrayOfRouteInfo getAlternatives() {
        return alternatives;
    }

    /**
     * Define o valor da propriedade alternatives.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteInfo }
     *     
     */
    public void setAlternatives(ArrayOfRouteInfo value) {
        this.alternatives = value;
    }

}
