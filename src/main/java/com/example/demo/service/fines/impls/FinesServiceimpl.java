package com.example.demo.service.fines.impls;

import com.example.demo.DAO.fines.impls.FinesDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Fines;
import com.example.demo.model.Fines;
import com.example.demo.service.fines.interfaces.IFinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FinesServiceimpl implements IFinesService {
    @Autowired
    FinesDAOimpl FinesDAO;

    @Override
    public Fines insertFines(Fines fines) {
        return FinesDAO.insertFines(fines);
    }

    @Override
    public Fines getFines(int id) {
        return FinesDAO.getFines(id);

    }

    @Override
    public Fines updateFines(Fines fines) {
        return FinesDAO.updateFines(fines);
    }

    @Override
    public Fines deleteFines(int id) {
        return FinesDAO.deleteFines(id);
    }

    @Override
    public List<Fines> getAll() {
        return FinesDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
