package com.example.demo.service.location.impls;

import com.example.demo.DAO.location.impls.LocationDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Location;
import com.example.demo.model.Location;
import com.example.demo.service.location.interfaces.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceimpl implements ILocationService {
    @Autowired
    LocationDAOimpl LocationDAO;

    @Override
    public Location insertLocation(Location location) {
        return LocationDAO.insertLocation(location);
    }

    @Override
    public Location getLocation(int id) {
        return LocationDAO.getLocation(id);

    }

    @Override
    public Location updateLocation(Location location) {
        return LocationDAO.updateLocation(location);
    }

    @Override
    public Location deleteLocation(int id) {
        return LocationDAO.deleteLocation(id);
    }

    @Override
    public List<Location> getAll() {
        return LocationDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
