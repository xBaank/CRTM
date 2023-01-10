
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LineInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMunicipalities" type="{GEIS.MultimodalInfoWebService}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="itinerary" type="{GEIS.MultimodalInfoWebService}ArrayOfItinerary" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updateKmlDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nightService" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lineTimePlanning" type="{GEIS.MultimodalInfoWebService}LineTimePlanning" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineInformation", propOrder = {
    "codLine",
    "shortDescription",
    "description",
    "codMode",
    "codMunicipalities",
    "itinerary",
    "updateDate",
    "updateKmlDate",
    "nightService",
    "lineTimePlanning"
})
public class LineInformation {

    protected String codLine;
    protected String shortDescription;
    protected String description;
    protected String codMode;
    protected ArrayOfString codMunicipalities;
    protected ArrayOfItinerary itinerary;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateKmlDate;
    protected int nightService;
    protected LineTimePlanning lineTimePlanning;

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
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the codMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMode() {
        return codMode;
    }

    /**
     * Sets the value of the codMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMode(String value) {
        this.codMode = value;
    }

    /**
     * Gets the value of the codMunicipalities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCodMunicipalities() {
        return codMunicipalities;
    }

    /**
     * Sets the value of the codMunicipalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCodMunicipalities(ArrayOfString value) {
        this.codMunicipalities = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItinerary }
     *     
     */
    public ArrayOfItinerary getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItinerary }
     *     
     */
    public void setItinerary(ArrayOfItinerary value) {
        this.itinerary = value;
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

    /**
     * Gets the value of the updateKmlDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateKmlDate() {
        return updateKmlDate;
    }

    /**
     * Sets the value of the updateKmlDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateKmlDate(XMLGregorianCalendar value) {
        this.updateKmlDate = value;
    }

    /**
     * Gets the value of the nightService property.
     * 
     */
    public int getNightService() {
        return nightService;
    }

    /**
     * Sets the value of the nightService property.
     * 
     */
    public void setNightService(int value) {
        this.nightService = value;
    }

    /**
     * Gets the value of the lineTimePlanning property.
     * 
     * @return
     *     possible object is
     *     {@link LineTimePlanning }
     *     
     */
    public LineTimePlanning getLineTimePlanning() {
        return lineTimePlanning;
    }

    /**
     * Sets the value of the lineTimePlanning property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineTimePlanning }
     *     
     */
    public void setLineTimePlanning(LineTimePlanning value) {
        this.lineTimePlanning = value;
    }

}
