package com.example.demo.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "typeofabonement")
@EntityListeners(AuditingEntityListener.class)

public class Typeofabonement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtypeofabonement;
    private String nametypeofabonement;

    public Typeofabonement(int idtypeofabonement, String nametypeofabonement) {
        this.idtypeofabonement = idtypeofabonement;
        this.nametypeofabonement = nametypeofabonement;
    }

    public Typeofabonement(String nametypeofabonement) {
        this.nametypeofabonement = nametypeofabonement;
    }

    public Typeofabonement() {
    }


    public int getIdtypeofabonement() {
        return idtypeofabonement;
    }

    public void setIdtypeofabonement(int idtypeofabonement) {
        this.idtypeofabonement = idtypeofabonement;
    }

    public String getNametypeofabonement() {
        return nametypeofabonement;
    }

    public void setNametypeofabonement(String nametypeofabonement) {
        this.nametypeofabonement = nametypeofabonement;
    }

    /*@Override
    public String toString() {
        return "Typeofabonement{" +
                "idtypeofabonement=" + idtypeofabonement +
                ", nametypeofabonement=" + nametypeofabonement +
                '}';
    }*/
}
