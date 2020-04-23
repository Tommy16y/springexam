package com.example.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cinema_name",nullable = false)
    private String cinemaName;
    @Column(name ="cinema_address",nullable = false)
    private String cinemaAddress;
    @Column(name = "cinema_pswd",nullable = false)
    private Long cinemaPswd;



}
