package com.example.football.Domains;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customers_paid")
public class CustomersPaid implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer_paid")
    private int idCustomerPaid;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private int cost;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "something")
    private String someThing;

    public CustomersPaid() {
    }

    public int getIdCustomerPaid() {
        return idCustomerPaid;
    }

    public void setIdCustomerPaid(int idCustomerPaid) {
        this.idCustomerPaid = idCustomerPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSomeThing() {
        return someThing;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }
}
