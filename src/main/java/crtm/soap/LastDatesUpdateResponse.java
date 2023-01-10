
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
 *         &lt;element name="lastDatesUpdate" type="{GEIS.MultimodalInfoWebService}LastDatesUpdate" minOccurs="0"/>
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
    "lastDatesUpdate"
})
@XmlRootElement(name = "LastDatesUpdateResponse")
public class LastDatesUpdateResponse {

    protected LastDatesUpdate lastDatesUpdate;

    /**
     * Gets the value of the lastDatesUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link LastDatesUpdate }
     *     
     */
    public LastDatesUpdate getLastDatesUpdate() {
        return lastDatesUpdate;
    }

    /**
     * Sets the value of the lastDatesUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastDatesUpdate }
     *     
     */
    public void setLastDatesUpdate(LastDatesUpdate value) {
        this.lastDatesUpdate = value;
    }

}
