package PageObjectsTest2;

import PageObjectsTest1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoesMenuPageObject1 extends BasePage {
    private WebElement shoesField = driver.findElement(By.xpath("//a/img[contains(@src, 'https://intertop.ua/load/ZK3995/412x550/MAIN.jpg')]"));

    public ShoesMenuPageObject1(WebDriver driver) {
        super(driver);
    }

    public InfoPageObject1 NavigateToInfo()
    {
        shoesField.click();
        return new InfoPageObject1(driver);
    }
}
