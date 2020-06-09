package com.example.miodb.controller;


import com.example.miodb.model.*;
import com.example.miodb.repository.SamochodRepository;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;





@Controller
public class WyszukajController {

    @Autowired
    private SamochodRepository samochodRepository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String pokazOpcje(Model model){


//        @Relationship(type="Stan", direction = Relationship.INCOMING) private List<Stan> stan;
//        @Relationship(type="PojemnoscSilnika", direction = Relationship.INCOMING) private List<PojemnoscSilnika> pojemnoscSilnika;
//        @Relationship(type="TypSilnika", direction = Relationship.INCOMING) private List<TypSilnika> typSilnika;
//        @Relationship(type="TypUbezpieczenia", direction = Relationship.INCOMING) private List<TypUbezpieczenia> typUbezpieczenia;


        List<String> samochody = samochodRepository.getAllSamochod();


        model.addAttribute("samochody", samochody);
        return "index";
    }



    @RequestMapping(value="/", method = RequestMethod.POST)
    public String pokazNajUbezpieczyciela(Model model, @Valid @ModelAttribute("formularz") Formularz formularz){


        String asd = null;

        return "index";
    }


}
