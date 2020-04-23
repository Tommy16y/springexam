package com.example.demo1.repository;

import com.example.demo1.entity.Bilet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiletRepository extends JpaRepository<Bilet,Long> {
}
