package exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptiiConcept {

    // Exceptie = eroare care apare in  momentul in care programul ruleaza
    // Exceptiile trebuie tratate deoarece pot contine informatii din interior ce pot fi exploatate
    // Sunt 2 tipuri de exceptii : Checked si Unchecked

    // Checked = exceptii care se trateaza in timpul compilarii
    // Acest tip de Exceptii mosteneste clasa Exceptions

    // Unchecked = exceptii care nu se trateaza in timpul compilarii
    // Acest tip de Exceptii mosteneste clasa RUNTimeExceptions

    // Exista 2 keywords pt tratarea exceptiilor : Throw and Throws
    // Throw = folosit sa arunce explicit o exceptie/ Este regasit in interiorul unei metode
    // Throws = folosit in semnatura metodei/ Ca sa poate declara ca o metoda sa arunce o exceptie
    // De cele mai multe ori Exceptiile se trateaza folosind o structura : Try... Catch...Finally

    // Incercam sa citim continutul unui fisier

    public void checkedExceptionExample() {
        File file = new File("C://Proba.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("A intrat pe clauza de Catch! Fisierul nu exista");
        } finally {
            System.out.println("A intrat pe clauza de Finally! Indiferent daca a mers sau nu pe Catch tot apeleaza si Finally");
        }
    }

    public void uncheckedExceptionExample() {
        Integer[] multimi = new Integer[2];
        multimi[0] = 15;
        multimi[1] = 30;
        multimi[2] = 40;

        System.out.println(multimi[2]);
    }

    public void throwExceptionExample(Integer varsta) {
        if (varsta < 18) {
            throw new RuntimeException("Nu iti dau tigari!");
        } else {
            System.out.println("Persoana poate primi tigari!");
        }

    }

    public void throwsExceptionExample() throws FileNotFoundException {
        File file = new File("C://Proba.txt");
        FileInputStream fileInputStream = new FileInputStream(file);


    }
}

