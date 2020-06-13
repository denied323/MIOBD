package com.example.miodb.model;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "Rok")
public class Rok {

    @Property
    private Double cena;

    @StartNode
    private Samochod samochod;
    @EndNode
    private Ubezpieczyciel ubezpieczyciel;

    public Rok(Double cena) {
        this.cena = cena;
    }

}