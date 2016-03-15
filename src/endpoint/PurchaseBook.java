
package endpoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for purchaseBook complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchaseBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shopID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchaseBook", propOrder = {
    "bookID",
    "shopID",
    "count",
    "purchaseDate"
})
public class PurchaseBook {

    protected int bookID;
    protected int shopID;
    protected int count;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseDate;

    /**
     * Gets the value of the bookID property.
     * 
     */
    public int getBookID() {
        return bookID;
    }

    /**
     * Sets the value of the bookID property.
     * 
     */
    public void setBookID(int value) {
        this.bookID = value;
    }

    /**
     * Gets the value of the shopID property.
     * 
     */
    public int getShopID() {
        return shopID;
    }

    /**
     * Sets the value of the shopID property.
     * 
     */
    public void setShopID(int value) {
        this.shopID = value;
    }

    /**
     * Gets the value of the count property.
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

}
