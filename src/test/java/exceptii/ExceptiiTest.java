package exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptiiTest {


    @Test
    public void metodaTest() throws FileNotFoundException {

        ExceptiiConcept exceptiiConcept =  new ExceptiiConcept();
        //exceptiiConcept.checkedExceptionExample();

        //exceptiiConcept.uncheckedExceptionExample();

        //exceptiiConcept.throwExceptionExample(20);
        //exceptiiConcept.throwExceptionExample(15);

        exceptiiConcept.throwsExceptionExample();
    }


}
