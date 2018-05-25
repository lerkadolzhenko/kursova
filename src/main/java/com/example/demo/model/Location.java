package com.example.demo.model;

public class Location {
    private int idlocation;
    private String namelocation;

    public Location(int idlocation, String namelocation) {
        this.idlocation = idlocation;
        this.namelocation = namelocation;
    }

    public int getIdlocation() {
        return idlocation;
    }

    public void setIdlocation(int idlocation) {
        this.idlocation = idlocation;
    }

    public String getNamelocation() {
        return namelocation;
    }

    public void setNamelocation(String namelocation) {
        this.namelocation = namelocation;
    }

    @Override
    public String toString() {
        return "com.example.demo.model.Location{" +
                "idlocation=" + idlocation +
                ", namelocation=" + namelocation +
                '}';
    }
}
