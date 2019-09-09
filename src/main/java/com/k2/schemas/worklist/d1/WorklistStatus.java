
package com.k2.schemas.worklist.d1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorklistStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorklistStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Open"/&gt;
 *     &lt;enumeration value="Allocated"/&gt;
 *     &lt;enumeration value="Sleep"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorklistStatus")
@XmlEnum
public enum WorklistStatus {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Allocated")
    ALLOCATED("Allocated"),
    @XmlEnumValue("Sleep")
    SLEEP("Sleep"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    WorklistStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorklistStatus fromValue(String v) {
        for (WorklistStatus c: WorklistStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
