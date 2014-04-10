
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MapOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scaleBar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mapSize" type="{http://webservices.maplink2.com.br}MapSize"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapOptions", propOrder = {
    "scaleBar",
    "mapSize"
})
public class MapOptions {

    protected boolean scaleBar;
    @XmlElement(required = true)
    protected MapSize mapSize;

    /**
     * Obtém o valor da propriedade scaleBar.
     * 
     */
    public boolean isScaleBar() {
        return scaleBar;
    }

    /**
     * Define o valor da propriedade scaleBar.
     * 
     */
    public void setScaleBar(boolean value) {
        this.scaleBar = value;
    }

    /**
     * Obtém o valor da propriedade mapSize.
     * 
     * @return
     *     possible object is
     *     {@link MapSize }
     *     
     */
    public MapSize getMapSize() {
        return mapSize;
    }

    /**
     * Define o valor da propriedade mapSize.
     * 
     * @param value
     *     allowed object is
     *     {@link MapSize }
     *     
     */
    public void setMapSize(MapSize value) {
        this.mapSize = value;
    }

}
