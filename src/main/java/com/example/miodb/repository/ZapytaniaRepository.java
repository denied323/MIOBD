package com.example.miodb.repository;

import com.example.miodb.model.Samochod;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ZapytaniaRepository extends Neo4jRepository<Samochod, Long> {


    @Query("MATCH (a:Samochod) return a.nazwa")
    List<String> getAllSamochod();

    @Query("MATCH (a:Samochod)-[c:PojemnoscSilnika]->(b:Ubezpieczyciel) \n" +
            "where a.nazwa = $phrase " +
            "return DISTINCT c.pojemnoscSilnika " +
            "order by c.pojemnoscSilnika ASC")
    List<String> getAllPojemnoscSilnika(@Param("phrase") String phrase);

    @Query("MATCH (a:Samochod)-[c:TypSilnika]->(b:Ubezpieczyciel) " +
            "where a.nazwa = $phrase " +
            "return DISTINCT c.typSilnika")
    List<String> getAllTypSilnika(@Param("phrase") String phrase);


    @Query("MATCH (a:Samochod)-[c:Drzwi]->(b:Ubezpieczyciel) " +
            "where a.nazwa = $phrase " +
            "return DISTINCT c.drzwi " +
            " order by c.drzwi ASC")
    List<String> getAllDrzwi(@Param("phrase") String phrase);




    @Query("match (a:Samochod)-[d:Stan]->(b:Ubezpieczyciel), " +
            "(a)-[e:PojemnoscSilnika]->(b), " +
            "(a)-[f:TypSilnika]->(b), " +
            "(a)-[g:TypUbezpieczenia]->(b), " +
            "(a)-[h:Drzwi]->(b) " +
            "where a.nazwa = $nazwaSamochodu AND d.stan = $nazwaStanu AND e.pojemnoscSilnika = $nazwaPojemnoscSilnika AND f.typSilnika = $nazwaTypSilnika AND g.typUbezpieczenia = $nazwaTypuUbezpieczenia AND h.drzwi = $iloscdrzwi " +
            "return b.nazwa as nazwa " +
            "ORDER BY (a.cena*(d.cena + e.cena + f.cena + g.cena+h.cena)) ASC limit 1")
    List<String> findNazwaBestUbezpieczenie(@Param("nazwaSamochodu") String nazwaSamochodu, @Param("nazwaStanu") String nazwaStanu, @Param("nazwaPojemnoscSilnika") String nazwaPojemnoscSilnika, @Param("nazwaTypSilnika") String nazwaTypSilnika, @Param("nazwaTypuUbezpieczenia") String nazwaTypuUbezpieczenia, @Param("iloscdrzwi") String drzwi);



    @Query("match (a:Samochod)-[d:Stan]->(b:Ubezpieczyciel), " +
            "(a)-[e:PojemnoscSilnika]->(b), " +
            "(a)-[f:TypSilnika]->(b), " +
            "(a)-[g:TypUbezpieczenia]->(b), " +
            "(a)-[h:Drzwi]->(b) " +
            "where a.nazwa = $nazwaSamochodu AND d.stan = $nazwaStanu AND e.pojemnoscSilnika = $nazwaPojemnoscSilnika AND f.typSilnika = $nazwaTypSilnika AND g.typUbezpieczenia = $nazwaTypuUbezpieczenia AND h.drzwi = $iloscdrzwi " +
            "return (a.cena*(d.cena + e.cena + f.cena + g.cena+h.cena)) as cena " +
            "order by cena ASC limit 1")
    List<String> findCenaBestUbezpieczenie(@Param("nazwaSamochodu") String nazwaSamochodu, @Param("nazwaStanu") String nazwaStanu, @Param("nazwaPojemnoscSilnika") String nazwaPojemnoscSilnika, @Param("nazwaTypSilnika") String nazwaTypSilnika, @Param("nazwaTypuUbezpieczenia") String nazwaTypuUbezpieczenia, @Param("iloscdrzwi") String drzwi);



    @Query("match (a:Samochod)-[d:Stan]->(b:Ubezpieczyciel), " +
            "(a)-[e:PojemnoscSilnika]->(b), " +
            "(a)-[f:TypSilnika]->(b), " +
            "(a)-[g:TypUbezpieczenia]->(b), " +
            "(a)-[h:Drzwi]->(b) " +
            "where a.nazwa = $nazwaSamochodu AND d.stan = $nazwaStanu AND e.pojemnoscSilnika = $nazwaPojemnoscSilnika AND f.typSilnika = $nazwaTypSilnika AND g.typUbezpieczenia = $nazwaTypuUbezpieczenia AND h.drzwi = $iloscdrzwi  " +
            "return b.nazwa as nazwa " +
            "ORDER BY (a.cena*(d.cena + e.cena + f.cena + g.cena+h.cena)) ASC ")
    List<String> findNazwaUbezpieczenie(@Param("nazwaSamochodu") String nazwaSamochodu, @Param("nazwaStanu") String nazwaStanu, @Param("nazwaPojemnoscSilnika") String nazwaPojemnoscSilnika, @Param("nazwaTypSilnika") String nazwaTypSilnika, @Param("nazwaTypuUbezpieczenia") String nazwaTypuUbezpieczenia, @Param("iloscdrzwi") String drzwi);



    @Query("match (a:Samochod)-[d:Stan]->(b:Ubezpieczyciel), " +
            "(a)-[e:PojemnoscSilnika]->(b), " +
            "(a)-[f:TypSilnika]->(b), " +
            "(a)-[g:TypUbezpieczenia]->(b), " +
            "(a)-[h:Drzwi]->(b) " +
            "where a.nazwa = $nazwaSamochodu AND d.stan = $nazwaStanu AND e.pojemnoscSilnika = $nazwaPojemnoscSilnika AND f.typSilnika = $nazwaTypSilnika AND g.typUbezpieczenia = $nazwaTypuUbezpieczenia AND h.drzwi = $iloscdrzwi  " +
            "return (a.cena*(d.cena + e.cena + f.cena + g.cena+h.cena)) as cena " +
            "order by cena ASC ")
    List<String> findCenaUbezpieczenie(@Param("nazwaSamochodu") String nazwaSamochodu, @Param("nazwaStanu") String nazwaStanu, @Param("nazwaPojemnoscSilnika") String nazwaPojemnoscSilnika, @Param("nazwaTypSilnika") String nazwaTypSilnika, @Param("nazwaTypuUbezpieczenia") String nazwaTypuUbezpieczenia, @Param("iloscdrzwi") String drzwi);


}
