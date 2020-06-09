package com.example.miodb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Formularz {

    private String samochod;
    private String stan;
    private String pojemnoscSilnika;
    private String typSilnika;
    private String typUbezpieczenia;


    public Formularz(String samochod, String stan, String pojemnoscSilnika, String typSilnika, String typUbezpieczenia) {
        this.samochod = samochod;
        this.stan = stan;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typSilnika = typSilnika;
        this.typUbezpieczenia = typUbezpieczenia;

    }
}
