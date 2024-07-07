package pages;

import HelperMethods.ElementsMethod;
import HelperMethods.PageMethods;
import HelperMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public PageMethods pageMethods;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    public WebElement alertsMenu;


    public void navigateToAlertsMenu(){
        //pageMethods.scrollPage(0,350);
        elementsMethod.clickElement(alertsMenu);

    }

}
