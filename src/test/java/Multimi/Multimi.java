package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    // Multimi= array, list( arraylist), map

    @Test
    public void metodaTest() {
        //afisareColegiArray();
        //afisareColegiArrayList();
        //obiecteMap();
        tariOrase();
    }

    // afisam numele colegilor de la curs
    public void afisareColegiArray() {
        String[] colegi = new String[6];
        colegi[0] = "Robert";
        colegi[1] = "Daniel";
        colegi[2] = "Marius";
        colegi[3] = "Vlad";
        colegi[4] = "Corina";
        colegi[5] = "Alex";
        for (Integer index = 0; index < colegi.length; index++)
            System.out.println("Numele cursantului este: " + colegi[index]);
    }

    //afisam numele colegilor de la curs (arraylist)
    public void afisareColegiArrayList() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Larisa");
        colegi.add("Robert");
        colegi.add("Daniel");
        colegi.add("Vad");
        colegi.add("Corina");
        colegi.add("Alex");
        for (Integer index = 0; index < colegi.size(); index++)
            System.out.println("Numele cursantului este: " + colegi.get(index));

    }

    // key-value
    public void obiecteMap() {
        Map<String, String> obiecte = new HashMap<>();
        obiecte.put("Fruct", "Mar");
        obiecte.put("Masina", "BMW");
        obiecte.put("Telefon", "iPhone");
        obiecte.put("Banca", "Raiffeisen");
        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este" + key);
            System.out.println("Valoarea este" + obiecte.get(key));
        }

    }
    // afisam cateva tari cu orasele aferente
    public void tariOrase(){
        Map<String, List<String>> tari= new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Cluj");
        oraseRomania.add("Sibiu");
        oraseRomania.add("Timisoara");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Roma");
        oraseItalia.add("Verona");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valenica");
        oraseSpania.add("Madrid");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);

        for (String key: tari.keySet()) {
            System.out.println("Tara este" + key);
            System.out.println("Orasele sunt" + tari.get(key));
        }

    }

}








