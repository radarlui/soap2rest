
package com.k2.schemas.process.d1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.k2.schemas.worklist.d1.ProcessInstance;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.k2.schemas.process.d1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Description_QNAME = new QName("http://schemas.k2.com/process/d1", "Description");
    private final static QName _Metadata_QNAME = new QName("http://schemas.k2.com/process/d1", "Metadata");
    private final static QName _DataField_QNAME = new QName("http://schemas.k2.com/process/d1", "DataField");
    private final static QName _XmlField_QNAME = new QName("http://schemas.k2.com/process/d1", "XmlField");
    private final static QName _ProcessInstance_QNAME = new QName("http://schemas.k2.com/process/d1", "ProcessInstance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.k2.schemas.process.d1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataField }
     * 
     */
    public DataField createDataField() {
        return new DataField();
    }

    /**
     * Create an instance of {@link XmlField }
     * 
     */
    public XmlField createXmlField() {
        return new XmlField();
    }

    /**
     * Create an instance of {@link Destination }
     * 
     */
    public Destination createDestination() {
        return new Destination();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/process/d1", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/process/d1", name = "Metadata")
    public JAXBElement<String> createMetadata(String value) {
        return new JAXBElement<String>(_Metadata_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/process/d1", name = "DataField")
    public JAXBElement<DataField> createDataField(DataField value) {
        return new JAXBElement<DataField>(_DataField_QNAME, DataField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/process/d1", name = "XmlField")
    public JAXBElement<XmlField> createXmlField(XmlField value) {
        return new JAXBElement<XmlField>(_XmlField_QNAME, XmlField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/process/d1", name = "ProcessInstance")
    public JAXBElement<ProcessInstance> createProcessInstance(ProcessInstance value) {
        return new JAXBElement<ProcessInstance>(_ProcessInstance_QNAME, ProcessInstance.class, null, value);
    }

}
