
package classes;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for lecturer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lecturer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chair" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="university" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="mail" type="{http://www.example.org/lecturer}email_type" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lecturer", namespace = "http://www.example.org/lecturer", propOrder = {
    "name",
    "position",
    "chair",
    "university",
    "phone",
    "mail"
})
@XmlRootElement(name = "lecturer")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Lecturer {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String position;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String chair;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String university;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> phone;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> mail;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the chair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getChair() {
        return chair;
    }

    /**
     * Sets the value of the chair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setChair(String value) {
        this.chair = value;
    }

    /**
     * Gets the value of the university property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUniversity() {
        return university;
    }

    /**
     * Sets the value of the university property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUniversity(String value) {
        this.university = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getPhone() {
        if (phone == null) {
            phone = new ArrayList<Object>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the mail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<String> getMail() {
        if (mail == null) {
            mail = new ArrayList<String>();
        }
        return this.mail;
    }

}
