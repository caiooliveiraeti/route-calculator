
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MultiRoute complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MultiRoute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singleRouteTotals" type="{http://webservices.maplink2.com.br}ArrayOfSingleRouteTotals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiRoute", propOrder = {
    "singleRouteTotals"
})
public class MultiRoute {

    protected ArrayOfSingleRouteTotals singleRouteTotals;

    /**
     * Obtém o valor da propriedade singleRouteTotals.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSingleRouteTotals }
     *     
     */
    public ArrayOfSingleRouteTotals getSingleRouteTotals() {
        return singleRouteTotals;
    }

    /**
     * Define o valor da propriedade singleRouteTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSingleRouteTotals }
     *     
     */
    public void setSingleRouteTotals(ArrayOfSingleRouteTotals value) {
        this.singleRouteTotals = value;
    }

}
