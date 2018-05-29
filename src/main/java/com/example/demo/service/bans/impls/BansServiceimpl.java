package com.example.demo.service.bans.impls;

import com.example.demo.model.Bans;
import com.example.demo.repository.BansRepository;
import com.example.demo.service.bans.interfaces.IBansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BansServiceimpl implements IBansService {

    @Autowired
    BansRepository BansRepository;

    @Override
    public Bans insertBans(Bans bans) {
        return BansRepository.save(bans);
    }

    @Override
    public Bans getBans(int id) {
        return BansRepository.getOne(id);

    }

    @Override
    public Bans updateBans(Bans bans) {
        return BansRepository.save(bans);
    }

    @Override
    public void deleteBans(int id) {
         BansRepository.deleteById(id);
    }

    @Override
    public List<Bans> getAll() {
        return BansRepository.findAll();
               /* stream()
                .collect(Collectors.toList());*/
    }
}
