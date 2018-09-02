
package org.sergei.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrderByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrderByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputOrderById" type="{http://soap.sergei.org}order" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrderByIdResponse", propOrder = {
    "outputOrderById"
})
public class GetOrderByIdResponse {

    protected Order outputOrderById;

    /**
     * Gets the value of the outputOrderById property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOutputOrderById() {
        return outputOrderById;
    }

    /**
     * Sets the value of the outputOrderById property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOutputOrderById(Order value) {
        this.outputOrderById = value;
    }

}
