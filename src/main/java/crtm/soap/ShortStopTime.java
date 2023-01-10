
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShortStopTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShortStopTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="stop" type="{GEIS.MultimodalInfoWebService}ShortStop" minOccurs="0"/>
 *         &lt;element name="times" type="{GEIS.MultimodalInfoWebService}ArrayOfShortTime" minOccurs="0"/>
 *         &lt;element name="linesStatus" type="{GEIS.MultimodalInfoWebService}ArrayOfLineStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortStopTime", propOrder = {
    "actualDate",
    "stop",
    "times",
    "linesStatus"
})
public class ShortStopTime {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDate;
    protected ShortStop stop;
    protected ArrayOfShortTime times;
    protected ArrayOfLineStatus linesStatus;

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
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link ShortStop }
     *     
     */
    public ShortStop getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortStop }
     *     
     */
    public void setStop(ShortStop value) {
        this.stop = value;
    }

    /**
     * Gets the value of the times property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShortTime }
     *     
     */
    public ArrayOfShortTime getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShortTime }
     *     
     */
    public void setTimes(ArrayOfShortTime value) {
        this.times = value;
    }

    /**
     * Gets the value of the linesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineStatus }
     *     
     */
    public ArrayOfLineStatus getLinesStatus() {
        return linesStatus;
    }

    /**
     * Sets the value of the linesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineStatus }
     *     
     */
    public void setLinesStatus(ArrayOfLineStatus value) {
        this.linesStatus = value;
    }

}
