//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tBaliseLinkReaction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tBaliseLinkReaction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="trainTrip"/>
 *     &lt;enumeration value="applyServiceBrake"/>
 *     &lt;enumeration value="noReaction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tBaliseLinkReaction")
@XmlEnum
public enum TBaliseLinkReaction {

    @XmlEnumValue("trainTrip")
    TRAIN_TRIP("trainTrip"),
    @XmlEnumValue("applyServiceBrake")
    APPLY_SERVICE_BRAKE("applyServiceBrake"),
    @XmlEnumValue("noReaction")
    NO_REACTION("noReaction");
    private final String value;

    TBaliseLinkReaction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TBaliseLinkReaction fromValue(String v) {
        for (TBaliseLinkReaction c: TBaliseLinkReaction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
