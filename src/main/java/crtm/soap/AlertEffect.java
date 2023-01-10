
package crtm.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertEffect.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertEffect">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIN_SERVICIO"/>
 *     &lt;enumeration value="SERVICIO_REDUCIDO"/>
 *     &lt;enumeration value="RETRASOS_IMPORTANTES"/>
 *     &lt;enumeration value="DESVÍO"/>
 *     &lt;enumeration value="SERVICIO_ADICIONAL"/>
 *     &lt;enumeration value="SERVICIO_MODIFICADO"/>
 *     &lt;enumeration value="OTRO_EFECTO"/>
 *     &lt;enumeration value="EFECTO_DESCONOCIDO"/>
 *     &lt;enumeration value="MOVIMIENTO_PARADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertEffect")
@XmlEnum
public enum AlertEffect {

    SIN_SERVICIO,
    SERVICIO_REDUCIDO,
    RETRASOS_IMPORTANTES,
    DESVÍO,
    SERVICIO_ADICIONAL,
    SERVICIO_MODIFICADO,
    OTRO_EFECTO,
    EFECTO_DESCONOCIDO,
    MOVIMIENTO_PARADO;

    public String value() {
        return name();
    }

    public static AlertEffect fromValue(String v) {
        return valueOf(v);
    }

}
