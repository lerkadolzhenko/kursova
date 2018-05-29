package com.example.demo.service.bans.interfaces;

import com.example.demo.model.Bans;

import java.util.List;

public interface IBansService {
    public Bans insertBans(Bans bans);

    public Bans getBans(int id);

    public Bans updateBans(Bans bans);

    public void deleteBans(int id);

    public List<Bans> getAll();
}
