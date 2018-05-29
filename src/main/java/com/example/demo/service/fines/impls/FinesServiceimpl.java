package com.example.demo.service.fines.impls;


import com.example.demo.model.Fines;
import com.example.demo.model.Fines;
import com.example.demo.repository.FinesRepository;
import com.example.demo.service.fines.interfaces.IFinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FinesServiceimpl implements IFinesService {
    @Autowired
    FinesRepository FinesRepository;

    @Override
    public Fines insertFines(Fines fines) {
        return FinesRepository.save(fines);
    }

    @Override
    public Fines getFines(int id) {
        return FinesRepository.getOne(id);

    }

    @Override
    public Fines updateFines(Fines fines) {
        return FinesRepository.save(fines);
    }

    @Override
    public void deleteFines(int id) {
         FinesRepository.deleteById(id);
    }

    @Override
    public List<Fines> getAll() {
        return FinesRepository.findAll();
        /*.
                stream()
                .collect(Collectors.toList());*/
    }
}
