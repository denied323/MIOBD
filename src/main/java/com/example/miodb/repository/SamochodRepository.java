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
    @Query("CREATE(s1: Samochod { nazwa: 'Audi 80', rokOd: 1991, rokDo: 1995})\n" +
            "CREATE(s2: Samochod { nazwa: 'Mitsubishi Carisma', rokOd: 1995, rokDo: 2004})\n" +
            "CREATE(s3: Samochod { nazwa: 'Toyota Ercel', rokOd: 1978, rokDo: 1999})\n" +
            "CREATE(s4: Samochod { nazwa: 'Mazda MX-5 II (Miata)', rokOd: 1989, rokDo: 1998})\n" +
            "CREATE(s5: Samochod { nazwa: 'Toyota Prius', rokOd: 2009, rokDo: 2015})\n" +
            "CREATE(s6: Samochod { nazwa: 'Polonez Atu', rokOd: 1996, rokDo: 1997})\n" +
            "CREATE(s7: Samochod { nazwa: 'Tesla Roadster', rokOd: 2019, rokDo: 2020 })\n" +
            "CREATE(s8: Samochod { nazwa: 'Lamborghini Diablo', rokOd: 1991, rokDo: 2000})")
    void createSamochod();








}
