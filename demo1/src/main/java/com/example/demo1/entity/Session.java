package com.example.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.graalvm.compiler.core.match.MatchableNode;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @Column(name = "cinema_to",nullable = false)
    private Cinema cinemaTo;
    @ManyToOne
    @Column(name = "to_film",nullable = false)
    private Film toFilm;
    @Column(name = "zd",nullable = false)
    private Boolean ZD;



}
