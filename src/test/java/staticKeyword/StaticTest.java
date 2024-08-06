package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){
        Elev Stefan = new Elev("Stan" , "Stefan", 14);
        Stefan.prezentare();
        System.out.println("------------------------------------");

        Elev Ana = new Elev("Popescu" , "Ana", 15);
        Ana.prezentare();
    }
}
