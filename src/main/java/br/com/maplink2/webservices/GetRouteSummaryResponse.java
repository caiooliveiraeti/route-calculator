
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
 *         &lt;element name="getRouteSummaryResult" type="{http://webservices.maplink2.com.br}ArrayOfRouteSummary" minOccurs="0"/>
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
    "getRouteSummaryResult"
})
@XmlRootElement(name = "getRouteSummaryResponse")
public class GetRouteSummaryResponse {

    protected ArrayOfRouteSummary getRouteSummaryResult;

    /**
     * Obtém o valor da propriedade getRouteSummaryResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRouteSummary }
     *     
     */
    public ArrayOfRouteSummary getGetRouteSummaryResult() {
        return getRouteSummaryResult;
    }

    /**
     * Define o valor da propriedade getRouteSummaryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRouteSummary }
     *     
     */
    public void setGetRouteSummaryResult(ArrayOfRouteSummary value) {
        this.getRouteSummaryResult = value;
    }

}
