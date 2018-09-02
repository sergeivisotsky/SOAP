
package org.sergei.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrderByCustomerIdAndOrderId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrderByCustomerIdAndOrderId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inputOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderByCustomerIdAndOrderId", propOrder = {
    "inputCustomerId",
    "inputOrderId"
})
public class GetOrderByCustomerIdAndOrderId {

    protected Long inputCustomerId;
    protected Long inputOrderId;

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
     * Gets the value of the inputOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInputOrderId() {
        return inputOrderId;
    }

    /**
     * Sets the value of the inputOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInputOrderId(Long value) {
        this.inputOrderId = value;
    }

}
