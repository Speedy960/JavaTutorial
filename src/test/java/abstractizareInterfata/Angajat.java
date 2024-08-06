package abstractizareInterfata;

public class Angajat  extends  Persoana implements AngajatInterface{

    public Angajat(String nume, String prenume, Integer varsta, Double inaltime, Character sex) {
        super(nume, prenume, varsta, inaltime, sex);
    }

    @Override
    public void mergeLaServiciu() {

    }

    @Override
    public void desfasoaraActivitate() {

    }

    @Override
    public void beaCafea() {

    }

    @Override
    public void incheieActivitate() {

    }

    @Override
    public void mananca() {

    }

    @Override
    public void doarme() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void iaSalar() {

    }
}
