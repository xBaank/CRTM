
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="stops" type="{GEIS.MultimodalInfoWebService}ArrayOfStopInformation1" minOccurs="0"/>
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
    "stops"
})
@XmlRootElement(name = "StopsByGeoLocationResponse")
public class StopsByGeoLocationResponse {

    protected ArrayOfStopInformation1 stops;

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStopInformation1 }
     *     
     */
    public ArrayOfStopInformation1 getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStopInformation1 }
     *     
     */
    public void setStops(ArrayOfStopInformation1 value) {
        this.stops = value;
    }

}
