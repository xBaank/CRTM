
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
 *         &lt;element name="itineraries" type="{GEIS.MultimodalInfoWebService}ArrayOfLineItinerary" minOccurs="0"/>
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
    "itineraries"
})
@XmlRootElement(name = "LineItineraryResponse")
public class LineItineraryResponse {

    protected ArrayOfLineItinerary itineraries;

    /**
     * Gets the value of the itineraries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItinerary }
     *     
     */
    public ArrayOfLineItinerary getItineraries() {
        return itineraries;
    }

    /**
     * Sets the value of the itineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItinerary }
     *     
     */
    public void setItineraries(ArrayOfLineItinerary value) {
        this.itineraries = value;
    }

}
