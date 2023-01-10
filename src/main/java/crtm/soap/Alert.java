
package crtm.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Alert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informedEntities" type="{GEIS.MultimodalInfoWebService}ArrayOfEntitySelector" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="expeditionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cause" type="{GEIS.MultimodalInfoWebService}AlertCause"/>
 *         &lt;element name="effect" type="{GEIS.MultimodalInfoWebService}AlertEffect"/>
 *         &lt;element name="titleLang" type="{GEIS.MultimodalInfoWebService}ArrayOfStringLanguage" minOccurs="0"/>
 *         &lt;element name="descriptionLang" type="{GEIS.MultimodalInfoWebService}ArrayOfStringLanguage" minOccurs="0"/>
 *         &lt;element name="urlLang" type="{GEIS.MultimodalInfoWebService}ArrayOfStringLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Alert", propOrder = {
    "codMode",
    "informedEntities",
    "startDate",
    "endDate",
    "expeditionType",
    "cause",
    "effect",
    "titleLang",
    "descriptionLang",
    "urlLang"
})
public class Alert {

    protected String codMode;
    protected ArrayOfEntitySelector informedEntities;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String expeditionType;
    @XmlElement(required = true)
    protected AlertCause cause;
    @XmlElement(required = true)
    protected AlertEffect effect;
    protected ArrayOfStringLanguage titleLang;
    protected ArrayOfStringLanguage descriptionLang;
    protected ArrayOfStringLanguage urlLang;

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
     * Gets the value of the informedEntities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntitySelector }
     *     
     */
    public ArrayOfEntitySelector getInformedEntities() {
        return informedEntities;
    }

    /**
     * Sets the value of the informedEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntitySelector }
     *     
     */
    public void setInformedEntities(ArrayOfEntitySelector value) {
        this.informedEntities = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the expeditionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditionType() {
        return expeditionType;
    }

    /**
     * Sets the value of the expeditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditionType(String value) {
        this.expeditionType = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCause }
     *     
     */
    public AlertCause getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCause }
     *     
     */
    public void setCause(AlertCause value) {
        this.cause = value;
    }

    /**
     * Gets the value of the effect property.
     * 
     * @return
     *     possible object is
     *     {@link AlertEffect }
     *     
     */
    public AlertEffect getEffect() {
        return effect;
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertEffect }
     *     
     */
    public void setEffect(AlertEffect value) {
        this.effect = value;
    }

    /**
     * Gets the value of the titleLang property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringLanguage }
     *     
     */
    public ArrayOfStringLanguage getTitleLang() {
        return titleLang;
    }

    /**
     * Sets the value of the titleLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringLanguage }
     *     
     */
    public void setTitleLang(ArrayOfStringLanguage value) {
        this.titleLang = value;
    }

    /**
     * Gets the value of the descriptionLang property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringLanguage }
     *     
     */
    public ArrayOfStringLanguage getDescriptionLang() {
        return descriptionLang;
    }

    /**
     * Sets the value of the descriptionLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringLanguage }
     *     
     */
    public void setDescriptionLang(ArrayOfStringLanguage value) {
        this.descriptionLang = value;
    }

    /**
     * Gets the value of the urlLang property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringLanguage }
     *     
     */
    public ArrayOfStringLanguage getUrlLang() {
        return urlLang;
    }

    /**
     * Sets the value of the urlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringLanguage }
     *     
     */
    public void setUrlLang(ArrayOfStringLanguage value) {
        this.urlLang = value;
    }

}
