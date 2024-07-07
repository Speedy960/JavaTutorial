package pages;

import HelperMethods.ElementsMethod;
import HelperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsWindowsPage {


    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public PageMethods pageMethods;


    public AlertsWindowsPage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//h5[text()='Browser Windows']")
    public WebElement browserWindows;

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frameButton;

    public void navigateToWindowPage(){
        //pageMethods.scrollPage(0, 350);
        elementsMethod.clickElement(browserWindows);
    }

    public void navigateToFramePage(){
        pageMethods.scrollPage(0, 350);
        elementsMethod.clickElement(frameButton);

    }
}
