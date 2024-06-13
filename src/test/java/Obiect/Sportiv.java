package Obiect;

public class Sportiv {

    //programare orientata obiect se bazeaza pe interactiunea cu obiecte
    //obiect = instanta unei clase
    //putem defini un obiect doar daca avem un constructor
    //constructorul = are ca rol sa initializeze atributele unei clase
    //intr-o clasa recunoastem un constructor dupa numele acesteia
    //constructorul este de cele mai multe ori public
    //intr-o clasa pot sa fie mai multi constructori diferentiati dupa numarul sau tipul de parametri
    //intr-o clasa avem un constructor by default fara parametri
    //in momentul cand se defineste un obiect, se apeleaza constructorul din clasa
    //dintr-o clasa putem defini mai mult obiecte
    //obiectele se diferentieaza prin nume si valorile sale
    //un obiect se instantieaza folosind cuvantul "new"
    //un obiect se poate defini in orice clasa din orice pachet
    //in momentul instantierii unui obiect putem avea access la toate variabilele/ metodele din clasa

    public String nume;
    public String prenume;
    public Integer varsta;
    public String sex;
    public String sportPracticat;
    public Boolean teamEvent;
    public Integer salariu;

    //Constructor
    // se poate genera automat cu click dreapta - generate- constructor- select all


    public Sportiv(String prenume, String nume, Integer varsta, String sex, String sportPracticat, Boolean teamEvent) {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta = varsta;
        this.sex = sex;
        this.sportPracticat = sportPracticat;
        this.teamEvent = teamEvent;
    }

    public Sportiv(String prenume, Integer varsta, String nume, String sportPracticat, String sex, Boolean teamEvent, Integer salariu) {
        this.prenume = prenume;
        this.varsta = varsta;
        this.nume = nume;
        this.sportPracticat = sportPracticat;
        this.sex = sex;
        this.teamEvent = teamEvent;
        this.salariu = salariu;
    }

    public void prezentareSportiv() {
        System.out.println("Numele sportivului este" + nume);
        System.out.println("Prenumele sportivului este" + prenume);
        System.out.println("Varsta sportivului este" + varsta);
        System.out.println("Sexul sportivului este" + sex);
        System.out.println("Sportul practicat este" + sportPracticat);
        System.out.println("Este un sport de echipa" + teamEvent);
        System.out.println("Salariul sportivului este" + salariu);
        if (salariu != null) {
            System.out.println("Salariul sportivului este" + salariu);
        }
    }

    public void verificareVarsta() {
        if (varsta >= 18) {
            System.out.println("Sportivul este major");
        } else {
            System.out.println("Sportivul este minor");
        }
    }

    public void marireSalariu(Integer procent){


        if (salariu != null) {
            Integer marire = (salariu * procent) /100;
            salariu = salariu + marire;
            System.out.println("Noul salariu este de" + salariu);
        }
        else {
            System.out.println("Sportivul nu are salariu");
        }

        }

    }


