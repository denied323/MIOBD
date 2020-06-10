package com.example.miodb.controller;


import com.example.miodb.model.*;
import com.example.miodb.repository.SamochodRepository;
import lombok.var;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.List;





@Controller
public class WyszukajController {

    @Autowired
    private SamochodRepository samochodRepository;

    @GetMapping("/")
    public String wybierzSamochod(Model model){

        List<String> samochody = samochodRepository.getAllSamochod();
        model.addAttribute("czyWybranoSamochod", false);

        model.addAttribute("samochody", samochody);
        return "index";
    }


    @RequestMapping(value="/", method= RequestMethod.POST)
    public String wybierzOpcje(Model model, @Valid @ModelAttribute("formularz") Formularz formularz, @RequestParam("samochod") String car){


            List<String> samochody = samochodRepository.getAllSamochod();
            model.addAttribute("samochody", samochody);
            model.addAttribute("czyWybranoSamochod", false);
            model.addAttribute("samochod", car);

            List<String> typSilnika = samochodRepository.getAllTypSilnika(car);
            List<String> pojemnoscSilnika = samochodRepository.getAllPojemnoscSilnika(car);


            model.addAttribute("typSilnika", typSilnika);
            model.addAttribute("pojemnoscSilnika", pojemnoscSilnika);

            final Logger logger = LoggerFactory.getLogger(WyszukajController.class);
            logger.info("\n index2 \n");

            return "index2";



    }



    @RequestMapping(value="/wynik", method= RequestMethod.POST)
    public String test(Model model, @Valid @ModelAttribute("formularz") Formularz test){

        final Logger logger = LoggerFactory.getLogger(WyszukajController.class);
        logger.info("\n\n===========================================\n\n wypisz ubezpieczenie \n\n======================================" + test.toString());

        String samochod = test.getSamochod();
        String stan = test.getStan();
        String pojemnoscSilnika = test.getPojemnoscSilnika();
        String typSilnika = test.getTypSilnika();
        String typUbezpieczenia = test.getTypUbezpieczenia();

        logger.info(samochod);
        logger.info(stan);
        logger.info(pojemnoscSilnika);
        logger.info(typSilnika);
        logger.info(typUbezpieczenia);

        List<String> najlepszyUbezpieczycielNazwa = samochodRepository.findNazwaBestUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia);
        List<String> najlepszyUbezpieczycielCena = samochodRepository.findCenaBestUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia);
        for(int i =0; i<najlepszyUbezpieczycielCena.size(); i++){
            Formatter formatter = new Formatter();
            double temp = Double.parseDouble(najlepszyUbezpieczycielCena.get(i));
            formatter.format("%.2f%n", temp);
            String formattedString = formatter.toString();
            najlepszyUbezpieczycielCena.set(i, formattedString);
            logger.info("zmieniono");
        }

        logger.info("\n\n Najlepszy:");
        for(int i =0; i<najlepszyUbezpieczycielCena.size(); i++){
            logger.info(najlepszyUbezpieczycielNazwa.get(i) + " " + najlepszyUbezpieczycielCena.get(i));
        }


        List<String> UbezpieczycielNazwa = samochodRepository.findNazwaUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia);

        List<String> UbezpieczycielCena = samochodRepository.findCenaUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia);

        List<PokazWyniki> wyniki = new ArrayList<>();


        for(int i =0; i<UbezpieczycielNazwa.size(); i++){
            double temp = Double.parseDouble(UbezpieczycielCena.get(i));
            Formatter formatter = new Formatter();
            formatter.format("%.2f%n", temp);
            String formattedString = formatter.toString();
            UbezpieczycielCena.set(i, formattedString);

            PokazWyniki pw = new PokazWyniki(UbezpieczycielNazwa.get(i), UbezpieczycielCena.get(i));
            wyniki.add(pw);
        }







        model.addAttribute("najlepszyUbezpieczycielNazwa", najlepszyUbezpieczycielNazwa.get(0));
        model.addAttribute("najlepszyUbezpieczycielCena", najlepszyUbezpieczycielCena.get(0));
        model.addAttribute("wyniki", wyniki);


        return "index3";



    }







//
//    @RequestMapping(value="/trzy", method = RequestMethod.POST)
//    public String test(Model model, @Valid @ModelAttribute("formularz") Formularz formularz, @RequestParam("samochod") String samochod, @RequestParam("stan") String stan, @RequestParam("pojemnoscSilnika") String pojemnoscSilnika, @RequestParam("typSilnika") String typSilnika, @RequestParam("typUbezpieczenia") String typUbezpieczenia){
//
//
//        List<String> najlepszyUbezpieczyciel = samochodRepository.findBestUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia);
//        model.addAttribute("najlepszyUbezpieczyciel", najlepszyUbezpieczyciel);
//
//        final Logger logger = LoggerFactory.getLogger(WyszukajController.class);
//            logger.info("\n\n===========================================\n\n wypisz ubezpieczenie \n\n======================================");
//            for(int i =0; i<najlepszyUbezpieczyciel.size(); i++){
//                logger.info(najlepszyUbezpieczyciel.get(i));
//            }
//
//
//
//        return "index2";
//    }









}
