package com.example.demo1.entity;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="film")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "film_name",nullable = false)
    private String filmName;
    @Column(name = "age_restriction",nullable = false)
    private long age_restriction;

}
