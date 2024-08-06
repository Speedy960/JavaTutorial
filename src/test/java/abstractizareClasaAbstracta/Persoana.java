package abstractizareClasaAbstracta;

public abstract class Persoana {

    //Recunoastem o clasa abstracta dupa cuvantul abstract
    //Clasa abstracta poate sa contina sau nu, metode abstracte
    //Intr-o clasa abstracta putem avea un constructor => nu putem face un obiect din clasa abstracta
    // O clasa poate mosteni doar o singura clasa/ clasa abstracta
    // O clasa abstracta poate implementa una sau mai multe interfete
    // Intr-o clasa abstracta putem avea metode void sau return
    // Metodele abstracte dintr-o clasa abstracta trebuie sa aiba access control


    private String nume;
    private String prenume;
    private Integer varsta;
    private Double inaltime;
    private Character sex;

    public Persoana(String nume, String prenume, Integer varsta, Double inaltime, Character sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.inaltime = inaltime;
        this.sex = sex;
    }

    public abstract void mananca();
    public abstract void doarme();
    public  abstract void iaPauza();
    public abstract void iaSalar();
    public abstract void  mergeLaServiciu();
    public abstract void desfasoaraActivitate();
    public abstract void beaCafea();
    public abstract void incheieActivitate();
    public abstract void cautaDeLucru();
    public abstract void depuneCV();
    public abstract void staAcasa();
    public abstract void mergeLaFacultate();
    public abstract void invata();
    public abstract void daExamene();
    public abstract void primesteNote();
    public abstract void mergeLaRestante();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Double getInaltime() {
        return inaltime;
    }

    public void setInaltime(Double inaltime) {
        this.inaltime = inaltime;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
