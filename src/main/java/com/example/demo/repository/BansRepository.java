package com.example.demo.repository;

import com.example.demo.model.Bans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BansRepository extends JpaRepository <Bans,Integer> {
}
