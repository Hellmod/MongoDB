package me.tsccoding.mongodb;

public class Inwestor extends Czlowiek {
    private int kapital;

    Inwestor(int kapital, int id_klient, String imie, String nazwisko){
        setKapital(kapital);
        setId_klient(id_klient);
        setImie(imie);
        setNazwisko(nazwisko);
    }

    void wyolacNalerzne(){

    }

    public void setKapital(int kapital) {
        this.kapital = kapital;
    }

    public int getKapital() {
        return kapital;
    }
}
