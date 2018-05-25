package com.example.demo.DAO.bans.impls;

import com.example.demo.DAO.bans.interfaces.IBansDAO;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Bans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BansDAOimpl implements IBansDAO{

    @Autowired
    DataStorageFake dataStorage;

    @Override
    public Bans insertBans(Bans bans) {
        return null;
    }

    @Override
    public Bans getBans(int id) {
        return null;
    }

    @Override
    public Bans updateBans(Bans bans) {
        return null;
    }

    @Override
    public Bans deleteBans(int id) {
        return null;
    }

    @Override
    public List<Bans> getAll() {
        return dataStorage.getBans() ;
    }
}
