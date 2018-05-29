package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "books")
@EntityListeners(AuditingEntityListener.class)

public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbooks;
    @ManyToOne
    private Location namelocation;
    private String namebook;
    private String author;
    private int year;
    private int amount;
    private int price;
    private int amountdebtor;

    public Books(int idbooks, Location namelocation, String namebook, String author, int year, int amount, int price, int amountdebtor) {
        this.idbooks = idbooks;
        this.namelocation = namelocation;
        this.namebook = namebook;
        this.author = author;
        this.year = year;
        this.amount = amount;
        this.price = price;
        this.amountdebtor = amountdebtor;
    }

    public Books() {
    }

    public int getIdbooks() {
        return idbooks;
    }

    public void setIdbooks(int idbooks) {
        this.idbooks = idbooks;
    }

    public Location getNamelocation() {
        return namelocation;
    }

    public void setNamelocation(Location namelocation) {
        this.namelocation = namelocation;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountdebtor() {
        return amountdebtor;
    }

    public void setAmountdebtor(int amountdebtor) {
        this.amountdebtor = amountdebtor;
    }

    /*@Override
    public String toString() {
        return "Books{" +
                "idbooks=" + idbooks +
                ", namelocation='" + namelocation + '\'' +
                ", namebook='" + namebook + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", amount=" + amount +
                ", price=" + price +
                ", amountdebtor=" + amountdebtor +
                '}';
    }*/
}
