package TEMA;

import org.testng.annotations.Test;


public class Fruct {
                public String forma;

                public String culoare;

                public Float pret;

                public Boolean esteExotic;

                public Double greutate;


     @Test
    public void metodaTest(){


     }


     public void afisareFruct(){
         forma="rotund";
         culoare="rosu";
         pret= 10.5f;
         esteExotic= true;
         greutate= 100.0;

         System.out.println("Forma fructului este" + forma);
         System.out.println("Culoarea fructului este" + culoare);
         System.out.println("Pretul fructului este" + pret);
         System.out.println("Este fructul exotic" + esteExotic);
         System.out.println("Greutatea fructului este" + greutate);

     }

     public void afisareoriceFruct(){};



    //descriere fruct ( proprieti  6-7 fructe, @test, parametrii)








}
