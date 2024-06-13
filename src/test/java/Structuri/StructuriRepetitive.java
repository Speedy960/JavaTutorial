package Structuri;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //structuri repetitive= for, while, for each

    @Test
    public void metodaTest() {
        //afisareNrFor();
        afisareNrPare();
    }

    //afisam numerele pana la 15

    public void afisareNrFor() {
        for (Integer index = 0; index <= 15; index++) {
            System.out.println(index);
        }
    }

    public void afisareNrWhile() {
        Integer index = 0;
        while (index <= 15) {
            System.out.println(index);
            index++;
        }
    }


    // afisam numerele pare de la 0 la 20

    public void afisareNrPare() {
        for (Integer index = 0; index <= 20; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul" + index + "este par");
            } else {
                System.out.println("Numarul" + index + "este impar");
            }
        }

    }
}
