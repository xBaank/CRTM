
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{GEIS.MultimodalInfoWebService}ShortLine" minOccurs="0"/>
 *         &lt;element name="SAEStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStatus", propOrder = {
    "line",
    "saeStatus"
})
public class LineStatus {

    protected ShortLine line;
    @XmlElement(name = "SAEStatus")
    protected boolean saeStatus;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLine }
     *     
     */
    public ShortLine getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLine }
     *     
     */
    public void setLine(ShortLine value) {
        this.line = value;
    }

    /**
     * Gets the value of the saeStatus property.
     * 
     */
    public boolean isSAEStatus() {
        return saeStatus;
    }

    /**
     * Sets the value of the saeStatus property.
     * 
     */
    public void setSAEStatus(boolean value) {
        this.saeStatus = value;
    }

}
