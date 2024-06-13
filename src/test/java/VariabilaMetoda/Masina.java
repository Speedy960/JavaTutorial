package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;

    public String model;

    public Float pret;

    public Integer an;

    public Boolean  esteDecapotata;

    public Double greutate;

    @Test
    public void metodaTest(){
        afisareMasina();
        System.out.println("---exemplu pentru orice masina---");
        afisareOriceMasina("Toyota", "CHR", 1500.0f, 20000,  false,  2020.0);
        afisareOriceMasina("Nissan", "Leaf", 1000.0f, 15000,  true, 2021.0);
    }


        //Descriem o masina

    public void afisareMasina(){
        marca="Dacia";
        model="Logan";
        pret=2000.5f;
        an=2012;
        esteDecapotata=true;
        greutate=900.0;

        System.out.println("Marca masinii este" +  marca);
        System.out.println("Modelul masinii este" + model);
        System.out.println("Greutatea masinii este" + greutate);
        System.out.println("Pretul masinii este" + pret);
        System.out.println("Este masina decapotata"+ esteDecapotata);
        System.out.println("Anul masinii este" + an);
    }


    //Descriem orice masina

    public void afisareOriceMasina(String marca, String model, Float pret, Integer an, Boolean esteDecapotata, Double greutate){

        System.out.println("Marca masinii este" +  marca);
        System.out.println("Modelul masinii este" + model);
        System.out.println("Greutatea masinii este" + greutate);
        System.out.println("Pretul masinii este" + pret);
        System.out.println("Este masina decapotata"+ esteDecapotata);
        System.out.println("Anul masinii este" + an);

    }

}
