package com.example.demo1.service;

import com.example.demo1.entity.Bilet;
import com.example.demo1.repository.BiletRepository;

public class BiletServiceImpl implements BiletService {
    private BiletRepository biletRepository;
    @Override
    public Bilet create(Bilet bilet) {
        return biletRepository.save(bilet);
    }
}
