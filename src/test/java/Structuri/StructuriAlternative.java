package Structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri Alternative: If..Then..Else/ Switch..Case


    @Test

    public void metodaTest() {
        verificNrMaiMare();
        //verificNrMaiMareV2(11);
        //verificNrMaiMareV2(8);
//        verificNrPar(7);
//        verificNrPar(0);
//        verificNrPar(-1);
//        verificNrPar(-4);
        zileSaptamana(7);


    }

    //verificam daca un numar este mai mare decat 10
    public void verificNrMaiMare() {
        if (15 > 10) {
            System.out.println("Numarul 15 este mai mare ca 10");
        } else {
            System.out.println("Numarul 15 nu este mai mare ca 10");
        }
    }

    //verificam daca un numar este mai mare decat 10 - V2

    public void verificNrMaiMareV2(Integer nr) {
        if (nr > 10) {
            System.out.println("Numarul" + nr + "este mai mare ca 10");
        } else {
            System.out.println("Numarul" + nr + "nu este mai mare ca 10");
        }

    }

    //verificam daca un nr este par si pozitiv
    public void verificNrPar(Integer nr) {
        //daca vrem sa luam catul impartirii = /(divide)
        //daca vrem sa luam restul impartirii = %(modulo)
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println("Numarul meu este pozitiv" + nr + "si par");
            } else {
                System.out.println("Numarul meu este pozitiv" + nr + "si impar");
            }

        } else if (nr < 0) {
            if (nr % 2 == 0) {

                System.out.println("Numarul meu este negativ" + nr + "si par");
            } else {
                System.out.println("Numarul meu este negativ" + nr + "si impar");
            }

        } else {
            System.out.println("Numarul meu este egal cu 0");
        }
    }

    //Definim zilele saptamanii

    public void zileSaptamana(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            default:
                System.out.println("S-au terminat zilele");

        }

    }
}

