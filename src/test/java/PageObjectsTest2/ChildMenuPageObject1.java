package PageObjectsTest2;

import PageObjectsTest1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildMenuPageObject1 extends BasePage {
    private WebElement lookAtAllButton = driver.findElement(By.xpath("//div[@class='submit-area dbKey0']/div[@class='IButton IButton--secondary']"));
    public ChildMenuPageObject1(WebDriver driver) {
        super(driver);
    }
    public ShoesMenuPageObject1 ChooseChildShoes()
    {
        lookAtAllButton.click();
        return new ShoesMenuPageObject1(driver);
    }
}
