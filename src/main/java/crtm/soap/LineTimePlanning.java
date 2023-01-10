
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LineTimePlanning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineTimePlanning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codItinerary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="days" type="{GEIS.MultimodalInfoWebService}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineTimePlanning", propOrder = {
    "codLine",
    "codItinerary",
    "type",
    "startService",
    "endService",
    "days",
    "updateDate"
})
public class LineTimePlanning {

    protected String codLine;
    protected String codItinerary;
    protected String type;
    protected String startService;
    protected String endService;
    protected ArrayOfString days;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;

    /**
     * Gets the value of the codLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLine() {
        return codLine;
    }

    /**
     * Sets the value of the codLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLine(String value) {
        this.codLine = value;
    }

    /**
     * Gets the value of the codItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodItinerary() {
        return codItinerary;
    }

    /**
     * Sets the value of the codItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodItinerary(String value) {
        this.codItinerary = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the startService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartService() {
        return startService;
    }

    /**
     * Sets the value of the startService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartService(String value) {
        this.startService = value;
    }

    /**
     * Gets the value of the endService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndService() {
        return endService;
    }

    /**
     * Sets the value of the endService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndService(String value) {
        this.endService = value;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDays(ArrayOfString value) {
        this.days = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

}
