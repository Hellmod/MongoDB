package me.tsccoding.mongodb;


import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MongoMain {

    public static void main(String args[]) throws UnknownHostException {

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB mongoDatabase = mongoClient.getDB("Wyporzyczalnia");
        DBCollection collection = mongoDatabase.getCollection("Klient");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int number;

       // collection.findAndRemove(query);
/*
        Klient k2 = new Klient("60", "3", "Rafal", "Miś");
        k2.saveKlient(collection);
*/
/*
        DBCursor cursor = collection.find(query);

        DBObject jo = cursor.next();
        DBObject jo2 = cursor.next();

        Klient k2 = new Klient(jo2);
        System.out.println(k2.toString());
        Klient k = new Klient(jo);
        System.out.println(k.toString());
*/

    do {
        wypisz();
        number = scanner2.nextInt();
        switch (number) {
            case 0:
                System.out.println("Wyjście");
                return;

            case 1:
                Klient.wypiszWszystkichKlientow(collection);


                break;
            case 2:
                System.out.println("Podaj id: ");
                String id = scanner.nextLine();
                System.out.println("Podaj zaufanie: ");
                String zaufanie = scanner.nextLine();
                System.out.println("Podaj imie: ");
                String imie = scanner.nextLine();
                System.out.println("Podaj nazwisko: ");
                String nazwisko = scanner.nextLine();

                Klient k = new Klient(zaufanie,id,imie,nazwisko);
                k.saveKlient(collection);


                break;
            case 3:
                System.out.println("Podaj id: ");
                String id2 = scanner.nextLine();
                DBCursor cursor = collection.find(new BasicDBObject("Id_klient", id2));
                System.out.println(new Klient(cursor.one()).toString());

                break;
        }
    }while (true);


    }

    static void wypisz(){
        System.out.println("################################\n" +
                           "#         MENU                 #\n" +
                           "# 0 Wyjście z systemu          #\n" +
                           "# 1 Wypisz wszystkich klientow #\n" +
                           "# 2 Dodaj klijenta             #\n" +
                           "# 3 Wypisz klijenta o id =     #\n" +
                           "# Co wybierasz?                #");
    }
}
