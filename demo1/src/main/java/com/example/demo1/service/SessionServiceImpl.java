package com.example.demo1.service;

import com.example.demo1.entity.Session;
import com.example.demo1.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;
    @Override
    public Session create(Session session) {
        return sessionRepository.save(session);
    }
}
