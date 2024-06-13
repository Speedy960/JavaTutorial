package tests;

import HelperMethods.ElementsMethod;
import HelperMethods.PageMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {

        //deschidem un browser
        driver = new ChromeDriver();

        //accesam un anumit URL
        driver.get("https://demoqa.com");

        //facem browserul in modul maximize
        driver.manage().window().maximize();

        //Obiecte
        ElementsMethod elementsMethod = new ElementsMethod(driver);
        PageMethods pageMethods = new PageMethods(driver);


        //facem un scroll la pagina pt vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");
        pageMethods.scrollPage(0,350);


        //interactionam cu meniul/submeniul de pe site
        WebElement formmenu = driver.findElement(By.xpath("//h5[text()='Forms']"));
        //formmenu.click();
        elementsMethod.clickElement(formmenu);


        WebElement practiceformsubmenu = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        //practiceformsubmenu.click();
        elementsMethod.clickElement(practiceformsubmenu);

        //first Name
        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstNameValue = "Robert";
        //firstNameElement.sendKeys(firstNameValue);
        elementsMethod.fillElement(firstNameElement,firstNameValue);

        //last Name
        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastNameValue = "Burcus";
        //lastNameElement.sendKeys(lastNameValue);
        elementsMethod.fillElement(lastNameElement, lastNameValue);

        //userEmail
        WebElement emailElement = driver.findElement(By.id("userEmail"));
        String emailValue = "robert.burcus@icloud.com";
        //emailElement.sendKeys(emailValue);
        elementsMethod.fillElement(emailElement, emailValue);

        ////input[@name='gender']
        //definim o logic generala de a selecta un element dintr-o lista
        List<WebElement> genderElements = driver.findElements(By.xpath("//div[@id='genterWrapper']/div/div/label[@class='custom-control-label']"));
        String genderValue = "Male";
        switch (genderValue) {
            case "Male":
                //genderElements.get(0).click();
                elementsMethod.clickElement(genderElements.get(0));
                break;
            case "Female":
                //genderElements.get(1).click();
                elementsMethod.clickElement(genderElements.get(1));
                break;
            case "Other":
                //genderElements.get(2).click();
                elementsMethod.clickElement(genderElements.get(2));
                break;
        }

        //userNumber
        WebElement mobileNumberElement = driver.findElement(By.id("userNumber"));
        String mobileNumberValue = "0123434342";
        //mobileNumberElement.sendKeys(mobileNumberValue);
        elementsMethod.fillElement(mobileNumberElement, mobileNumberValue);

        //Date of birth
        WebElement dateOfBirthElement = driver.findElement(By.id("dateOfBirthInput"));
        //dateOfBirthElement.click();
        elementsMethod.clickElement(dateOfBirthElement);

        WebElement dateOfBirthMonthElement = driver.findElement(By.className("react-datepicker__month-select"));
        //Select monthSelect = new Select(dateOfBirthMonthElement);
        //monthSelect.selectByVisibleText("September");
        elementsMethod.selectByTextElement(dateOfBirthMonthElement, "August");


        WebElement dateOfBirthYearElement = driver.findElement(By.className("react-datepicker__year-select"));
        //Select yearSelect = new Select(dateOfBirthYearElement);
        //yearSelect.selectByValue("2099");
        elementsMethod.selectByValue(dateOfBirthYearElement, "2099");

        List<WebElement> weekDaysElements = driver.findElements(By.xpath("//div[@class='react-datepicker__month']//div[not(contains(@class,'--outside-month')) and @role='option']"));
        String weekdaysValue = "23";
        for (Integer index = 0; index < weekDaysElements.size(); index++) {
            if (weekDaysElements.get(index).getText().equals(weekdaysValue)) {
                weekDaysElements.get(index).click();
                break;
            }

        }


        //subjectInput
        WebElement subjectInputElement = driver.findElement(By.id("subjectsInput"));
        String subjectInputValue = "Accounting";
        //subjectInputElement.sendKeys(subjectInputValue);
        elementsMethod.fillElement(subjectInputElement,subjectInputValue);
        //subjectInputElement.sendKeys(Keys.ENTER);
        elementsMethod.pressElement(subjectInputElement, Keys.ENTER);

        //userHobbies
        List<WebElement> hobbiesElements = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div/div/label[@class='custom-control-label']"));
        List<String> hobbiesValues = Arrays.asList("Sports", "Music");

        for (Integer index = 0; index < hobbiesElements.size(); index++) {
            String hobbyText = hobbiesElements.get(index).getText();
            if (hobbiesValues.contains(hobbyText)) {
                //hobbiesElements.get(index).click();
                elementsMethod.clickElement(hobbiesElements.get(index));
            }
        }

        //interactionam cu un fisier(upload)
        WebElement uploadPictureElement = driver.findElement(By.id("uploadPicture"));
        String picturePathValue = "test.bmp";
        File file = new File("src/test/resources/test.bmp");
        uploadPictureElement.sendKeys(file.getAbsolutePath());

        //current address
        WebElement addressElement = driver.findElement(By.id("currentAddress"));
        String addressValue = "Adresa";
        addressElement.sendKeys(addressValue);

        //State
        WebElement stateElement = driver.findElement(By.id("state"));
        //stateElement.click();
        elementsMethod.clickElement(stateElement);

        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
        String stateInputValue = "Uttar Pradesh";
        stateInputElement.sendKeys(stateInputValue);
        stateInputElement.sendKeys(Keys.ENTER);

        //City

        WebElement cityElement = driver.findElement(By.id("city"));
        //cityElement.click();
        elementsMethod.clickElement(cityElement);

        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
        String cityInputValue = "Agra";
        cityInputElement.sendKeys(cityInputValue);
        cityInputElement.sendKeys(Keys.ENTER);

        //submit
        WebElement submitForm = driver.findElement(By.id("submit"));
        //submitForm.click();
        elementsMethod.clickElement(submitForm);

        //validam tabelul cu valorile introduse
        WebElement thankYouMessageElement = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assert.assertEquals(thankYouMessageElement.getText(), "Thanks for submitting the form");

        List<WebElement> tableValues = driver.findElements(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr"));
        Assert.assertEquals(tableValues.get(0).getText(), "Student Name " + firstNameValue + " " + lastNameValue);
        Assert.assertEquals(tableValues.get(1).getText(), "Student Email " + emailValue);
        Assert.assertEquals(tableValues.get(2).getText(), "Gender " + genderValue);
        Assert.assertEquals(tableValues.get(3).getText(), "Mobile " + mobileNumberValue);
        Assert.assertEquals(tableValues.get(5).getText(), "Subjects " + subjectInputValue);
        String expectedHobbiesText = "Hobbies " + String.join(", ", hobbiesValues);
        Assert.assertEquals(tableValues.get(6).getText(), expectedHobbiesText);
        Assert.assertEquals(tableValues.get(7).getText(), "Picture " + picturePathValue);
        Assert.assertEquals(tableValues.get(8).getText(), "Address " + addressValue);
        Assert.assertEquals(tableValues.get(9).getText(), "State and City " + stateInputValue + " " + cityInputValue);

        WebElement closeElement = driver.findElement(By.id("closeLargeModal"));
        //js.executeScript("arguments[0].click();", closeElement);
        elementsMethod.clickElement(closeElement);


    }
}
