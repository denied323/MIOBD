package com.example.miodb.repository;

import com.example.miodb.model.Samochod;
import com.example.miodb.model.Ubezpieczyciel;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.annotation.QueryResult;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UbezpieczycielRepository extends Neo4jRepository<Ubezpieczyciel, Long>{

    @Query("CREATE(u1: Ubezpieczyciel { nazwa: 'Aviva', cenaPoczatkowa: 500.14})\n" +
            "CREATE(u2: Ubezpieczyciel { nazwa: 'Western Union', cenaPoczatkowa: 500.15})\n" +
            "CREATE(u3: Ubezpieczyciel { nazwa: 'Link 4', cenaPoczatkowa: 502.64 })\n" +
            "CREATE(u4: Ubezpieczyciel { nazwa: 'Axa', cenaPoczatkowa: 499.2})")
    void createUbezpieczyciel();






}
