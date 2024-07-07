package pages;

import HelperMethods.ElementsMethod;
import HelperMethods.PageMethods;
import HelperMethods.WindowMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage {

    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public PageMethods pageMethods;
    public WindowMethods windowMethods;


    public WindowsPage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(driver);
        pageMethods = new PageMethods(driver);
        windowMethods = new WindowMethods(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "tabButton")
    public WebElement newTab;

    @FindBy(id = "windowButton")
    public WebElement newWindow;

    public void interactWithNewTab(){
        //pageMethods.scrollPage(0, 350);
        elementsMethod.clickElement(newTab);

        System.out.println(driver.getCurrentUrl()); // URL-ul paginii curente pe care ne aflam
        windowMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());
        windowMethods.closeCurrentTab();
        windowMethods.switchSpecificTab(0);


    }

    public void interactWithNewWindow(){
        pageMethods.scrollPage(0,350);
        newWindow.click();

        System.out.println(driver.getCurrentUrl());
        windowMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());
        windowMethods.closeCurrentTab();

    }

}
