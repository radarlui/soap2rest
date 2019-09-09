
package com.k2.schemas.worklist.d1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WorklistItem" type="{http://schemas.k2.com/worklist/d1}WorklistItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "worklistItem"
})
@XmlRootElement(name = "OpenWorklistItemResponse")
public class OpenWorklistItemResponse {

    @XmlElement(name = "WorklistItem", required = true, nillable = true)
    protected WorklistItem worklistItem;

    /**
     * Gets the value of the worklistItem property.
     * 
     * @return
     *     possible object is
     *     {@link WorklistItem }
     *     
     */
    public WorklistItem getWorklistItem() {
        return worklistItem;
    }

    /**
     * Sets the value of the worklistItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorklistItem }
     *     
     */
    public void setWorklistItem(WorklistItem value) {
        this.worklistItem = value;
    }

}
