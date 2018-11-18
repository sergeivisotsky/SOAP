
package org.sergei.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllOrdersByCustomerIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllOrdersByCustomerIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputAllOrdersByCustomerId" type="{http://soap.sergei.org}orderDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllOrdersByCustomerIdResponse", propOrder = {
    "outputAllOrdersByCustomerId"
})
public class GetAllOrdersByCustomerIdResponse {

    protected List<OrderDTO> outputAllOrdersByCustomerId;

    /**
     * Gets the value of the outputAllOrdersByCustomerId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputAllOrdersByCustomerId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputAllOrdersByCustomerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderDTO }
     * 
     * 
     */
    public List<OrderDTO> getOutputAllOrdersByCustomerId() {
        if (outputAllOrdersByCustomerId == null) {
            outputAllOrdersByCustomerId = new ArrayList<OrderDTO>();
        }
        return this.outputAllOrdersByCustomerId;
    }

}
