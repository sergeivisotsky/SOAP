
package org.sergei.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllOrdersByCustomerIdAndGood complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllOrdersByCustomerIdAndGood">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inputGood" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllOrdersByCustomerIdAndGood", propOrder = {
    "inputCustomerId",
    "inputGood"
})
public class GetAllOrdersByCustomerIdAndGood {

    protected Long inputCustomerId;
    protected String inputGood;

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
     * Gets the value of the inputGood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputGood() {
        return inputGood;
    }

    /**
     * Sets the value of the inputGood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputGood(String value) {
        this.inputGood = value;
    }

}
