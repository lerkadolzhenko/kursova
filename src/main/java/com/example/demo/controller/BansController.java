package com.example.demo.controller;

import com.example.demo.model.Bans;
import com.example.demo.service.bans.impls.BansServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class BansController {
    @Autowired
    BansServiceimpl BansService;

    @RequestMapping("/Bans")
    public List<Bans> showBans()
    {
        return BansService.getAll();
    }
}
