
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
 *         &lt;element name="getXYRadiusWithMapResult" type="{http://webservices.maplink2.com.br}MapInfo"/>
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
    "getXYRadiusWithMapResult"
})
@XmlRootElement(name = "getXYRadiusWithMapResponse")
public class GetXYRadiusWithMapResponse {

    @XmlElement(required = true)
    protected MapInfo getXYRadiusWithMapResult;

    /**
     * Obtém o valor da propriedade getXYRadiusWithMapResult.
     * 
     * @return
     *     possible object is
     *     {@link MapInfo }
     *     
     */
    public MapInfo getGetXYRadiusWithMapResult() {
        return getXYRadiusWithMapResult;
    }

    /**
     * Define o valor da propriedade getXYRadiusWithMapResult.
     * 
     * @param value
     *     allowed object is
     *     {@link MapInfo }
     *     
     */
    public void setGetXYRadiusWithMapResult(MapInfo value) {
        this.getXYRadiusWithMapResult = value;
    }

}
