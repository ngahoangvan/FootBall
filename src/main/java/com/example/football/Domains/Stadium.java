package com.example.football.Domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "stadium")
public class Stadium implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stadium")
    private int idStadium;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "something")
    private String someThing;

    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
    @JoinTable(name = "customer_put_stadium",
            joinColumns = @JoinColumn(name = "id_stadium", referencedColumnName = "id_stadium"),
            inverseJoinColumns = @JoinColumn(name = "id_customer", referencedColumnName = "id_customer"))
    private Set<Customer> customers = new HashSet<>();

    public Stadium() {
    }

    public Stadium(String name, String address, String someThing) {
        this.name = name;
        this.address = address;
        this.someThing = someThing;
    }

    public int getIdStadium() {
        return idStadium;
    }

    public void setIdStadium(int idStadium) {
        this.idStadium = idStadium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSomeThing() {
        return someThing;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
