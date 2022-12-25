package PageObjectsTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoPageObject extends BasePage {
    private WebElement sizeOfShoesField = driver.findElement(By.xpath("//input[@placeholder='Оберіть розмір']"));
    private WebElement clickElement = driver.findElement(By.xpath("//b[@class='c']"));
    private WebElement basketButton = driver.findElement(By.xpath("//div[@class='pay-bt']"));
    private WebElement confirmButton = driver.findElement(By.xpath("//a[@class='cart-top-outer-link']"));

    public InfoPageObject(WebDriver driver) {
        super(driver);
    }

    public SuccessOrderPageObject DoOrder()
    {
        sizeOfShoesField.sendKeys("41");
        clickElement.click();
        basketButton.click();
        confirmButton.click();
        return new SuccessOrderPageObject(driver);
    }

}
