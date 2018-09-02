
package org.sergei.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="good" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goodWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveOrder", propOrder = {
    "customerId",
    "transId",
    "good",
    "goodWeight",
    "price"
})
public class SaveOrder {

    protected Long customerId;
    protected Long transId;
    protected String good;
    protected double goodWeight;
    protected double price;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransId(Long value) {
        this.transId = value;
    }

    /**
     * Gets the value of the good property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGood() {
        return good;
    }

    /**
     * Sets the value of the good property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGood(String value) {
        this.good = value;
    }

    /**
     * Gets the value of the goodWeight property.
     * 
     */
    public double getGoodWeight() {
        return goodWeight;
    }

    /**
     * Sets the value of the goodWeight property.
     * 
     */
    public void setGoodWeight(double value) {
        this.goodWeight = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

}
