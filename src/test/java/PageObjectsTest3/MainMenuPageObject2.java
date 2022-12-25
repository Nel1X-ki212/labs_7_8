package PageObjectsTest3;

import PageObjectsTest1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainMenuPageObject2 extends BasePage
{
    private WebElement chooseField = driver.findElement(By.xpath("//a/img[@src='/upload/aniart/784/78435e9a95671f5acc0fe4dd7847d250.jpg']"));

    public MainMenuPageObject2(WebDriver driver) {
        super(driver);
    }

    public UaDealsMenuPageObject2 NavigateToUaDeals()
    {
        chooseField.click();
        return new UaDealsMenuPageObject2(driver);
    }

}