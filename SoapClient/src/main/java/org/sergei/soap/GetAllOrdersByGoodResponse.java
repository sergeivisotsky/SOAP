
package org.sergei.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllOrdersByGoodResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllOrdersByGoodResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outputOrderByGood" type="{http://soap.sergei.org}order" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllOrdersByGoodResponse", propOrder = {
    "outputOrderByGood"
})
public class GetAllOrdersByGoodResponse {

    protected List<Order> outputOrderByGood;

    /**
     * Gets the value of the outputOrderByGood property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputOrderByGood property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputOrderByGood().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Order }
     * 
     * 
     */
    public List<Order> getOutputOrderByGood() {
        if (outputOrderByGood == null) {
            outputOrderByGood = new ArrayList<Order>();
        }
        return this.outputOrderByGood;
    }

}
