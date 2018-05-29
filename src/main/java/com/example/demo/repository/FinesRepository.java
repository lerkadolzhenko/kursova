package com.example.demo.repository;

import com.example.demo.model.Fines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinesRepository extends JpaRepository <Fines,Integer> {
}
