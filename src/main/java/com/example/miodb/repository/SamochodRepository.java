package com.example.miodb.repository;

import com.example.miodb.model.Samochod;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface SamochodRepository extends Neo4jRepository<Samochod, Long>{

    @Query("MATCH (a:Samochod) return a.nazwa")
    List<String> getAllSamochod();


}
