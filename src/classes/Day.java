
package classes;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for day complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="day">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lecture" type="{http://www.example.org/schedule}lecture" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "day", propOrder = {
    "lecture"
})
@XmlRootElement(name = "day")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Day {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Lecture> lecture;
    @XmlAttribute(name = "name")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;

    /**
     * Gets the value of the lecture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lecture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLecture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lecture }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2016-12-01T11:57:51+03:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Lecture> getLecture() {
        if (lecture == null) {
            lecture = new ArrayList<Lecture>();
        }
        return this.lecture;
    }

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

}
