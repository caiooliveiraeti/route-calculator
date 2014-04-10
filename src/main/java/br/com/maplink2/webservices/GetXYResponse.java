
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
 *         &lt;element name="getXYResult" type="{http://webservices.maplink2.com.br}Point"/>
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
    "getXYResult"
})
@XmlRootElement(name = "getXYResponse")
public class GetXYResponse {

    @XmlElement(required = true)
    protected Point getXYResult;

    /**
     * Obtém o valor da propriedade getXYResult.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getGetXYResult() {
        return getXYResult;
    }

    /**
     * Define o valor da propriedade getXYResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setGetXYResult(Point value) {
        this.getXYResult = value;
    }

}
