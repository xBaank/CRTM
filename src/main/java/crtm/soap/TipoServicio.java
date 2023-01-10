
package crtm.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoServicio.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoServicio">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="NOCTURNO"/>
 *     &lt;enumeration value="EXPRESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoServicio")
@XmlEnum
public enum TipoServicio {

    NORMAL,
    NOCTURNO,
    EXPRESS;

    public String value() {
        return name();
    }

    public static TipoServicio fromValue(String v) {
        return valueOf(v);
    }

}
