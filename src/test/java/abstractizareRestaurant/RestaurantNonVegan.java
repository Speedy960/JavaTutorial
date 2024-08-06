package abstractizareRestaurant;

public class RestaurantNonVegan extends Restaurant implements NonVeganInterface{

    public RestaurantNonVegan(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, meniu, delivery, tipRestaurant);
    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
