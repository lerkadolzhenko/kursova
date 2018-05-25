package com.example.demo.model;

public class Typeofabonement {
    private int idtypeofabonement;
    private String nametypeofabonement;

    public Typeofabonement(int idtypeofabonement, String nametypeofabonement) {
        this.idtypeofabonement = idtypeofabonement;
        this.nametypeofabonement = nametypeofabonement;
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

    @Override
    public String toString() {
        return "Typeofabonement{" +
                "idtypeofabonement=" + idtypeofabonement +
                ", nametypeofabonement=" + nametypeofabonement +
                '}';
    }
}
