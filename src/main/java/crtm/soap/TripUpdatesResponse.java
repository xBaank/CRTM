
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
 *         &lt;element name="TripUpdates" type="{GEIS.MultimodalInfoWebService}ArrayOfTripUpdate" minOccurs="0"/>
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
    "tripUpdates"
})
@XmlRootElement(name = "TripUpdatesResponse")
public class TripUpdatesResponse {

    @XmlElement(name = "TripUpdates")
    protected ArrayOfTripUpdate tripUpdates;

    /**
     * Gets the value of the tripUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTripUpdate }
     *     
     */
    public ArrayOfTripUpdate getTripUpdates() {
        return tripUpdates;
    }

    /**
     * Sets the value of the tripUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTripUpdate }
     *     
     */
    public void setTripUpdates(ArrayOfTripUpdate value) {
        this.tripUpdates = value;
    }

}
