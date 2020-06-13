
package com.example.miodb.Config;

import com.example.miodb.model.*;
import com.example.miodb.repository.MatchRepository.AvivaRepository;
import com.example.miodb.repository.MatchRepository.AxaRepository;
import com.example.miodb.repository.MatchRepository.Link4Repository;
import com.example.miodb.repository.MatchRepository.WesternUnionRepository;
import com.example.miodb.repository.SamochodRepository;
import com.example.miodb.repository.UbezpieczycielRepository;
import com.example.miodb.repository.ZapytaniaRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RepositoriesInitializer {


    @Autowired
    private ZapytaniaRepository zapytaniaRepository;

    @Autowired
    private UbezpieczycielRepository ubezpieczycielRepository;

    @Autowired
    private SamochodRepository samochodRepository;

    @Autowired
    private AvivaRepository avivaRepository;

    @Autowired
    private WesternUnionRepository westernUnionRepository;

    @Autowired
    private Link4Repository link4Repository;

    @Autowired
    private AxaRepository axaRepository;



    @Bean
    InitializingBean init() {

        return () -> {


            zapytaniaRepository.wyczysc();

            if (zapytaniaRepository.getAllSamochod().isEmpty()) {//przyjmijmy, że jeśli repozytorium typów jest puste, to trzeba zainicjalizować bazę danych

                samochodRepository.createSamochod();
                ubezpieczycielRepository.createUbezpieczyciel();

                //aviva:
                avivaRepository.audi80();
                avivaRepository.mitsubishicarisma();
                avivaRepository.toyotatercel();
                avivaRepository.mazdamiata();
                avivaRepository.toyotaprius();
                avivaRepository.polonezatu();
                avivaRepository.teslaroadster();
                avivaRepository.lamborginidiablo();

                //western union
                westernUnionRepository.audi80();
                westernUnionRepository.mitsubishicarisma();
                westernUnionRepository.toyotatercel();
                westernUnionRepository.mazdamiata();
                westernUnionRepository.toyotaprius();
                westernUnionRepository.polonezatu();
                westernUnionRepository.teslaroadster();
                westernUnionRepository.lamborginidiablo();

                //link4:
                link4Repository.audi80();
                link4Repository.mitsubishicarisma();
                link4Repository.toyotatercel();
                link4Repository.mazdamiata();
                link4Repository.toyotaprius();
                link4Repository.polonezatu();
                link4Repository.teslaroadster();
                link4Repository.lamborginidiablo();

                //axa:
                axaRepository.audi80();
                axaRepository.mitsubishicarisma();
                axaRepository.toyotatercel();
                axaRepository.mazdamiata();
                axaRepository.toyotaprius();
                axaRepository.polonezatu();
                axaRepository.teslaroadster();
                axaRepository.lamborginidiablo();

            };

        };

    }

}


