
package br.com.maplink2.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfMultiRouteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMultiRouteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultiRouteRequest" type="{http://webservices.maplink2.com.br}MultiRouteRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMultiRouteRequest", propOrder = {
    "multiRouteRequest"
})
public class ArrayOfMultiRouteRequest {

    @XmlElement(name = "MultiRouteRequest")
    protected List<MultiRouteRequest> multiRouteRequest;

    /**
     * Gets the value of the multiRouteRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiRouteRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiRouteRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiRouteRequest }
     * 
     * 
     */
    public List<MultiRouteRequest> getMultiRouteRequest() {
        if (multiRouteRequest == null) {
            multiRouteRequest = new ArrayList<MultiRouteRequest>();
        }
        return this.multiRouteRequest;
    }

}
