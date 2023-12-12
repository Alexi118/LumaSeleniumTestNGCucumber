package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SignInPage extends BasePage{
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="#usr")
    public static WebElement user_Txt;
    @FindBy(css="#pwd")
    public static WebElement password_Txt;
    @FindBy(css="input[value=Login]")
    public static WebElement login_Btn;
    @FindBy(css="#NewRegistration")
    public static WebElement registration_Btn;

    public static void sendKey_user_Txt(){
        user_Txt.clear();
        user_Txt.sendKeys("sa");
    }
    public static void sendKey_password_Txt(){
        password_Txt.clear();
        password_Txt.sendKeys("sa");
    }
    public static void click_login_Btn(){
        login_Btn.click();
    }
    public static void click_registration_Btn(){
        registration_Btn.click();
    }
}
