
package com.k2.schemas.worklist.d1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import com.k2.schemas.activity.d1.ActivityInstanceDestination;
import com.k2.schemas.event.d1.EventInstance;
import com.k2.schemas.process.d1.Destination;


/**
 * <p>Java class for WorklistItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorklistItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Action" type="{http://schemas.k2.com/worklist/d1}Action" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.k2.com/process/d1}ProcessInstance" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.k2.com/activity/d1}ActivityInstanceDestination" minOccurs="0"/&gt;
 *         &lt;element name="DelegatedUser" type="{http://schemas.k2.com/process/d1}Destination" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.k2.com/event/d1}ActivityInstanceDestination" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AllocatedUser" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Status" use="required" type="{http://schemas.k2.com/worklist/d1}WorklistStatus" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorklistItem", propOrder = {
    "content"
})
public class WorklistItem {

    @XmlElementRefs({
        @XmlElementRef(name = "Action", namespace = "http://schemas.k2.com/worklist/d1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ProcessInstance", namespace = "http://schemas.k2.com/process/d1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ActivityInstanceDestination", namespace = "http://schemas.k2.com/activity/d1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DelegatedUser", namespace = "http://schemas.k2.com/worklist/d1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ActivityInstanceDestination", namespace = "http://schemas.k2.com/event/d1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Data", namespace = "http://schemas.k2.com/worklist/d1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "AllocatedUser")
    protected String allocatedUser;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "SerialNumber")
    protected String serialNumber;
    @XmlAttribute(name = "Status", required = true)
    protected WorklistStatus status;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "ActivityInstanceDestination" is used by two different parts of a schema. See: 
     * line 132 of file:/Users/radarlui/Documents/Accounts/KGI/kgi.wsdl
     * line 130 of file:/Users/radarlui/Documents/Accounts/KGI/kgi.wsdl
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EventInstance }{@code >}
     * {@link JAXBElement }{@code <}{@link Action }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessInstance }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivityInstanceDestination }{@code >}
     * {@link JAXBElement }{@code <}{@link Destination }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the allocatedUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocatedUser() {
        return allocatedUser;
    }

    /**
     * Sets the value of the allocatedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocatedUser(String value) {
        this.allocatedUser = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WorklistStatus }
     *     
     */
    public WorklistStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorklistStatus }
     *     
     */
    public void setStatus(WorklistStatus value) {
        this.status = value;
    }

}
