
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
 *         &lt;element name="getRouteTotalsResult" type="{http://webservices.maplink2.com.br}RouteTotals"/>
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
    "getRouteTotalsResult"
})
@XmlRootElement(name = "getRouteTotalsResponse")
public class GetRouteTotalsResponse {

    @XmlElement(required = true)
    protected RouteTotals getRouteTotalsResult;

    /**
     * Obtém o valor da propriedade getRouteTotalsResult.
     * 
     * @return
     *     possible object is
     *     {@link RouteTotals }
     *     
     */
    public RouteTotals getGetRouteTotalsResult() {
        return getRouteTotalsResult;
    }

    /**
     * Define o valor da propriedade getRouteTotalsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteTotals }
     *     
     */
    public void setGetRouteTotalsResult(RouteTotals value) {
        this.getRouteTotalsResult = value;
    }

}
