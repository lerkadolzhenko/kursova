package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "booksdeliver")
@EntityListeners(AuditingEntityListener.class)

public class Booksdeliver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbooksdeliver;
    @ManyToOne
    private Books namebook;
    @ManyToOne
    private Location namelocation;
    private int amount;
    private String datebooksdeliver;

    public Booksdeliver(int idbooksdeliver, Books namebook, Location namelocation, int amount, String datebooksdeliver) {
        this.idbooksdeliver = idbooksdeliver;
        this.namebook = namebook;
        this.namelocation = namelocation;
        this.amount = amount;
        this.datebooksdeliver = datebooksdeliver;
    }

    public Booksdeliver() {
    }

    public int getIdbooksdeliver() {
        return idbooksdeliver;
    }

    public void setIdbooksdeliver(int idbooksdeliver) {
        this.idbooksdeliver = idbooksdeliver;
    }

    public Books getNamebook() {
        return namebook;
    }

    public void setNamebook(Books namebook) {
        this.namebook = namebook;
    }

    public Location getNamelocation() {
        return namelocation;
    }

    public void setNamelocation(Location namelocation) {
        this.namelocation = namelocation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDatebooksdeliver() { return datebooksdeliver; }

    public void setDatebooksdeliver(String datebooksdeliver) {
        this.datebooksdeliver = datebooksdeliver;
    }

    /*@Override
    public String toString() {
        return "Booksdeliver{" +
                "idbooksdeliver=" + idbooksdeliver +
                ", namebook='" + namebook + '\'' +
                ", namelocation='" + namelocation + '\'' +
                ", amount=" + amount +
                ", datebooksdeliver=" + datebooksdeliver +
                '}';
    }*/
}
