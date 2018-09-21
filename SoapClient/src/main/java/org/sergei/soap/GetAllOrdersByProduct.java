
package org.sergei.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllOrdersByProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllOrdersByProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inputOrderProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllOrdersByProduct", propOrder = {
    "inputOrderProduct"
})
public class GetAllOrdersByProduct {

    protected String inputOrderProduct;

    /**
     * Gets the value of the inputOrderProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputOrderProduct() {
        return inputOrderProduct;
    }

    /**
     * Sets the value of the inputOrderProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputOrderProduct(String value) {
        this.inputOrderProduct = value;
    }

}
