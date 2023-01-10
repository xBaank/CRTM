
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
 *         &lt;element name="modes" type="{GEIS.MultimodalInfoWebService}ArrayOfMode" minOccurs="0"/>
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
    "modes"
})
@XmlRootElement(name = "ModeResponse")
public class ModeResponse {

    protected ArrayOfMode modes;

    /**
     * Gets the value of the modes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMode }
     *     
     */
    public ArrayOfMode getModes() {
        return modes;
    }

    /**
     * Sets the value of the modes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMode }
     *     
     */
    public void setModes(ArrayOfMode value) {
        this.modes = value;
    }

}
