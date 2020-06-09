package com.example.miodb.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type = "Stan")
public class Stan {
    @Id
    @GeneratedValue
    private Long relationshipId;
    @Property
    private String stan;
    @Property
    private Double cena;

    @StartNode
    private Samochod samochod;
    @EndNode
    private Ubezpieczyciel ubezpieczyciel;


    public Stan(String stan, Double cena) {
        this.stan = stan;
        this.cena = cena;
    }
}