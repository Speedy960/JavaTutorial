package tests;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMethod;
import HelperMethods.PageMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest {

        public WebDriver driver;

        @Test
        public void metodaTest() {

            //deschidem un browser
            driver = new ChromeDriver();

            //accesam un anumit URL
            driver.get("https://demoqa.com");

            //facem browserul in modul maximize
            driver.manage().window().maximize();

            //Wait implicit- codul asteapta un nr de secunde setat pt fiecare linie de cod ce contine find element
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //definim un obiect de tip alert methods ca sa apelam metodele generale din clasa
            AlertMethods alertMethods = new AlertMethods(driver);
            ElementsMethod elementsMethod = new ElementsMethod(driver);
            PageMethods pageMethods = new PageMethods(driver);


            //facem un scroll la pagina pt vizibilitate
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy(0,350)", "");
            pageMethods.scrollPage(0,350);

            //interactionam cu meniul/submeniul de pe site
            WebElement alertMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
            //alertMenu.click();
            elementsMethod.clickElement(alertMenu);

            WebElement alertsubmenu = driver.findElement(By.xpath("//span[text()='Alerts']"));
            //alertsubmenu.click();
            elementsMethod.clickElement(alertsubmenu);

            //interactionam cu o alerta
            WebElement alertOKButton = driver.findElement(By.id("alertButton"));
            //alertOKButton.click();
            elementsMethod.clickElement(alertOKButton);

            alertMethods.acceptAlert();

            /*
            Alert alertOK = driver.switchTo().alert();
            System.out.println(alertOK.getText());
            alertOK.accept();
*/
            WebElement alertConfirmButton = driver.findElement(By.id("confirmButton"));
            //alertConfirmButton.click();
            elementsMethod.clickElement(alertConfirmButton);

            alertMethods.dismissAlert();
            /*
            Alert alertConfirm = driver.switchTo().alert();
            System.out.println(alertConfirm.getText());
            alertConfirm.dismiss();

             */

            WebElement alertPromptButton = driver.findElement(By.id("promtButton"));
            //alertPromptButton.click();
            elementsMethod.clickElement(alertPromptButton);

            alertMethods.fillAlert("robert");

           /* Alert alertPrompt = driver.switchTo().alert();
            System.out.println(alertPrompt.getText());
            String alertValue= "robert";
            alertPrompt.sendKeys(alertValue);
            alertPrompt.accept();

            */

            //interactionam cu o alerta pentru care este nevoie de asteptat putin
            WebElement alertWait= driver.findElement(By.id("timerAlertButton"));
            alertWait.click();

            alertMethods.acceptAlert();

            /*
            //Definim un wait explicit
            WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
            webDriverWait.until(ExpectedConditions.alertIsPresent());

            Alert waitConfirm = driver.switchTo().alert();
            System.out.println(waitConfirm.getText());
            waitConfirm.accept();

             */
        }

}
