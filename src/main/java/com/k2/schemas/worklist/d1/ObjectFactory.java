
package com.k2.schemas.worklist.d1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.k2.schemas.process.d1.Destination;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.k2.schemas.worklist.d1 package. 
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

    private final static QName _ProcessInstance_QNAME = new QName("http://schemas.k2.com/worklist/d1", "ProcessInstance");
    private final static QName _Long_QNAME = new QName("http://schemas.k2.com/worklist/d1", "long");
    private final static QName _WorklistItemCollection_QNAME = new QName("http://schemas.k2.com/worklist/d1", "WorklistItemCollection");
    private final static QName _WorklistItem_QNAME = new QName("http://schemas.k2.com/worklist/d1", "WorklistItem");
    private final static QName _WorklistItemData_QNAME = new QName("http://schemas.k2.com/worklist/d1", "Data");
    private final static QName _WorklistItemAction_QNAME = new QName("http://schemas.k2.com/worklist/d1", "Action");
    private final static QName _WorklistItemDelegatedUser_QNAME = new QName("http://schemas.k2.com/worklist/d1", "DelegatedUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.k2.schemas.worklist.d1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpenProcessInstance }
     * 
     */
    public OpenProcessInstance createOpenProcessInstance() {
        return new OpenProcessInstance();
    }

    /**
     * Create an instance of {@link OpenProcessInstanceResponse }
     * 
     */
    public OpenProcessInstanceResponse createOpenProcessInstanceResponse() {
        return new OpenProcessInstanceResponse();
    }

    /**
     * Create an instance of {@link ProcessInstance }
     * 
     */
    public ProcessInstance createProcessInstance() {
        return new ProcessInstance();
    }

    /**
     * Create an instance of {@link StartNewProcessInstance }
     * 
     */
    public StartNewProcessInstance createStartNewProcessInstance() {
        return new StartNewProcessInstance();
    }

    /**
     * Create an instance of {@link StartNewProcessInstanceResponse }
     * 
     */
    public StartNewProcessInstanceResponse createStartNewProcessInstanceResponse() {
        return new StartNewProcessInstanceResponse();
    }

    /**
     * Create an instance of {@link StartNewProcessInstanceScalar }
     * 
     */
    public StartNewProcessInstanceScalar createStartNewProcessInstanceScalar() {
        return new StartNewProcessInstanceScalar();
    }

    /**
     * Create an instance of {@link StartNewProcessInstanceScalarResponse }
     * 
     */
    public StartNewProcessInstanceScalarResponse createStartNewProcessInstanceScalarResponse() {
        return new StartNewProcessInstanceScalarResponse();
    }

    /**
     * Create an instance of {@link UpdateProcessInstance }
     * 
     */
    public UpdateProcessInstance createUpdateProcessInstance() {
        return new UpdateProcessInstance();
    }

    /**
     * Create an instance of {@link UpdateProcessInstanceResponse }
     * 
     */
    public UpdateProcessInstanceResponse createUpdateProcessInstanceResponse() {
        return new UpdateProcessInstanceResponse();
    }

    /**
     * Create an instance of {@link OpenWorklist }
     * 
     */
    public OpenWorklist createOpenWorklist() {
        return new OpenWorklist();
    }

    /**
     * Create an instance of {@link OpenWorklistResponse }
     * 
     */
    public OpenWorklistResponse createOpenWorklistResponse() {
        return new OpenWorklistResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWorklistItem }
     * 
     */
    public ArrayOfWorklistItem createArrayOfWorklistItem() {
        return new ArrayOfWorklistItem();
    }

    /**
     * Create an instance of {@link OpenWorklistItem }
     * 
     */
    public OpenWorklistItem createOpenWorklistItem() {
        return new OpenWorklistItem();
    }

    /**
     * Create an instance of {@link OpenWorklistItemResponse }
     * 
     */
    public OpenWorklistItemResponse createOpenWorklistItemResponse() {
        return new OpenWorklistItemResponse();
    }

    /**
     * Create an instance of {@link WorklistItem }
     * 
     */
    public WorklistItem createWorklistItem() {
        return new WorklistItem();
    }

    /**
     * Create an instance of {@link ExecuteActionBySerial }
     * 
     */
    public ExecuteActionBySerial createExecuteActionBySerial() {
        return new ExecuteActionBySerial();
    }

    /**
     * Create an instance of {@link ExecuteActionBySerialResponse }
     * 
     */
    public ExecuteActionBySerialResponse createExecuteActionBySerialResponse() {
        return new ExecuteActionBySerialResponse();
    }

    /**
     * Create an instance of {@link ExecuteActionByWorklistItem }
     * 
     */
    public ExecuteActionByWorklistItem createExecuteActionByWorklistItem() {
        return new ExecuteActionByWorklistItem();
    }

    /**
     * Create an instance of {@link ExecuteActionByWorklistItemResponse }
     * 
     */
    public ExecuteActionByWorklistItemResponse createExecuteActionByWorklistItemResponse() {
        return new ExecuteActionByWorklistItemResponse();
    }

    /**
     * Create an instance of {@link ReleaseWorklistItem }
     * 
     */
    public ReleaseWorklistItem createReleaseWorklistItem() {
        return new ReleaseWorklistItem();
    }

    /**
     * Create an instance of {@link ReleaseWorklistItemResponse }
     * 
     */
    public ReleaseWorklistItemResponse createReleaseWorklistItemResponse() {
        return new ReleaseWorklistItemResponse();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/worklist/d1", name = "ProcessInstance")
    public JAXBElement<ProcessInstance> createProcessInstance(ProcessInstance value) {
        return new JAXBElement<ProcessInstance>(_ProcessInstance_QNAME, ProcessInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/worklist/d1", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorklistItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/worklist/d1", name = "WorklistItemCollection")
    public JAXBElement<ArrayOfWorklistItem> createWorklistItemCollection(ArrayOfWorklistItem value) {
        return new JAXBElement<ArrayOfWorklistItem>(_WorklistItemCollection_QNAME, ArrayOfWorklistItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorklistItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/worklist/d1", name = "WorklistItem")
    public JAXBElement<WorklistItem> createWorklistItem(WorklistItem value) {
        return new JAXBElement<WorklistItem>(_WorklistItem_QNAME, WorklistItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/worklist/d1", name = "Data", scope = WorklistItem.class)
    public JAXBElement<String> createWorklistItemData(String value) {
        return new JAXBElement<String>(_WorklistItemData_QNAME, String.class, WorklistItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Action }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/worklist/d1", name = "Action", scope = WorklistItem.class)
    public JAXBElement<Action> createWorklistItemAction(Action value) {
        return new JAXBElement<Action>(_WorklistItemAction_QNAME, Action.class, WorklistItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.k2.com/worklist/d1", name = "DelegatedUser", scope = WorklistItem.class)
    public JAXBElement<Destination> createWorklistItemDelegatedUser(Destination value) {
        return new JAXBElement<Destination>(_WorklistItemDelegatedUser_QNAME, Destination.class, WorklistItem.class, value);
    }

}
