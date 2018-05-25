package com.example.demo.service.abonement.impls;

import com.example.demo.DAO.abonement.impls.AbonementDAOimpl;
import com.example.demo.model.Abonement;
import com.example.demo.service.abonement.interfaces.IAbonementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbonementServiceimpl implements IAbonementService {

    @Autowired
    AbonementDAOimpl AbonementDAO;

    @Override
    public Abonement insertAbonement(Abonement abonement) {
        return AbonementDAO.insertAbonement(abonement);
    }

    @Override
    public Abonement getAbonement(int id) {
        return AbonementDAO.getAbonement(id);

    }

    @Override
    public Abonement updateAbonement(Abonement abonement) {
        return AbonementDAO.updateAbonement(abonement);
    }

    @Override
    public Abonement deleteAbonement(int id) {
        return AbonementDAO.deleteAbonement(id);
    }

    @Override
    public List<Abonement> getAll() {
        return AbonementDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
