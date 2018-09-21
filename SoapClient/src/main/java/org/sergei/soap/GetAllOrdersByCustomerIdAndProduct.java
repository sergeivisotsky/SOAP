
package org.sergei.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllOrdersByCustomerIdAndProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllOrdersByCustomerIdAndProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inputProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllOrdersByCustomerIdAndProduct", propOrder = {
    "inputCustomerId",
    "inputProduct"
})
public class GetAllOrdersByCustomerIdAndProduct {

    protected Long inputCustomerId;
    protected String inputProduct;

    /**
     * Gets the value of the inputCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInputCustomerId() {
        return inputCustomerId;
    }

    /**
     * Sets the value of the inputCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInputCustomerId(Long value) {
        this.inputCustomerId = value;
    }

    /**
     * Gets the value of the inputProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputProduct() {
        return inputProduct;
    }

    /**
     * Sets the value of the inputProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputProduct(String value) {
        this.inputProduct = value;
    }

}
