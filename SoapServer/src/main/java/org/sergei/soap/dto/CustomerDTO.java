/*
 * Copyright (c) Sergei Visotsky, 2018
 */

package org.sergei.soap.dto;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerDTO {

    @XmlElement
    private Long customerId;

    @XmlElement
    private String firstName;

    @XmlElement
    private String lastName;

    @XmlElement
    private int age;

    public CustomerDTO() {
    }

    public CustomerDTO(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
