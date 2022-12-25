package PageObjectsTest2;


import PageObjectsTest1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainMenuPageObject1 extends BasePage
{
    private WebElement childField = driver.findElement(By.xpath("//a[contains(text(),'Дітям')]"));

    public MainMenuPageObject1(WebDriver driver) {
        super(driver);
    }


    public ChildMenuPageObject1 NavigateToChildMenu()
    {
        childField.click();
        return new ChildMenuPageObject1(driver);
    }

}