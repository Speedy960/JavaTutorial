package tests;

import HelperMethods.ElementsMethod;
import HelperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {

    public WebDriver driver;


    @Test
    public void metodaTest() {

        //deschidem un browser
        driver = new ChromeDriver();

        //accesam un anumit URL
        driver.get("https://demoqa.com");

        //facem browserul in modul maximize
        driver.manage().window().maximize();

        //facem un scroll la pagina pt vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");


        //Obiecte
        PageMethods PageMethods= new PageMethods(driver);
        ElementsMethod elementsMethod = new ElementsMethod(driver);




        //interactionam cu meniul/submeniul de pe site
        WebElement elementsmenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        elementsmenu.click();

        WebElement webtablessubmenu = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webtablessubmenu.click();


        //definim un element dupa ID
        // test 1: adaug un rand nou
        WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

        WebElement firstNameElement= driver.findElement(By.id("firstName"));
        String firstNameValue = "Robert";
        //firstNameElement.sendKeys(firstNameValue);
        elementsMethod.clearFillElement(firstNameElement, firstNameValue);

        WebElement lastNameElement= driver.findElement(By.id("lastName"));
        String lastNameValue= "Burcus";
        //lastNameElement.sendKeys(lastNameValue);
        elementsMethod.clearFillElement(lastNameElement, lastNameValue);

        WebElement userEmailElement= driver.findElement(By.id("userEmail"));
        String userEmailValue= "robert.burcus@icloud.com";
        userEmailElement.sendKeys(userEmailValue);

        WebElement ageElement= driver.findElement(By.id("age"));
        String ageValue= "27";
        ageElement.sendKeys(ageValue);

        WebElement salaryElement= driver.findElement(By.id("salary"));
        String salaryValue= "10000";
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement= driver.findElement(By.id("department"));
        String departmentValue= "Testing";
        departmentElement.sendKeys(departmentValue);

        WebElement submitElement= driver.findElement(By.id("submit"));
        submitElement.click();


        //test 2: modific un entry existent

        WebElement editElement= driver.findElement(By.id("edit-record-4"));
        editElement.click();

        WebElement editSalaryElement= driver.findElement(By.id("salary"));
        String editSalaryValue= "2000";
        editSalaryElement.clear();
        editSalaryElement.sendKeys(editSalaryValue);

        WebElement editDepartmentElement= driver.findElement(By.id("department"));
        String editDepartmentValue= "HR";
        editDepartmentElement.sendKeys(editDepartmentValue);

        WebElement editSubmitElement= driver.findElement(By.id("submit"));
        editSubmitElement.click();

        //test 3: sterg un entry existent( generat de mine)
        WebElement deleteElement= driver.findElement(By.id("delete-record-4"));
        deleteElement.click();
        driver.quit();






    }


}

