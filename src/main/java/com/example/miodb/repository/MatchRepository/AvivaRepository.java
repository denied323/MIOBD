package com.example.miodb.repository.MatchRepository;

import com.example.miodb.model.Samochod;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;


public interface AvivaRepository extends Neo4jRepository<Samochod, Long> {

    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Audi 80' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: '1.6 71 KM', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: '1.6 102 KM', cena: 1.62}]->(b)\n" +
            "CREATE (a)-[s1ps3:PojemnoscSilnika {pojemnoscSilnika: '2.0 90 KM', cena: 2.0}]->(b)\n" +
            "CREATE (a)-[s1ps4:PojemnoscSilnika {pojemnoscSilnika: '2.0E 16V Quaddro 115KM', cena: 2.14}]->(b)\n" +
            "CREATE (a)-[s1ps5:PojemnoscSilnika {pojemnoscSilnika: '2.0E 16V 140 KM', cena: 2.20}]->(b)\n" +
            "CREATE (a)-[s1ps6:PojemnoscSilnika {pojemnoscSilnika: '2.3E 133 KM', cena: 2.3}]->(b)\n" +
            "CREATE (a)-[s1ps7:PojemnoscSilnika {pojemnoscSilnika: '2.6E 150 KM', cena: 2.5}]->(b)\n" +
            "CREATE (a)-[s1ps8:PojemnoscSilnika {pojemnoscSilnika: '2.8E 150 KM', cena: 2.8}]->(b)\n" +
            "CREATE (a)-[s1ps9:PojemnoscSilnika {pojemnoscSilnika: '2.8E Quaddro 174 KM', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ts1:TypSilnika {typSilnika: 'benzynowy', cena: 1.5}]->(b)\n" +
            "CREATE (a)-[s1ts3:TypSilnika {typSilnika: 'diesel', cena: 1.6}]->(b)" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void audi80();


    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Mitsubishi Carisma' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: '1.3 82 KM', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: '1.6 99 KM', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1ps3:PojemnoscSilnika {pojemnoscSilnika: '1.6 103 KM', cena: 1.605}]->(b)\n" +
            "CREATE (a)-[s1ps4:PojemnoscSilnika {pojemnoscSilnika: '1.8 GDI 122 KM', cena: 1.8}]->(b)\n" +
            "CREATE (a)-[s1ps5:PojemnoscSilnika {pojemnoscSilnika: '1.8 GDI 125 KM', cena: 1.805}]->(b)\n" +
            "CREATE (a)-[s1ts1:TypSilnika {typSilnika: 'benzynowy', cena: 1.5}]->(b)\n" +
            "CREATE (a)-[s1ts2:TypSilnika {typSilnika: 'diesel', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void mitsubishicarisma();



    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Toyota Ercel' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: 'R4 1.3 85 KM', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: 'R4 1.5 TD 109 KM', cena: 1.49}]->(b)\n" +
            "CREATE (a)-[s1ts1:TypSilnika {typSilnika: 'benzynowy', cena: 1.5}]->(b)\n" +
            "CREATE (a)-[s1ts2:TypSilnika {typSilnika: 'diesel', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void toyotatercel();


    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Mazda MX-5 II (Miata)' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: '1.6i R4 108 KM', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: '1.6i R4 110 KM', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1ps3:PojemnoscSilnika {pojemnoscSilnika: '1.8i R4 140 KM', cena: 1.8}]->(b)\n" +
            "CREATE (a)-[s1ps4:PojemnoscSilnika {pojemnoscSilnika: '1.8i R4 146 KM', cena: 1.809}]->(b)\n" +
            "CREATE (a)-[s1ps5:PojemnoscSilnika {pojemnoscSilnika: '1.8 R4 MazdaSpeed 178 KM', cena: 2.05}]->(b)\n" +
            "CREATE (a)-[s1ps6:PojemnoscSilnika {pojemnoscSilnika: '2.0i R4 167 KM', cena: 1.97}]->(b)\n" +
            "CREATE (a)-[s1ts1:TypSilnika {typSilnika: 'benzynowy', cena: 1.5}]->(b)\n" +
            "CREATE (a)-[s1ts2:TypSilnika {typSilnika: 'diesel', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void mazdamiata();


    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Toyota Prius' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: '1.8 96 KM', cena: 1.75}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: '1.8 116 KM', cena: 1.8}]->(b)\n" +
            "CREATE (a)-[s1ts1:TypSilnika {typSilnika: 'hybrydowy', cena: 1.4}]->(b)\n" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void toyotaprius();

    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Polonez Atu' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: '1.4 GLI 16V 103 KM', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: '1.6 GLI 80 KM', cena: 1.5}]->(b)\n" +
            "CREATE (a)-[s1ps3:PojemnoscSilnika {pojemnoscSilnika: '1.9 GLD 70 KM', cena: 1.4}]->(b)\n" +
            "CREATE (a)-[s1ts1:TypSilnika {typSilnika: 'benzynowy', cena: 1.5}]->(b)\n" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void polonezatu();


    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Tesla Roadster' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: 'Base model 185 KM', cena: 2.2}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: 'Sport model 248 KM', cena: 3.5}]->(b)\n" +
            "CREATE (a)-[s1ps3:PojemnoscSilnika {pojemnoscSilnika: 'Sport model 288 KM', cena: 3.8}]->(b)\n" +
            "CREATE (a)-[s1ts3:TypSilnika {typSilnika: 'elektryczny', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void teslaroadster();


    @Query("Match (a:Samochod),(b:Ubezpieczyciel) WHERE a.nazwa = 'Lamborghini Diablo' AND b.nazwa = 'Aviva'\n" +
            "CREATE (a)-[s1stan1:Stan {stan: 'bezwypadkowy', cena: 1.3}]->(b)\n" +
            "CREATE (a)-[s1stan2:Stan {stan: 'wypadkowy', cena: 3.0}]->(b)\n" +
            "CREATE (a)-[s1ps1:PojemnoscSilnika {pojemnoscSilnika: '5.7 V12 492 KM', cena: 4.4}]->(b)\n" +
            "CREATE (a)-[s1ps2:PojemnoscSilnika {pojemnoscSilnika: '5.7 V12 517 KM', cena: 5.0}]->(b)\n" +
            "CREATE (a)-[s1ps3:PojemnoscSilnika {pojemnoscSilnika: '5.7 V12 595 KM', cena: 5.5}]->(b)\n" +
            "CREATE (a)-[s1ps4:PojemnoscSilnika {pojemnoscSilnika: '6.0 V12 550 KM', cena: 5.2}]->(b)\n" +
            "CREATE (a)-[s1ps5:PojemnoscSilnika {pojemnoscSilnika: '6.0 V12 575 KM', cena: 5.41}]->(b)\n" +
            "CREATE (a)-[s1ts1:TypSilnika {typSilnika: 'diesel', cena: 1.6}]->(b)\n" +
            "CREATE (a)-[s1tu1:TypUbezpieczenia {typUbezpieczenia: 'OC', cena: 1.0}]->(b)\n" +
            "CREATE (a)-[s1tu2:TypUbezpieczenia {typUbezpieczenia: 'AC', cena: 2.0}]->(b)\n" +
            "RETURN type(s1stan1)")
    void lamborginidiablo();







}
