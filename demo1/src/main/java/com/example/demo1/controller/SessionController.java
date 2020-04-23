package com.example.demo1.controller;

import com.example.demo1.service.SessionService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping
    public Session create(@RequestBody Session session){
        return sessionService.create(session); //не понимаю почему ошибка
    }

}
