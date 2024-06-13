package Obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest(){
        System.out.println("=== TELEFON: IPHONE 15 ===");
        Map<String, String> specificatiiIphone15 = new HashMap<>();
        specificatiiIphone15.put("Model procesor ", "Apple A16 Bionic");
        specificatiiIphone15.put("Sistem de operare ", "iOS");
        specificatiiIphone15.put("Memorie RAM ", "6 GB");
        specificatiiIphone15.put("Rezolutie video ", "full HD");
        specificatiiIphone15.put("Numar camere " , "2");
        specificatiiIphone15.put("Tip display " , "Super Retina XDR");
        specificatiiIphone15.put("Porturi " , "USB Type C");

        List<String> iphone15Accessorii = new ArrayList<>();
        iphone15Accessorii.add("Incarcator Brick");
        iphone15Accessorii.add("Cablu USB");
        iphone15Accessorii.add("Casti");
        iphone15Accessorii.add("Stickere");

        Telefon iPhone15 = new Telefon("iPhone", "15", "Negru", "128 GB",
                1500, specificatiiIphone15, iphone15Accessorii, false);
        iPhone15.infoTelefon();

        System.out.println("=== TELEFON: SAMSUNG S24 ===");
        Map<String, String> specificatiiSamsungS24 = new HashMap<>();
        specificatiiSamsungS24.put("Model procesor ", "Dragon");
        specificatiiSamsungS24.put("Sistem de operare ", "Android");
        specificatiiSamsungS24.put("Memorie RAM ", "8 GB");
        specificatiiSamsungS24.put("Rezolutie video ", "full HD");
        specificatiiSamsungS24.put("Numar camere " , "4");
        specificatiiSamsungS24.put("Tip display " , "Super OLED");
        specificatiiSamsungS24.put("Porturi " , "USB Type C");

        List<String> SamsungS24Accessorii = new ArrayList<>();
        SamsungS24Accessorii.add("Incarcator");
        SamsungS24Accessorii.add("Cablu USB");
        SamsungS24Accessorii.add("Casti");
        SamsungS24Accessorii.add("Stickere");
        SamsungS24Accessorii.add("Stylus");

        Telefon SamsungS24 = new Telefon("Samsung", "S24", "Alb", "128 GB", 1800,
                specificatiiSamsungS24, SamsungS24Accessorii, false);
        SamsungS24.infoTelefon();

        System.out.println("===Telefon: Huawei ===");
        Map<String, String> specificatiiHuawei = new HashMap<>();
        specificatiiHuawei.put("Model procesor ", "Dragon");
        specificatiiHuawei.put("Sistem de operare ", "Android");
        specificatiiHuawei.put("Memorie RAM ", "8 GB");
        specificatiiHuawei.put("Rezolutie video ", "full HD");
        specificatiiHuawei.put("Numar camere " , "4");
        specificatiiHuawei.put("Tip display " , "Super OLED");
        specificatiiHuawei.put("Porturi " , "USB Type C");

        List<String> huaweiAccessorii = new ArrayList<>();
        huaweiAccessorii.add("Incarcator");
        huaweiAccessorii.add("Cablu USB");

        Telefon HuaweiPro = new Telefon("Huawei", "Alb", "Pro", "128",
                1500, specificatiiHuawei, huaweiAccessorii, true,"Urme fine de uzura");
        HuaweiPro.infoTelefon();







    }
}
