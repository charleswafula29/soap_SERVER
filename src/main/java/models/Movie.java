
package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="movie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="year_released" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://localhost:7000/soap-server}category"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movie", namespace = "http://localhost:7000/soap-server", propOrder = {
    "id",
    "name",
    "yearReleased",
    "category"
})
public class Movie {

    @XmlElement(namespace = "http://localhost:7000/soap-server")
    protected int id;
    @XmlElement(namespace = "http://localhost:7000/soap-server", required = true)
    protected String name;
    @XmlElement(name = "year_released", namespace = "http://localhost:7000/soap-server", required = true)
    protected String yearReleased;
    @XmlElement(namespace = "http://localhost:7000/soap-server", required = true)
    @XmlSchemaType(name = "string")
    protected Category category;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
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
     * Gets the value of the yearReleased property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearReleased() {
        return yearReleased;
    }

    /**
     * Sets the value of the yearReleased property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearReleased(String value) {
        this.yearReleased = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

}
