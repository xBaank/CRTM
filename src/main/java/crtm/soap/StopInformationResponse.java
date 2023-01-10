
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
 *         &lt;element name="stops" type="{GEIS.MultimodalInfoWebService}ArrayOfStopInformation" minOccurs="0"/>
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
@XmlRootElement(name = "StopInformationResponse")
public class StopInformationResponse {

    protected ArrayOfStopInformation stops;

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStopInformation }
     *     
     */
    public ArrayOfStopInformation getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStopInformation }
     *     
     */
    public void setStops(ArrayOfStopInformation value) {
        this.stops = value;
    }

}
