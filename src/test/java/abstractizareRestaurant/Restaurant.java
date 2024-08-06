package abstractizareRestaurant;

public class Restaurant {

    private String numeRestaurant;
    private String adresa;
    private String meniu;
    private Boolean delivery;
    private String tipRestaurant;

    public Restaurant(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.adresa = adresa;
        this.meniu = meniu;
        this.delivery = delivery;
        this.tipRestaurant = tipRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public String getTipRestaurant() {
        return tipRestaurant;
    }

    public void setTipRestaurant(String tipRestaurant) {
        this.tipRestaurant = tipRestaurant;
    }
}

// De incercat sa reproduc o nationala de fotbal !!!!
// Primul nivel este Persoana
// Al 2 -lea nivel este Fotbalist/Antrenor/Medic
// Interfata Antrenor cu comportament specific
// Interfata Medic cu comportament specific : consulta
// Interfete Jucator cu diverse(portar, fundas(central, lateral), atacant))
