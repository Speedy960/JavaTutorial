package abstractizareInterfata;

public interface AngajatInterface extends CommonInterface {

    // Recunoastem intr-un fisier Java o interfata dupa cuvantul "Interface"
    // O interfata contine numai metode Abstracte(metode care nu au body)
    // Toate metodele dintr-o interfata sunt by default publice
    // Intr-o interfata putem avea atat metode void cat si metode cu return
    // O interfata nu poate contine un constructor
    // Dintr-o interfata nu putem face un obiect
    // O interfata se implementeaza
    // Clasa care implementeaza interfata trebuie sa implementeze toate metodele abstracte din interfete
    // O clasa poate implementa o alta interfata
    // O interfata poate mosteni o alta interfata


    void  mergeLaServiciu();
    void desfasoaraActivitate();
    void beaCafea();
    void incheieActivitate();

}
