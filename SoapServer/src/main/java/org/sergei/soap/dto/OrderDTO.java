package org.sergei.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderDTO {

    @XmlElement
    private Long orderId;

    private Long customerId;

    @XmlElement
    private Long transId;

    @XmlElement
    private String product;

    @XmlElement
    private double productWeight;

    @XmlElement
    private double price;

    public OrderDTO() {
    }

    public OrderDTO(Long transId, String product, double productWeight, double price) {
        this.transId = transId;
        this.product = product;
        this.productWeight = productWeight;
        this.price = price;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTransId() {
        return transId;
    }

    public void setTransId(Long transId) {
        this.transId = transId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
