package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks{
    protected WebDriver driver;
    protected ChromeOptions chromeOptions;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=1920,1080");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
