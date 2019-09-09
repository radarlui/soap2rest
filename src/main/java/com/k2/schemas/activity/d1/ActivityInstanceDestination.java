
package com.k2.schemas.activity.d1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.k2.schemas.process.d1.DataField;
import com.k2.schemas.process.d1.XmlField;


/**
 * <p>Java class for ActivityInstanceDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInstanceDestination"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.k2.com/process/d1}DataField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.k2.com/process/d1}XmlField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ActInstID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ExpectedDuration" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Priority" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="ProcInstID" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="StartDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInstanceDestination", propOrder = {
    "description",
    "metadata",
    "dataField",
    "xmlField"
})
public class ActivityInstanceDestination {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Metadata")
    protected String metadata;
    @XmlElement(name = "DataField", namespace = "http://schemas.k2.com/process/d1")
    protected List<DataField> dataField;
    @XmlElement(name = "XmlField", namespace = "http://schemas.k2.com/process/d1")
    protected List<XmlField> xmlField;
    @XmlAttribute(name = "ActID", required = true)
    protected long actID;
    @XmlAttribute(name = "ActInstID", required = true)
    protected long actInstID;
    @XmlAttribute(name = "ExpectedDuration", required = true)
    protected long expectedDuration;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Priority", required = true)
    protected int priority;
    @XmlAttribute(name = "ProcInstID", required = true)
    protected long procInstID;
    @XmlAttribute(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata(String value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the dataField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataField }
     * 
     * 
     */
    public List<DataField> getDataField() {
        if (dataField == null) {
            dataField = new ArrayList<DataField>();
        }
        return this.dataField;
    }

    /**
     * Gets the value of the xmlField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmlField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlField }
     * 
     * 
     */
    public List<XmlField> getXmlField() {
        if (xmlField == null) {
            xmlField = new ArrayList<XmlField>();
        }
        return this.xmlField;
    }

    /**
     * Gets the value of the actID property.
     * 
     */
    public long getActID() {
        return actID;
    }

    /**
     * Sets the value of the actID property.
     * 
     */
    public void setActID(long value) {
        this.actID = value;
    }

    /**
     * Gets the value of the actInstID property.
     * 
     */
    public long getActInstID() {
        return actInstID;
    }

    /**
     * Sets the value of the actInstID property.
     * 
     */
    public void setActInstID(long value) {
        this.actInstID = value;
    }

    /**
     * Gets the value of the expectedDuration property.
     * 
     */
    public long getExpectedDuration() {
        return expectedDuration;
    }

    /**
     * Sets the value of the expectedDuration property.
     * 
     */
    public void setExpectedDuration(long value) {
        this.expectedDuration = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(int value) {
        this.priority = value;
    }

    /**
     * Gets the value of the procInstID property.
     * 
     */
    public long getProcInstID() {
        return procInstID;
    }

    /**
     * Sets the value of the procInstID property.
     * 
     */
    public void setProcInstID(long value) {
        this.procInstID = value;
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

}
