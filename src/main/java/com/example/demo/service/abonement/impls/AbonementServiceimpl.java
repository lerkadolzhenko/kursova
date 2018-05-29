package com.example.demo.service.abonement.impls;

import com.example.demo.model.Abonement;
import com.example.demo.repository.AbonementRepository;
import com.example.demo.service.abonement.interfaces.IAbonementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbonementServiceimpl implements IAbonementService {

    @Autowired
    AbonementRepository AbonementRepository;

    @Override
    public Abonement insertAbonement(Abonement abonement) {
        return AbonementRepository.save(abonement);
    }

    @Override
    public Abonement getAbonement(int id) {
        return AbonementRepository.getOne(id);

    }

    @Override
    public Abonement updateAbonement(Abonement abonement) {
        return AbonementRepository.save(abonement);
    }

    @Override
    public void deleteAbonement(int id) {
        AbonementRepository.deleteById(id);
    }

    @Override
    public List<Abonement> getAll() {
        return AbonementRepository.findAll();
              /*  stream()
                .collect(Collectors.toList());*/
    }
}
