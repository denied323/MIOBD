package com.example.miodb.model;

import org.neo4j.ogm.annotation.*;

@RelationshipEntity(type = "PojemnoscSilnika")
public class PojemnoscSilnika {
    @Id
    @GeneratedValue
    private Long relationshipId;
    @Property
    private String pojemnoscSilnika;
    @Property
    private Double cena;

    @StartNode
    private Samochod samochod;
    @EndNode
    private Ubezpieczyciel ubezpieczyciel;

    public PojemnoscSilnika(String pojemnoscSilnika, Double cena) {
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cena = cena;
    }

}