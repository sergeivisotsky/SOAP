
package org.sergei.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllOrdersByCustomerIdAndProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllOrdersByCustomerIdAndProductResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputAllOrdersByCustomerIdAndProduct" type="{http://soap.sergei.org}order" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllOrdersByCustomerIdAndProductResponse", propOrder = {
    "outputAllOrdersByCustomerIdAndProduct"
})
public class GetAllOrdersByCustomerIdAndProductResponse {

    protected List<Order> outputAllOrdersByCustomerIdAndProduct;

    /**
     * Gets the value of the outputAllOrdersByCustomerIdAndProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputAllOrdersByCustomerIdAndProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputAllOrdersByCustomerIdAndProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Order }
     * 
     * 
     */
    public List<Order> getOutputAllOrdersByCustomerIdAndProduct() {
        if (outputAllOrdersByCustomerIdAndProduct == null) {
            outputAllOrdersByCustomerIdAndProduct = new ArrayList<Order>();
        }
        return this.outputAllOrdersByCustomerIdAndProduct;
    }

}
