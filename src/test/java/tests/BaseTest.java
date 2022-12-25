package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    WebDriver driver;
    private static final String ZHENSHINAM_UA_URL = "https://intertop.ua/ua/zhenshinam/";
    @BeforeTest
    public void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(ZHENSHINAM_UA_URL);
    }

    @AfterTest
    public void closeDriver(){
        driver.quit();
    }
}
