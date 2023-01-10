
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
 *         &lt;element name="actualTime" type="{GEIS.MultimodalInfoWebService}ActualTime" minOccurs="0"/>
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
    "actualTime"
})
@XmlRootElement(name = "TimeResponse")
public class TimeResponse {

    protected ActualTime actualTime;

    /**
     * Gets the value of the actualTime property.
     * 
     * @return
     *     possible object is
     *     {@link ActualTime }
     *     
     */
    public ActualTime getActualTime() {
        return actualTime;
    }

    /**
     * Sets the value of the actualTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualTime }
     *     
     */
    public void setActualTime(ActualTime value) {
        this.actualTime = value;
    }

}
