package me.tsccoding.mongodb;

public class Inwestor extends Czlowiek {
    private String kapital;

    Inwestor(String kapital, String id_klient, String imie, String nazwisko){
        setKapital(kapital);
        setId_klient(id_klient);
        setImie(imie);
        setNazwisko(nazwisko);
    }

    void wyolacNalerzne(){

    }

    public void setKapital(String kapital) {
        this.kapital = kapital;
    }

    public String getKapital() {
        return kapital;
    }
}
