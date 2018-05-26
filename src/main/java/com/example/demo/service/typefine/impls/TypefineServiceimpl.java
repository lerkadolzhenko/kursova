package com.example.demo.service.typefine.impls;

import com.example.demo.DAO.typefine.impls.TypefineDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Typefine;
import com.example.demo.model.Typefine;
import com.example.demo.repository.TypefineRepository;
import com.example.demo.service.typefine.interfaces.ITypefineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypefineServiceimpl implements ITypefineService {
    @Autowired
    TypefineRepository typefineRepository;

    @Override
    public Typefine insertTypefine(Typefine typefine) {
        return typefineRepository.save(typefine);
    }

    @Override
    public Typefine getTypefine(int id) {
        return typefineRepository.getOne(id);

    }

    @Override
    public Typefine updateTypefine(Typefine typefine) {
        return typefineRepository.save(typefine);
    }

    @Override
    public void deleteTypefine(int id) { typefineRepository.deleteById(id);
    }

    @Override
    public List<Typefine> getAll() {
        return typefineRepository.findAll();
    }
}
