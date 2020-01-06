package me.tsccoding.mongodb;

public class Czlowiek {
    protected String id_klient;
    protected String imie;
    protected String nazwisko;

    public String getId_klient() {
        return id_klient;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setId_klient(String id_klient) {
        this.id_klient = id_klient;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return " | id_klient= "+id_klient+" | imie= "+imie+" | nazwisko= "+nazwisko;
    }


}
