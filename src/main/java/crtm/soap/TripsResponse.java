
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
 *         &lt;element name="Expediciones" type="{GEIS.MultimodalInfoWebService}ArrayOfExpedicion" minOccurs="0"/>
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
    "expediciones"
})
@XmlRootElement(name = "TripsResponse")
public class TripsResponse {

    @XmlElement(name = "Expediciones")
    protected ArrayOfExpedicion expediciones;

    /**
     * Gets the value of the expediciones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExpedicion }
     *     
     */
    public ArrayOfExpedicion getExpediciones() {
        return expediciones;
    }

    /**
     * Sets the value of the expediciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExpedicion }
     *     
     */
    public void setExpediciones(ArrayOfExpedicion value) {
        this.expediciones = value;
    }

}
