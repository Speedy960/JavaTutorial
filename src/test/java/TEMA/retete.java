package TEMA;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class retete {

@Test
    public void metodaTest(){
    Retete();

}

    //afisam retete cu ingrediente
    public void Retete(){
       Map<String, List<String>> retete= new HashMap<>();

       List<String>IngredienteHumus = new ArrayList<>();
       IngredienteHumus.add("Naut");
       IngredienteHumus.add("Tahini");
       IngredienteHumus.add("Usturoi");
       IngredienteHumus.add("ArdeiCopt");
       IngredienteHumus.add("Sare");

       List<String>IngredienteClatite= new ArrayList<>();
       IngredienteClatite.add("Oua");
       IngredienteClatite.add("Lapte");
       IngredienteClatite.add("ApaMinerala");
       IngredienteClatite.add("Faina");
       IngredienteClatite.add("Unt");
       IngredienteClatite.add("Sare");
       IngredienteClatite.add("Zahar");

       List<String>IngredienteOmleta = new ArrayList<>();
       IngredienteOmleta.add("Oua");
       IngredienteOmleta.add("Ceapa");
       IngredienteOmleta.add("Branza");
       IngredienteOmleta.add("Ardei");
       IngredienteOmleta.add("Sunca");
       IngredienteOmleta.add("Sare");

       List<String>IngredienteBananaBread = new ArrayList<>();
       IngredienteBananaBread.add("Banane");
       IngredienteBananaBread.add("Faina");
       IngredienteBananaBread.add("Bicarbonat");
       IngredienteBananaBread.add("Oua");
       IngredienteBananaBread.add("Sare");
       IngredienteBananaBread.add("ZaharBrun");
       IngredienteBananaBread.add("Scortisoara");
       IngredienteBananaBread.add("Unt");
       IngredienteBananaBread.add("EsentaVanilie");

       List<String>IngredienteBurger = new ArrayList<>();
       IngredienteBurger.add("Chifla");
       IngredienteBurger.add("BurgerVita");
       IngredienteBurger.add("Salata");
       IngredienteBurger.add("Cascaval");
       IngredienteBurger.add("Sos");
       IngredienteBurger.add("Rosii");
       IngredienteBurger.add("CastravetiMurati");
       IngredienteBurger.add("Ceapa");

       retete.put("Humus", IngredienteHumus);
       retete.put("Clatite", IngredienteClatite);
       retete.put("Omleta", IngredienteOmleta);
       retete.put("BananaBread", IngredienteBananaBread);
       retete.put("Burger", IngredienteBurger);

       for (String key: retete.keySet()) {
           System.out.println("Reteta este" + key);
           System.out.println("Ingredientele sunt" + retete.get(key));
       }




    }


}
