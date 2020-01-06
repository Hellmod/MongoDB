package me.tsccoding.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import java.util.Arrays;

public class Klient extends Czlowiek {
    private String zaufanie;

    Klient(String zaufanie, String id_klient, String imie, String nazwisko){
        setZaufanie(zaufanie);
        setId_klient(id_klient);
        setImie(imie);
        setNazwisko(nazwisko);
    }

    Klient(DBObject object){
        setZaufanie((String) object.get("Zaufanie"));
        setId_klient((String) object.get("Id_klient"));
        setImie((String) object.get("Imie"));
        setNazwisko((String) object.get("Nazwisko"));
    }

    void saveKlient(DBCollection collection){
        DBObject person = new BasicDBObject("Id_klient", getId_klient())
                .append("Imie", getImie())
                .append("Nazwisko", getNazwisko())
                .append("Zaufanie", getZaufanie())
                .append("Rent", Arrays.asList(1, 2));
        collection.insert(person);
    }

    static void  wypiszWszystkichKlientow(DBCollection collection){
        DBCursor cursor = collection.find(new BasicDBObject());
        while ( cursor.hasNext()){
            System.out.println(new Klient(cursor.next()).toString());
        }
    }

    void obliczZaufanie(){
        System.out.println("Obliczono zaufanie");
    }

    void loadKlient(DBObject object){
        setZaufanie((String) object.get("Zaufanie"));
        setId_klient((String) object.get("Id_klient"));
        setImie((String) object.get("Imie"));
        setNazwisko((String) object.get("Nazwisko"));
    }

    public String getZaufanie() {
        return zaufanie;
    }

    public void setZaufanie(String zaufanie) {
        this.zaufanie = zaufanie;
    }

    @Override
    public String toString() {
        return super.toString()+" | zaufanie= "+zaufanie;
    }
}
