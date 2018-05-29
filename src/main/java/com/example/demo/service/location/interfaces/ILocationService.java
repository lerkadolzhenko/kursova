package com.example.demo.service.location.interfaces;

import com.example.demo.model.Location;

import java.util.List;

public interface ILocationService {
    public Location insertLocation(Location location);

    public Location getLocation(int id);

    public Location updateLocation(Location location);

    public void deleteLocation(int id);

    public List<Location> getAll();
}
