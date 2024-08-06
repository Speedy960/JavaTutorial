package staticKeyword;

public class Elev {

    // Static = o alta modalitate de a face share la o variabila/metoda dintr-o clasa
    //Practic putem considera ca fiind pastrarea valorilor pentru toate obiectele definite


    private String nume;
    private String prenume;
    private Integer varsta;
    private static String scoala = "Mihai Eminescu";
    private static Integer nrElevi = 0;

    public Elev(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        nrElevi++;
    }

    public void prezentare(){
        System.out.println("Numele elevului este :" + nume);
        System.out.println("Prenumele elevului este :" + prenume);
        System.out.println("Varsta elevului este :" + varsta);
        System.out.println("Scoala la care merge elevul este :" + scoala);
        System.out.println("Numarul de elevi la scoala este :" + nrElevi);
    }
}

