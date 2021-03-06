
package org.sergei.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrderByCustomerIdAndOrderIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrderByCustomerIdAndOrderIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputOrderByCustomerIdAndOrderId" type="{http://soap.sergei.org}orderDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderByCustomerIdAndOrderIdResponse", propOrder = {
    "outputOrderByCustomerIdAndOrderId"
})
public class GetOrderByCustomerIdAndOrderIdResponse {

    protected OrderDTO outputOrderByCustomerIdAndOrderId;

    /**
     * Gets the value of the outputOrderByCustomerIdAndOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDTO }
     *     
     */
    public OrderDTO getOutputOrderByCustomerIdAndOrderId() {
        return outputOrderByCustomerIdAndOrderId;
    }

    /**
     * Sets the value of the outputOrderByCustomerIdAndOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDTO }
     *     
     */
    public void setOutputOrderByCustomerIdAndOrderId(OrderDTO value) {
        this.outputOrderByCustomerIdAndOrderId = value;
    }

}
