package com.example.demo.DAO.location.interfaces;

import com.example.demo.model.Location;

import java.util.List;

public interface ILocationDAO {
    public Location insertLocation(Location location);

    public Location getLocation(int id);

    public Location updateLocation(Location location);

    public Location deleteLocation(int id);

    public List<Location> getAll();
}
