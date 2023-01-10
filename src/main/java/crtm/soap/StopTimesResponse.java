
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
 *         &lt;element name="stopTimes" type="{GEIS.MultimodalInfoWebService}StopTime" minOccurs="0"/>
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
    "stopTimes"
})
@XmlRootElement(name = "StopTimesResponse")
public class StopTimesResponse {

    protected StopTime stopTimes;

    /**
     * Gets the value of the stopTimes property.
     * 
     * @return
     *     possible object is
     *     {@link StopTime }
     *     
     */
    public StopTime getStopTimes() {
        return stopTimes;
    }

    /**
     * Sets the value of the stopTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTime }
     *     
     */
    public void setStopTimes(StopTime value) {
        this.stopTimes = value;
    }

}
