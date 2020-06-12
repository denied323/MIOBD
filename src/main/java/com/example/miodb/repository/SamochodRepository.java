package com.example.miodb.repository;

import com.example.miodb.model.Samochod;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.annotation.QueryResult;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SamochodRepository extends Neo4jRepository<Samochod, Long>{

    /*
        Inicjalizer:
    */
    @Query("CREATE(s1: Samochod { nazwa: 'Audi 80', cena: 425.25})\n" +
            "CREATE(s2: Samochod { nazwa: 'Mitsubishi Carisma', cena: 480.40})\n" +
            "CREATE(s3: Samochod { nazwa: 'Toyota Ercel', cena: 500.70})\n" +
            "CREATE(s4: Samochod { nazwa: 'Mazda MX-5 II (Miata)', cena: 500.0})\n" +
            "CREATE(s5: Samochod { nazwa: 'Toyota Prius', cena: 500.25})\n" +
            "CREATE(s6: Samochod { nazwa: 'Polonez Atu', cena: 562.77})\n" +
            "CREATE(s7: Samochod { nazwa: 'Tesla Roadster', cena: 1450.60})\n" +
            "CREATE(s8: Samochod { nazwa: 'Lamborghini Diablo', cena: 1500.40})")
    void createSamochod();








}
