
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
 *         &lt;element name="getMultiRouteResult" type="{http://webservices.maplink2.com.br}MultiRoute"/>
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
    "getMultiRouteResult"
})
@XmlRootElement(name = "getMultiRouteResponse")
public class GetMultiRouteResponse {

    @XmlElement(required = true)
    protected MultiRoute getMultiRouteResult;

    /**
     * Obtém o valor da propriedade getMultiRouteResult.
     * 
     * @return
     *     possible object is
     *     {@link MultiRoute }
     *     
     */
    public MultiRoute getGetMultiRouteResult() {
        return getMultiRouteResult;
    }

    /**
     * Define o valor da propriedade getMultiRouteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRoute }
     *     
     */
    public void setGetMultiRouteResult(MultiRoute value) {
        this.getMultiRouteResult = value;
    }

}
