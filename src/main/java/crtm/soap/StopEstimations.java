
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StopEstimations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopEstimations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="stopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stopName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timesInfo" type="{GEIS.MultimodalInfoWebService}ArrayOfTimeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopEstimations", propOrder = {
    "actualDate",
    "stopCode",
    "stopName",
    "timesInfo"
})
public class StopEstimations {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDate;
    protected String stopCode;
    protected String stopName;
    protected ArrayOfTimeInfo timesInfo;

    /**
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDate(XMLGregorianCalendar value) {
        this.actualDate = value;
    }

    /**
     * Gets the value of the stopCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopCode() {
        return stopCode;
    }

    /**
     * Sets the value of the stopCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopCode(String value) {
        this.stopCode = value;
    }

    /**
     * Gets the value of the stopName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopName() {
        return stopName;
    }

    /**
     * Sets the value of the stopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopName(String value) {
        this.stopName = value;
    }

    /**
     * Gets the value of the timesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeInfo }
     *     
     */
    public ArrayOfTimeInfo getTimesInfo() {
        return timesInfo;
    }

    /**
     * Sets the value of the timesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeInfo }
     *     
     */
    public void setTimesInfo(ArrayOfTimeInfo value) {
        this.timesInfo = value;
    }

}
