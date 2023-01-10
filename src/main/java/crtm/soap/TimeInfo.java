
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="itinerary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationStopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInfo", propOrder = {
    "line",
    "direction",
    "itinerary",
    "destinationStopCode",
    "vehicleCode",
    "issueCode",
    "time"
})
public class TimeInfo {

    protected String line;
    protected int direction;
    protected String itinerary;
    protected String destinationStopCode;
    protected String vehicleCode;
    protected String issueCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItinerary(String value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the destinationStopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStopCode() {
        return destinationStopCode;
    }

    /**
     * Sets the value of the destinationStopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStopCode(String value) {
        this.destinationStopCode = value;
    }

    /**
     * Gets the value of the vehicleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCode() {
        return vehicleCode;
    }

    /**
     * Sets the value of the vehicleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCode(String value) {
        this.vehicleCode = value;
    }

    /**
     * Gets the value of the issueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueCode() {
        return issueCode;
    }

    /**
     * Sets the value of the issueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueCode(String value) {
        this.issueCode = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

}
