
package crtm.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfServicioHorario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfServicioHorario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicioHorario" type="{GEIS.MultimodalInfoWebService}ServicioHorario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfServicioHorario", propOrder = {
    "servicioHorario"
})
public class ArrayOfServicioHorario {

    @XmlElement(name = "ServicioHorario", nillable = true)
    protected List<ServicioHorario> servicioHorario;

    /**
     * Gets the value of the servicioHorario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicioHorario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicioHorario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicioHorario }
     * 
     * 
     */
    public List<ServicioHorario> getServicioHorario() {
        if (servicioHorario == null) {
            servicioHorario = new ArrayList<ServicioHorario>();
        }
        return this.servicioHorario;
    }

}
