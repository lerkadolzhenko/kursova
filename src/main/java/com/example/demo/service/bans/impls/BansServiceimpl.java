package com.example.demo.service.bans.impls;

import com.example.demo.DAO.bans.impls.BansDAOimpl;
import com.example.demo.datastorage.DataStorageFake;
import com.example.demo.model.Bans;
import com.example.demo.service.bans.interfaces.IBansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BansServiceimpl implements IBansService {

    @Autowired
    BansDAOimpl BansDAO;

    @Override
    public Bans insertBans(Bans bans) {
        return BansDAO.insertBans(bans);
    }

    @Override
    public Bans getBans(int id) {
        return BansDAO.getBans(id);

    }

    @Override
    public Bans updateBans(Bans bans) {
        return BansDAO.updateBans(bans);
    }

    @Override
    public Bans deleteBans(int id) {
        return BansDAO.deleteBans(id);
    }

    @Override
    public List<Bans> getAll() {
        return BansDAO.getAll().
                stream()
                .collect(Collectors.toList());
    }
}
