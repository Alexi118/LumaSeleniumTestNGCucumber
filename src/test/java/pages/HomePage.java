package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utils.BrowserDrivers;

public class HomePage {

    public HomePage() {

//        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
    }

    @FindBy(id="menuToggle")
    private WebElement hamburger_Btn;
    @FindBy(css="a[href=\"SignIn.html\"]")
    public static WebElement signIn_Btn;

    public  void click_hamburger_menu_Btn(){
        hamburger_Btn.click();
    }
    public  void click_signIn_Btn(){
        signIn_Btn.click();
    }
}
