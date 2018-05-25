package com.example.demo.service.typeofabonement.impls;

import com.example.demo.DAO.typeofabonement.impls.TypeofabonementDAOimpl;
import com.example.demo.model.Typeofabonement;
import com.example.demo.service.typeofabonement.interfaces.ITypeofabonementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeofabonementServiceimpl implements ITypeofabonementService {
    @Autowired
    TypeofabonementDAOimpl TypeofabonementDAO;

    @Override
    public Typeofabonement insertTypeofabonement(Typeofabonement typeofabonement) {
        return TypeofabonementDAO.insertTypeofabonement(typeofabonement);
    }

    @Override
    public Typeofabonement getTypeofabonement(int id) {
        return TypeofabonementDAO.getTypeofabonement(id);

    }

    @Override
    public Typeofabonement updateTypeofabonement(Typeofabonement typeofabonement) {
        return TypeofabonementDAO.updateTypeofabonement(typeofabonement);
    }

    @Override
    public Typeofabonement deleteTypeofabonement(int id) {
        return TypeofabonementDAO.deleteTypeofabonement(id);
    }

    @Override
    public List<Typeofabonement> getAll() {
        return TypeofabonementDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
