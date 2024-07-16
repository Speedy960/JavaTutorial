package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    public String versiune;
    public String motor;
    public String culoare;
    public String jante;
    public String interior;
    public List<String> echipamente;
    public List<String> accessorii;


    public DaciaConfigurator(String marca, String model, Integer an,
                             String versiune, String motor, String culoare, String jante, String interior,
                             List<String> echipamente, List<String> accessorii) {
        super(marca, model, an);
        this.versiune = versiune;
        this.motor= motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accessorii = accessorii;
    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este:" + versiune);
        System.out.println("Motorul masinii este:" + motor);
        System.out.println("Culoarea masinii este:" + culoare);
        System.out.println("Jantele masinii sunt:" + jante);
        System.out.println("Interiorul masinii este compus din:" + interior);

        System.out.println("Echipamentele masinii sunt:");
        for (Integer i=0; i< echipamente.size(); i++){
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accessoriile masinii sunt:");
        for (Integer i=0; i< accessorii.size(); i++){
            System.out.println(accessorii.get(i));
        }

        calculPretStandard();
        calculPretFinal();
    }

    //trebuie sa determinam pretul standard in functie de modelul masini( Dacia vs VW)

    public void calculPretStandard(){
        if( model.equals("Logan")) {
            if (versiune.equals("Essential")){
                pretStandard = 13.500;
            }
            if(versiune.equals("Expression")){
                pretStandard = 14.150 ;
            }
            if (versiune.equals("Journey")){
                pretStandard = 15.250;
            }
            if (versiune.equals("Journey+")){
                pretStandard = 15.700;
            }
        }

        if(model.equals("Duster")){
            if (versiune.equals("Essential")){
                pretStandard = 18.800;
            }
            if (versiune.equals("Expression")){
                pretStandard = 20.000;
            }
            if (versiune.equals("Journey")){
                pretStandard = 21.500;
            }
            if (versiune.equals("Extreme")){
                pretStandard = 21.500;
            }
        }

        //System.out.println("Pretul standard este :" +pretStandard);
        System.out.printf("Pretul standard este: %,.3f \n", pretStandard);         //metoda de afisare nr cu multiple decimale
        // \n command new line from string
    }

    public void calculPretFinal(){
        double pretOptiuni = 0.000;

        if(model.equals("Logan")){
            if(versiune.equals("Essential")){
                switch (culoare){
                    case "Grey":
                        pretOptiuni += 0.460;   // += shortcut pt pretOptiuni = pretOptiuni + 0.460
                        break;
                    case "White":
                        pretOptiuni += 0;
                        break;
                }
                switch (jante){
                    case "Standard":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (interior){
                    case "Standard":
                        pretOptiuni += 0;
                        break;
                }
            }
        }

        if (model.equals("Duster")){
            if (versiune.equals("Expression")){
                switch (culoare){
                    case "Shiste Grey":
                        pretOptiuni += 0.500;
                        break;
                    case "White":
                        pretOptiuni += 0;
                        break;
                    case "Sandstone":
                        pretOptiuni += 0.700;
                        break;
                }
                switch (jante){
                    case "Standard":
                        pretOptiuni += 2.100;
                        break;
                }
                switch (interior){
                    case "Standard":
                        pretOptiuni += 0;
                        break;
                }
                    }
            for (String echipamente: echipamente) {
                switch (echipamente) {
                    case "Scaune incalzite":
                        pretOptiuni += 0.300;
                        break;
                    case "Media Nav":
                        pretOptiuni += 0.250;
                        break;
                }
            }
            for (String accessorii: accessorii) {
                switch (accessorii) {
                    case "Suport bicicleta":
                        pretOptiuni += 0.195;
                        break;
                    case "Trepte":
                        pretOptiuni += 0.560;
                        break;
                    case "Carlig":
                        pretOptiuni += 0.492;
                        break;
                    case "Cadru porbagaj":
                        pretOptiuni += 0.309;
                        break;
                }
            }
        }

        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final este: %,.3f \n", pretFinal);



    }

}
