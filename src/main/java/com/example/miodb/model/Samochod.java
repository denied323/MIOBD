package com.example.miodb.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NoArgsConstructor
@Data
@NodeEntity
public class Samochod {

    @Id
    private Long id;
    private String nazwa;
//    private Double cena;
    private int rokOd;
    private int rokDo;


    public Samochod(String nazwa, int rokOd, int rokDo) {
        this.nazwa = nazwa;
        this.rokOd = rokOd;
        this.rokDo = rokDo;
    }


}
