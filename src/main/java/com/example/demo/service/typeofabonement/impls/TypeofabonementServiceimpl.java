package com.example.demo.service.typeofabonement.impls;

import com.example.demo.model.Typeofabonement;
import com.example.demo.repository.TypeOfAbonementRepository;
import com.example.demo.service.typeofabonement.interfaces.ITypeofabonementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeofabonementServiceimpl implements ITypeofabonementService {
    @Autowired
    TypeOfAbonementRepository TypeofabonementRepository;

    @Override
    public Typeofabonement insertTypeofabonement(Typeofabonement typeofabonement) {
        return TypeofabonementRepository.save(typeofabonement);
    }

    @Override
    public Typeofabonement getTypeofabonement(int id) {
        return TypeofabonementRepository.getOne(id);

    }

    @Override
    public Typeofabonement updateTypeofabonement(Typeofabonement typeofabonement) {
        return TypeofabonementRepository.save(typeofabonement);
    }

    @Override
    public void deleteTypeofabonement(int id) {
         TypeofabonementRepository.deleteById(id);
    }

    @Override
    public List<Typeofabonement> getAll() {
        return TypeofabonementRepository.findAll();
               /* stream()
                .collect(Collectors.toList());*/
    }
}
