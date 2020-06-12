package com.example.miodb.controller;


import com.example.miodb.model.*;
import com.example.miodb.repository.SamochodRepository;
import com.example.miodb.repository.ZapytaniaRepository;
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
    private ZapytaniaRepository zapytaniaRepository;

    @GetMapping("/")
    public String wybierzSamochod(Model model){

        List<String> samochody = zapytaniaRepository.getAllSamochod();
        model.addAttribute("samochody", samochody);

        return "index";
    }


    @RequestMapping(value="/", method= RequestMethod.POST)
    public String wybierzOpcje(Model model, @Valid @ModelAttribute("formularz") Formularz formularz, @RequestParam("samochod") String car){

        final Logger logger = LoggerFactory.getLogger(WyszukajController.class);

            List<String> samochody = zapytaniaRepository.getAllSamochod();
            model.addAttribute("samochody", samochody);
            model.addAttribute("samochod", car);

            List<String> typSilnika = zapytaniaRepository.getAllTypSilnika(car);
            List<String> pojemnoscSilnika = zapytaniaRepository.getAllPojemnoscSilnika(car);
            List<String> drzwi = zapytaniaRepository.getAllDrzwi(car);
        List<String> drzwi2 = new ArrayList<>();

            for(int i =0; i<drzwi.size(); i++){
                System.out.println(drzwi.get(i));
                logger.info(drzwi.get(i));
                drzwi2.add(drzwi.get(i));
            }


            model.addAttribute("typSilnika", typSilnika);
            model.addAttribute("pojemnoscSilnika", pojemnoscSilnika);
            model.addAttribute("drzwi", drzwi2);


            logger.info("\n index2 \n");

            return "index2";



    }



    @RequestMapping(value="/wynik", method= RequestMethod.POST)
    public String test(Model model, @Valid @ModelAttribute("formularz") Formularz test){

        final Logger logger = LoggerFactory.getLogger(WyszukajController.class);

        String samochod = test.getSamochod();
        String stan = test.getStan();
        String pojemnoscSilnika = test.getPojemnoscSilnika();
        String typSilnika = test.getTypSilnika();
        String typUbezpieczenia = test.getTypUbezpieczenia();
        String drzwi = test.getDrzwi();


        List<String> najlepszyUbezpieczycielNazwa = zapytaniaRepository.findNazwaBestUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia, drzwi);
        List<String> najlepszyUbezpieczycielCena = zapytaniaRepository.findCenaBestUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia, drzwi);
        for(int i =0; i<najlepszyUbezpieczycielCena.size(); i++){
            Formatter formatter = new Formatter();
            double temp = Double.parseDouble(najlepszyUbezpieczycielCena.get(i));
            formatter.format("%.2f%n", temp);
            String formattedString = formatter.toString();
            najlepszyUbezpieczycielCena.set(i, formattedString);

        }




        List<String> UbezpieczycielNazwa = zapytaniaRepository.findNazwaUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia, drzwi);

        List<String> UbezpieczycielCena = zapytaniaRepository.findCenaUbezpieczenie(samochod, stan, pojemnoscSilnika, typSilnika, typUbezpieczenia, drzwi);

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
