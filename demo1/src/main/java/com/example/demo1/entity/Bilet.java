package com.example.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="bilet")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Bilet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @Column(name ="to_the_film",nullable =false)
    private Film toTheFilm;
    @Column(name = "is_buy",nullable = false)
    private Boolean isBuy;
}
