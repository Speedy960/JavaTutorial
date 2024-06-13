package Obiect;

import org.testng.annotations.Test;

public class SportivTest {


    @Test

    public void prezentareSportiv (){
        //instantiem un obiect de tipul sportiv
        Sportiv Robert =  new Sportiv("Robert", "Burcus", 28, "M","Baschet", true);

        Robert.prezentareSportiv();
        Robert.varsta=29;
        Robert.sportPracticat= "Fotbal";
        Robert.prezentareSportiv();
        Robert.verificareVarsta();

        System.out.println("-----------------------");

        Sportiv Maria= new Sportiv("Maria", "Udroiu", 25, "F", "Badmington", false);

        Maria.prezentareSportiv();
        Maria.verificareVarsta();

        System.out.println("----------------------------------------");

        Sportiv Rob = new Sportiv("Rob",28, "Burcus", "M", "Tenis",true, 2000);


    }
}
