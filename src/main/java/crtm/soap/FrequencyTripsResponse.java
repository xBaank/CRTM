
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Expediciones_de_Frecuencia" type="{GEIS.MultimodalInfoWebService}ArrayOfExpedicionFrecuencia" minOccurs="0"/>
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
    "expedicionesDeFrecuencia"
})
@XmlRootElement(name = "FrequencyTripsResponse")
public class FrequencyTripsResponse {

    @XmlElement(name = "Expediciones_de_Frecuencia")
    protected ArrayOfExpedicionFrecuencia expedicionesDeFrecuencia;

    /**
     * Gets the value of the expedicionesDeFrecuencia property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExpedicionFrecuencia }
     *     
     */
    public ArrayOfExpedicionFrecuencia getExpedicionesDeFrecuencia() {
        return expedicionesDeFrecuencia;
    }

    /**
     * Sets the value of the expedicionesDeFrecuencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExpedicionFrecuencia }
     *     
     */
    public void setExpedicionesDeFrecuencia(ArrayOfExpedicionFrecuencia value) {
        this.expedicionesDeFrecuencia = value;
    }

}
