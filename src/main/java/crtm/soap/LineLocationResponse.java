
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
 *         &lt;element name="vehiclesLocation" type="{GEIS.MultimodalInfoWebService}ArrayOfVehicleLocation" minOccurs="0"/>
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
    "vehiclesLocation"
})
@XmlRootElement(name = "LineLocationResponse")
public class LineLocationResponse {

    protected ArrayOfVehicleLocation vehiclesLocation;

    /**
     * Gets the value of the vehiclesLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVehicleLocation }
     *     
     */
    public ArrayOfVehicleLocation getVehiclesLocation() {
        return vehiclesLocation;
    }

    /**
     * Sets the value of the vehiclesLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVehicleLocation }
     *     
     */
    public void setVehiclesLocation(ArrayOfVehicleLocation value) {
        this.vehiclesLocation = value;
    }

}
