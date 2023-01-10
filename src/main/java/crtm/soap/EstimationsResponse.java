
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
 *         &lt;element name="StopsEstimations" type="{GEIS.MultimodalInfoWebService}ArrayOfStopEstimations" minOccurs="0"/>
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
    "stopsEstimations"
})
@XmlRootElement(name = "EstimationsResponse")
public class EstimationsResponse {

    @XmlElement(name = "StopsEstimations")
    protected ArrayOfStopEstimations stopsEstimations;

    /**
     * Gets the value of the stopsEstimations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStopEstimations }
     *     
     */
    public ArrayOfStopEstimations getStopsEstimations() {
        return stopsEstimations;
    }

    /**
     * Sets the value of the stopsEstimations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStopEstimations }
     *     
     */
    public void setStopsEstimations(ArrayOfStopEstimations value) {
        this.stopsEstimations = value;
    }

}
