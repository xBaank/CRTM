
package crtm.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="VF"/>
 *     &lt;enumeration value="FV"/>
 *     &lt;enumeration value="FN"/>
 *     &lt;enumeration value="TO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDia")
@XmlEnum
public enum TipoDia {

    LB,
    LV,
    VF,
    FV,
    FN,
    TO;

    public String value() {
        return name();
    }

    public static TipoDia fromValue(String v) {
        return valueOf(v);
    }

}
