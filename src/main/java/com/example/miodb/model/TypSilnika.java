package com.example.miodb.model;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "TypSilnika")
public class TypSilnika {
    @Id
    @GeneratedValue
    private Long relationshipId;
    @Property
    private String typSilnika;
    @Property
    private Double cena;

    @StartNode
    private Samochod samochod;
    @EndNode
    private Ubezpieczyciel ubezpieczyciel;

    public TypSilnika(String typSilnika, Double cena) {
        this.typSilnika = typSilnika;
        this.cena = cena;
    }

}