package com.example.demo.repository;

import com.example.demo.model.Bookstatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStatusRepository extends JpaRepository<Bookstatus,Integer> {
}
