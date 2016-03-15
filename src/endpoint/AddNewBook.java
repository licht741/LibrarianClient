
package endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addNewBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addNewBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Stitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pubHouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pubYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNewBook", propOrder = {
    "stitle",
    "author",
    "pubHouse",
    "pubYear"
})
public class AddNewBook {

    @XmlElement(name = "Stitle")
    protected String stitle;
    protected String author;
    protected String pubHouse;
    protected int pubYear;

    /**
     * Gets the value of the stitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStitle() {
        return stitle;
    }

    /**
     * Sets the value of the stitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStitle(String value) {
        this.stitle = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the pubHouse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubHouse() {
        return pubHouse;
    }

    /**
     * Sets the value of the pubHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubHouse(String value) {
        this.pubHouse = value;
    }

    /**
     * Gets the value of the pubYear property.
     * 
     */
    public int getPubYear() {
        return pubYear;
    }

    /**
     * Sets the value of the pubYear property.
     * 
     */
    public void setPubYear(int value) {
        this.pubYear = value;
    }

}
