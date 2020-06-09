/*
package com.example.miodb.Config;

import com.example.miodb.model.*;
import com.example.miodb.repository.SamochodRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

@Configuration
public class RepositoriesInitializer {


    @Autowired
    private SamochodRepository samochodRepository;

    @Bean
    InitializingBean init() {

        return () -> {

            if (samochodRepository.getAllSamochod().isEmpty()) {//przyjmijmy, że jeśli repozytorium typów jest puste, to trzeba zainicjalizować bazę danych

                Samochod sam1 = new Samochod("Audi 80",500.0);
                Samochod sam2 = new Samochod("Mitsubishi Carisma",600);
                Samochod sam3 = new Samochod("Polonez Atu",900);
                Samochod sam4 = new Samochod("Polonez Caro",895);
                Samochod sam5 = new Samochod("Toyota Corolla",680);
                Samochod sam6 = new Samochod("Toyota Yaris",777);
                Samochod sam7 = new Samochod("Mazda Miata",600);
                Samochod sam8 = new Samochod("BMW Z8",1100);
                Samochod sam9 = new Samochod("Nissan 240sx",456);
                Samochod sam10 = new Samochod("Lamborghini Gallardo",2000);


                Ubezpieczyciel ub1 = new Ubezpieczyciel("Aviva");
                Ubezpieczyciel ub2 = new Ubezpieczyciel("Western Union");
                Ubezpieczyciel ub3 = new Ubezpieczyciel("Link 4");


                Stan st1ub1 = new Stan("Nie używany nowy", 1.5);
                Stan st2ub1 = new Stan("Używany, bezwypadkowy", 2.0);
                Stan st3ub1 = new Stan("Używany, wypadkowy", 3.5);

                Stan st1ub2 = new Stan("Nie używany nowy", 1.4);
                Stan st2ub2 = new Stan("Używany, bezwypadkowy", 2.2);
                Stan st3ub2 = new Stan("Używany, wypadkowy", 3.4);

                Stan st1ub3 = new Stan("Nie używany nowy", 1.6);
                Stan st2ub3 = new Stan("Używany, bezwypadkowy", 2.1);
                Stan st3ub3 = new Stan("Używany, wypadkowy", 3.45);


                PojemnoscSilnika ps0ub1 = new PojemnoscSilnika("1.4", 1.4);
                PojemnoscSilnika ps1ub1 = new PojemnoscSilnika("1.6", 1.6);
                PojemnoscSilnika ps2ub1 = new PojemnoscSilnika("1.8", 1.8);
                PojemnoscSilnika ps3ub1 = new PojemnoscSilnika("2.0", 2.0);
                PojemnoscSilnika ps4ub1 = new PojemnoscSilnika("2.2", 2.2);

                PojemnoscSilnika ps0ub2 = new PojemnoscSilnika("1.4", 1.52);
                PojemnoscSilnika ps1ub2 = new PojemnoscSilnika("1.6", 1.67);
                PojemnoscSilnika ps2ub2 = new PojemnoscSilnika("1.8", 1.88);
                PojemnoscSilnika ps3ub2 = new PojemnoscSilnika("2.0", 2.1);
                PojemnoscSilnika ps4ub2 = new PojemnoscSilnika("2.2", 2.17);

                PojemnoscSilnika ps0ub3 = new PojemnoscSilnika("1.4", 1.3);
                PojemnoscSilnika ps1ub3 = new PojemnoscSilnika("1.6", 1.44);
                PojemnoscSilnika ps2ub3 = new PojemnoscSilnika("1.8", 1.88);
                PojemnoscSilnika ps3ub3 = new PojemnoscSilnika("2.0", 2.1);
                PojemnoscSilnika ps4ub3 = new PojemnoscSilnika("2.2", 2.3);


                TypSilnika tp1ub1 = new TypSilnika("spalinowy", 1.1);
                TypSilnika tp2ub1 = new TypSilnika("hybrydowy", 1.2);
                TypSilnika tp3ub1 = new TypSilnika("elektryczny", 1.5);

                TypSilnika tp1ub2 = new TypSilnika("spalinowy", 1.2);
                TypSilnika tp2ub2 = new TypSilnika("hybrydowy", 1.25);
                TypSilnika tp3ub2 = new TypSilnika("elektryczny", 1.6);

                TypSilnika tp1ub3 = new TypSilnika("spalinowy", 1.4);
                TypSilnika tp2ub3 = new TypSilnika("hybrydowy", 1.3);
                TypSilnika tp3ub3 = new TypSilnika("elektryczny", 1.36);



                return args -> {
                    samochodRepository.save(new PojemnoscSilnika());
                    s
                };



                /*
                Race singapore = new Race("Singapore");

                Driver hamilton = new Driver("Lewis Hamilton",44);
                Driver vettel = new Driver("Sebastian Vettel", 5);

                return args -> {
                    resultRepository.save(new Result(1,hamilton,italy));
                    resultRepository.save(new Result(2,vettel,italy));

                    resultRepository.save(new Result(4,hamilton,singapore));
                    resultRepository.save(new Result(3,vettel,singapore));
                };

            };


        };

    }

}


*/