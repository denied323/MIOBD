package com.example.miodb.model;

import org.neo4j.ogm.annotation.*;


@RelationshipEntity(type = "TypUbezpieczenia")
public class TypUbezpieczenia {
    @Id
    @GeneratedValue
    private Long relationshipId;
    @Property
    private String nazwa;
    @Property
    private Double cena;

    @StartNode
    private Samochod samochod;
    @EndNode
    private Ubezpieczyciel ubezpieczyciel;

    public TypUbezpieczenia(String nazwa, Double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }


}


