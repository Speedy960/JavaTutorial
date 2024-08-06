package abstractizareRestaurant;

public class RestaurantVegan extends Restaurant implements VeganInterface{

    public RestaurantVegan(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, meniu, delivery, tipRestaurant);
    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}
