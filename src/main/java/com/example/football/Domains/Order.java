package com.example.football.Domains;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer_put_stadium")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id_stadium")
    private int idStadium;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private int idCustomer;

    public Order() {
    }

    public Order(int idStadium, int idCustomer) {
        this.idStadium = idStadium;
        this.idCustomer = idCustomer;
    }

    public int getIdStadium() {
        return idStadium;
    }

    public void setIdStadium(int idStadium) {
        this.idStadium = idStadium;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }


}
