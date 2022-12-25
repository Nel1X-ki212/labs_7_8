package PageObjectsTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainMenuPageObject extends BasePage
{
    private WebElement shoesField = driver.findElement(By.xpath("//a/img[@title='Кросівки для міста ECCO  ELO Wмодель ZW7573']"));

    public MainMenuPageObject(WebDriver driver) {
        super(driver);
    }

    public InfoPageObject NavigateShoesElement()
    {
        shoesField.click();
        return new InfoPageObject(driver);
    }

}

