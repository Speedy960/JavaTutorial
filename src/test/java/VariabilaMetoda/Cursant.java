package VariabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    // asta e un comentariu
    // recunoastem o clasa intr-un fisier Java dupa cuvantul cheie "Class"
    // intru-un fisier Java putem avea o multime de clase pe care le diferentiem prin numele lor
    // nu este un practice bun in Java sa avem intr-un fisier mai multe clase
    // in fiecare clasa trebuie sa definim un nume
    // intelegem printr-o clasa ca fiind un sablon specific din viata reala
    // intr-o clasa putem definii variable si metode
    // Variabila= proprietatea unei clase
    // intr-o clasa putem avea mai multe variabile
    // variabilele se diferentieaza prin tip si nume
    // variabilele pot fi de 2 tipuri: global si local
    // Variabila global= proprietate vizibila oriunde in cod
    // Variabila locala= proprietate vizibila doar in locul definit
    // Tipuri de date: String= sir de caractere ; Integer= numar intreg ; double/float= Numar cu decimale ; Character ; Boolean

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    // Metoda= actiunea unei clase
    // intr-o clasa putem avea o multime de metode  diferentiate prin numele acestora
    // exista doua tipuri de metode: void si return
    // metoda Void= actiune pe care vrem sa o afisam/ interpretam fara a fi nevoie sa o returnam
    // pentru o metoda trebuie sa specificam un access control (public), (), si {}

    @Test
    public void metodaTest () {
        descrieCursantul();
        primesteBursa();
    }

    public void primesteBursa() {
        Integer bursa= 1000;
        System.out.println("Bursa cursantului este" + bursa);
    }

    public void descrieCursantul(){
    nume = "Burcus";
    prenume = "Robert";
    varsta = 27;
    adresa = "strada ETC, nr. 1";
    inaltime = 1.70;
    greutate = 68.00f;
    sex = 'M';
    areRestante= true;

        System.out.println("Numele cursantului este "  +  nume); // concatenare
        System.out.println(" Prenumele cursantului este "  +  prenume);
        System.out.println(" Varsta cursantului este "  +  varsta);
        System.out.println("Adresa cursantului este "  +  adresa);
        System.out.println("Cursantul are inaltimea "  +  inaltime);
        System.out.println("Greutatea cursantului este "  +  greutate);
        System.out.println("Sexul cursantului este "  +  sex);
        System.out.println("Are cursantul restante? "  + areRestante);

 }
}
