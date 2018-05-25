package com.example.demo.service.typefine.impls;

import com.example.demo.DAO.typefine.impls.TypefineDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Typefine;
import com.example.demo.model.Typefine;
import com.example.demo.service.typefine.interfaces.ITypefineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypefineServiceimpl implements ITypefineService {
    @Autowired
    TypefineDAOimpl TypefineDAO;

    @Override
    public Typefine insertTypefine(Typefine typefine) {
        return TypefineDAO.insertTypefine(typefine);
    }

    @Override
    public Typefine getTypefine(int id) {
        return TypefineDAO.getTypefine(id);

    }

    @Override
    public Typefine updateTypefine(Typefine typefine) {
        return TypefineDAO.updateTypefine(typefine);
    }

    @Override
    public Typefine deleteTypefine(int id) {
        return TypefineDAO.deleteTypefine(id);
    }

    @Override
    public List<Typefine> getAll() {
        return TypefineDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
