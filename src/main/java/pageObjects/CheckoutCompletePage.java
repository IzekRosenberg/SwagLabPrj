package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage extends BasePage{
    public CheckoutCompletePage(WebDriver driver) {super(driver);}

    //Elements
    @FindBy(css = "[class='header_secondary_container'] [class='title']")
    WebElement pageTitle;

    @FindBy(css = "[id='back-to-products']")
    WebElement backHomeButton;

    //Methods
    public void clickBackHome(){
        clickElement(backHomeButton);
    }

}