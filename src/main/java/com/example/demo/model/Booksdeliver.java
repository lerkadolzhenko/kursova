package com.example.demo.model;

public class Booksdeliver {
    private int idbooksdeliver;
    private String namebook;
    private String namelocation;
    private int amount;
    private String datebooksdeliver;

    public Booksdeliver(int idbooksdeliver, String namebook, String namelocation, int amount, String datebooksdeliver) {
        this.idbooksdeliver = idbooksdeliver;
        this.namebook = namebook;
        this.namelocation = namelocation;
        this.amount = amount;
        this.datebooksdeliver = datebooksdeliver;
    }

    public int getIdbooksdeliver() {
        return idbooksdeliver;
    }

    public void setIdbooksdeliver(int idbooksdeliver) {
        this.idbooksdeliver = idbooksdeliver;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getNamelocation() {
        return namelocation;
    }

    public void setNamelocation(String namelocation) {
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

    @Override
    public String toString() {
        return "Booksdeliver{" +
                "idbooksdeliver=" + idbooksdeliver +
                ", namebook='" + namebook + '\'' +
                ", namelocation='" + namelocation + '\'' +
                ", amount=" + amount +
                ", datebooksdeliver=" + datebooksdeliver +
                '}';
    }
}
