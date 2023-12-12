package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCategoryPage extends BasePage{
    public ProductCategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#ShoeType")
    public static WebElement formalShoes_Txt;


    public static void verify_formalShoes_Txt_IsVisible(){
        formalShoes_Txt.isDisplayed();
    }
}
