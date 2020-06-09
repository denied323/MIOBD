package com.example.miodb.controller;


import com.example.miodb.model.*;
import com.example.miodb.repository.SamochodRepository;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;





@Controller
public class WyszukajController {

    @Autowired
    private SamochodRepository samochodRepository;

    @RequestMapping(value="/", method = {RequestMethod.GET})
    public String wybierzSamochod(Model model){

        List<String> samochody = samochodRepository.getAllSamochod();
        model.addAttribute("czyWybranoSamochod", false);

        model.addAttribute("samochody", samochody);
        return "index";
    }


    @RequestMapping(value="/", method=RequestMethod.POST)
    public String wybierzOpcje(Model model, @Valid @ModelAttribute("formularz") Formularz formularz, @RequestParam("samochod") String car){

        if(car==null || car==""){
            List<String> samochody = samochodRepository.getAllSamochod();
            model.addAttribute("samochody", samochody);
            model.addAttribute("czyWybranoSamochod", false);
        }else{
            List<String> samochody = samochodRepository.getAllSamochod();
            model.addAttribute("samochody", samochody);
            model.addAttribute("czyWybranoSamochod", true);
            model.addAttribute("samochod", car);




            List<String> typSilnika = samochodRepository.getAllTypSilnika(car);




            List<String> pojemnoscSilnika = samochodRepository.getAllPojemnoscSilnika(car);

            final Logger logger = LoggerFactory.getLogger(WyszukajController.class);


            logger.info("\n\n===========================================\n\n POJEMNOSC \n\n======================================");
            for(int i =0; i<pojemnoscSilnika.size(); i++){
                logger.info(pojemnoscSilnika.get(i));
            }

            logger.info("\n\n===========================================\n\n TYP \n\n======================================");
            for(int i =0; i<typSilnika.size(); i++){
                logger.info(typSilnika.get(i));
            }



            model.addAttribute("typSilnika", typSilnika);
            model.addAttribute("pojemnoscSilnika", pojemnoscSilnika);

        }




        return "index";
    }


    @RequestMapping(value="/index2.html", method = {RequestMethod.GET, RequestMethod.POST})
    public String test(Model model, @RequestParam("car") String car){




        return "index2";
    }









}
