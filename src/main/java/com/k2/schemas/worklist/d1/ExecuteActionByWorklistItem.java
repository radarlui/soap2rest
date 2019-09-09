
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
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sync" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "worklistItem",
    "action",
    "sync"
})
@XmlRootElement(name = "ExecuteActionByWorklistItem")
public class ExecuteActionByWorklistItem {

    @XmlElement(name = "WorklistItem", required = true, nillable = true)
    protected WorklistItem worklistItem;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "Sync")
    protected boolean sync;

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

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the sync property.
     * 
     */
    public boolean isSync() {
        return sync;
    }

    /**
     * Sets the value of the sync property.
     * 
     */
    public void setSync(boolean value) {
        this.sync = value;
    }

}
