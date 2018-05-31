package com.example.football.Domains;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "foods")
public class Food implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_food")
    private int idFood;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "something")
    private String someThing;

    public Food() {
    }

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
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
