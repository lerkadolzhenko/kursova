package com.example.demo.DAO.bans.interfaces;

import com.example.demo.model.Bans;

import java.util.List;

public interface IBansDAO {
    public Bans insertBans(Bans bans);

    public Bans getBans(int id);

    public Bans updateBans(Bans bans);

    public Bans deleteBans(int id);

    public List<Bans> getAll();
}
