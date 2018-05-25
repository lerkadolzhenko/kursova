package com.example.demo.model;

public class Bookstatus {
    private int idbookstatus;
    private String namebooksatus;

    public Bookstatus(int idbookstatus, String namebooksatus) {
        this.idbookstatus = idbookstatus;
        this.namebooksatus = namebooksatus;
    }

    public int getIdbookstatus() {
        return idbookstatus;
    }

    public void setIdbookstatus(int idbookstatus) {
        this.idbookstatus = idbookstatus;
    }

    public String getNamebooksatus() {
        return namebooksatus;
    }

    public void setNamebooksatus(String namebooksatus) {
        this.namebooksatus = namebooksatus;
    }

    @Override
    public String toString() {
        return "com.example.demo.model.Bookstatus{" +
                "idbookstatus=" + idbookstatus +
                ", namebooksatus=" + namebooksatus +
                '}';
    }
}
