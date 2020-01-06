package me.tsccoding.mongodb;

import com.mongodb.DBObject;

public class Klient extends Czlowiek {
    private int zaufanie;

    Klient(int zaufanie, int id_klient, String imie, String nazwisko){
        setZaufanie(zaufanie);
        setId_klient(id_klient);
        setImie(imie);
        setNazwisko(nazwisko);
    }
    Klient(DBObject object){
        setZaufanie((Integer) object.get("Zaufanie"));
        setId_klient((Integer) object.get("Id_klient"));
        setImie((String) object.get("Imie"));
        setNazwisko((String) object.get("Nazwisko"));
    }

    void obliczZaufanie(){

    }

    void loadKlient(DBObject object){
        setZaufanie((Integer) object.get("Zaufanie"));
        setId_klient((Integer) object.get("Id_klient"));
        setImie((String) object.get("Imie"));
        setNazwisko((String) object.get("Nazwisko"));

    }

    public int getZaufanie() {
        return zaufanie;
    }

    public void setZaufanie(int zaufanie) {
        this.zaufanie = zaufanie;
    }

    @Override
    public String toString() {
        return super.toString()+" "+zaufanie;
    }
}
