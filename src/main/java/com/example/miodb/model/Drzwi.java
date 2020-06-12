package com.example.miodb.model;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "Drzwi")
public class Drzwi {
    @Id
    @GeneratedValue
    private Long relationshipId;
    @Property
    private String drzwi;
    @Property
    private Double cena;

    @StartNode
    private Samochod samochod;
    @EndNode
    private Ubezpieczyciel ubezpieczyciel;

    public Drzwi(String drzwi, Double cena) {
        this.drzwi = drzwi;
        this.cena = cena;
    }

}