package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "bookstatus")
@EntityListeners(AuditingEntityListener.class)

public class Bookstatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbookstatus;
    private String namebooksatus;

    public Bookstatus() {
    }

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
