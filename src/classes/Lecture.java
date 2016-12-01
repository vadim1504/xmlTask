
package classes;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for lecture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lecture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="lecture"/>
 *               &lt;enumeration value="laboratory"/>
 *               &lt;enumeration value="practice"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lecture_hall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lecturer" type="{http://www.example.org/lecturer}lecturer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="week" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lecture", propOrder = {
    "subject",
    "type",
    "lectureHall",
    "lecturer"
})
@XmlRootElement(name = "lecture")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Lecture {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String subject;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String type;
    @XmlElement(name = "lecture_hall")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lectureHall;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Lecturer lecturer;
    @XmlAttribute(name = "sequence")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Long sequence;
    @XmlAttribute(name = "week")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String week;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the lectureHall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLectureHall() {
        return lectureHall;
    }

    /**
     * Sets the value of the lectureHall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLectureHall(String value) {
        this.lectureHall = value;
    }

    /**
     * Gets the value of the lecturer property.
     * 
     * @return
     *     possible object is
     *     {@link Lecturer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Lecturer getLecturer() {
        return lecturer;
    }

    /**
     * Sets the value of the lecturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lecturer }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLecturer(Lecturer value) {
        this.lecturer = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Long getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSequence(Long value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the week property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getWeek() {
        return week;
    }

    /**
     * Sets the value of the week property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setWeek(String value) {
        this.week = value;
    }

}
