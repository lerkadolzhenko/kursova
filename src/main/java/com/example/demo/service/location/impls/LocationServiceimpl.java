package com.example.demo.service.location.impls;

import com.example.demo.model.Location;
import com.example.demo.model.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.location.interfaces.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceimpl implements ILocationService {
    @Autowired
    LocationRepository LocationRepository;

    @Override
    public Location insertLocation(Location location) {
        return LocationRepository.save(location);
    }

    @Override
    public Location getLocation(int id) {
        return LocationRepository.getOne(id);

    }

    @Override
    public Location updateLocation(Location location) {
        return LocationRepository.save(location);
    }

    @Override
    public void deleteLocation(int id) {
         LocationRepository.deleteById(id);
    }

    @Override
    public List<Location> getAll() {
        return LocationRepository.findAll();
                /*stream()
                .collect(Collectors.toList());*/
    }
}
