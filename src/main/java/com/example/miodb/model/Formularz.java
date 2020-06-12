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
    private String drzwi;


    public Formularz(String samochod, String stan, String pojemnoscSilnika, String typSilnika, String typUbezpieczenia, String drzwi) {
        this.samochod = samochod;
        this.stan = stan;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.typSilnika = typSilnika;
        this.typUbezpieczenia = typUbezpieczenia;
        this.drzwi = drzwi;
    }

    public String getSamochod(){
        return samochod;
    }

    public String getStan(){
        return stan;
    }

    public String getPojemnoscSilnika(){
        return pojemnoscSilnika;
    }

    public String getTypSilnika(){
        return typSilnika;
    }

    public String getTypUbezpieczenia(){
        return typUbezpieczenia;
    }

    public String getDrzwi(){
        return drzwi;
    }


}
