package PageObjectsTest3;

import PageObjectsTest1.BasePage;
import PageObjectsTest2.InfoPageObject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UaDealsMenuPageObject2 extends BasePage {
    private WebElement bagElement = driver.findElement(By.xpath("//a/img[contains(@src, 'https://intertop.ua/load/SO77/412x550/MAIN.jpg')]"));
    public UaDealsMenuPageObject2(WebDriver driver) {
        super(driver);
    }
    public InfoPageObject2 ChooseBag()
    {
        bagElement.click();
        return new InfoPageObject2(driver);
    }
}
