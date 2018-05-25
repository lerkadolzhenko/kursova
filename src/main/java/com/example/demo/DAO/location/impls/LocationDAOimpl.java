package com.example.demo.DAO.location.impls;

import com.example.demo.DAO.location.interfaces.ILocationDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class LocationDAOimpl implements ILocationDAO {
    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Location insertLocation(Location location) {
        return null;
    }

    @Override
    public Location getLocation(int id) {
        return null;
    }

    @Override
    public Location updateLocation(Location location) {
        return null;
    }

    @Override
    public Location deleteLocation(int id) {
        return null;
    }

    @Override
    public List<Location> getAll() {
        return dataStorage.getLocation() ;
    }
}
