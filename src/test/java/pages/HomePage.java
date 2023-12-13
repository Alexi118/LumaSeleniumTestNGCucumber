package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="menuToggle")
    private WebElement hamburger_Btn;
    @FindBy(css="a[href=\"SignIn.html\"]")
    private WebElement signIn_Btn;

    public void click_hamburger_menu_Btn(){
        hamburger_Btn.click();
    }
    public void click_signIn_Btn(){
        signIn_Btn.click();
    }
}
