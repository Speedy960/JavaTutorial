package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.HomePage;
import pages.WindowsPage;

import java.util.ArrayList;
import java.util.List;

public class WindowsTest {


    public WebDriver driver;

    @Test
    public void metodaTest() {

        //deschidem un browser
        driver = new ChromeDriver();

        //accesam un anumit URL
        driver.get("https://demoqa.com");

        //facem browserul in modul maximize
        driver.manage().window().maximize();

        //definim un obiect de tipul Window Methods

        HomePage homePage = new HomePage(driver);
        homePage.navigateToAlertsMenu();

        //WindowMethods windowMethods = new WindowMethods(driver);
        //ElementsMethod elementsMethod = new ElementsMethod(driver);
        //PageMethods pageMethods = new PageMethods(driver);

        //facem un scroll la pagina pt vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");
        //pageMethods.scrollPage(0,350);

        //interactionam cu meniul/submeniul de pe site
        //WebElement alertsMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        //alertsMenu.click();
        //elementsMethod.clickElement(alertsMenu);

        AlertsWindowsPage alertsWindows = new AlertsWindowsPage(driver);
        alertsWindows.navigateToWindowPage();

        //WebElement browserWindows = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        //browserWindows.click();
        //elementsMethod.clickElement(alertsMenu);

        //New Tab button
        //WebElement newTab = driver.findElement(By.id("tabButton"));
        //newTab.click();
        //elementsMethod.clickElement(newTab);

        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.interactWithNewTab();
        windowsPage.interactWithNewWindow();

        //Interactionam cu un tab/windows
        //System.out.println(driver.getCurrentUrl()); // URL-ul paginii curente pe care ne aflam

        //interaction cu taburile/windows ca si cu multimi
        //get WindowsHandles returneaza cate taburi/windows sunt deschise in momentul definirii
        //List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        //Ne mutam cu focusul pe un anumit tab
        //driver.switchTo().window(tabs.get(1));
        //windowMethods.switchSpecificTab(1);
        //System.out.println(driver.getCurrentUrl());

        //Inchidem Tab-ul current

        //driver.close();
        //windowMethods.closeCurrentTab();
        //driver.switchTo().window(tabs.get(0));         // ----- Prima varianta de revenit la focus
        //windowMethods.switchSpecificTab(0);


        //WebElement newWindow = driver.findElement(By.id("windowButton"));
        //newWindow.click();
        //elementsMethod.clickElement(newWindow);
        //System.out.println(driver.getCurrentUrl());

        //List<String> window = new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(window.get(1));
        //windowMethods.switchSpecificTab(1);
        //System.out.println(driver.getCurrentUrl());

        //driver.close();
        //windowMethods.closeCurrentTab();

        driver.quit();


    }
}
