
package br.com.maplink2.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapSize complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MapSize">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapSize", propOrder = {
    "width",
    "height"
})
public class MapSize {

    protected int width;
    protected int height;

    /**
     * Obtém o valor da propriedade width.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Obtém o valor da propriedade height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Define o valor da propriedade height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

}
