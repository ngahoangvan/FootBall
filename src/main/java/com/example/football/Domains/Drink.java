package com.example.football.Domains;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "drinks")
public class Drink implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_drink")
    private int idDrink;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "something")
    private String someThing;

    public Drink() {
    }

    public int getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(int idDrink) {
        this.idDrink = idDrink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSomeThing() {
        return someThing;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }
}
