package com.example.miodb.model;

public class PokazWyniki {

    private String nazwa;
    private String cena;


    public PokazWyniki(String nazwa, String cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa(){
        return nazwa;
    }

    public String getCena(){
        return cena;
    }


}
