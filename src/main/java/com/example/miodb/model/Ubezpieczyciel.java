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
public class Ubezpieczyciel {

    @Id
    private Long id;
    private String nazwa;
    @Relationship(type="Stan", direction = Relationship.INCOMING) private List<Stan> stan;
    @Relationship(type="PojemnoscSilnika", direction = Relationship.INCOMING) private List<PojemnoscSilnika> pojemnoscSilnika;
    @Relationship(type="TypSilnika", direction = Relationship.INCOMING) private List<TypSilnika> typSilnika;
    @Relationship(type="TypUbezpieczenia", direction = Relationship.INCOMING) private List<TypUbezpieczenia> typUbezpieczenia;



    public Ubezpieczyciel(String nazwa) {
        this.nazwa = nazwa;
    }

}
