package PageObjectsTest3;

import PageObjectsTest1.BasePage;
import PageObjectsTest2.SuccessOrderPageObject1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoPageObject2 extends BasePage {
    private WebElement shopButton = driver.findElement(By.xpath("//a[contains(text(),'TOP INTERTOP')]"));
    public InfoPageObject2(WebDriver driver) {
        super(driver);
    }

    public SuccessOrderPageObject1 ShowBagOrderPlaceInfo()
    {
        shopButton.click();
        return new SuccessOrderPageObject1(driver);
    }
}
