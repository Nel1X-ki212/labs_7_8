package PageObjectsTest3;

import PageObjectsTest1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessOrderPageObject2 extends BasePage {
    private WebElement actualMessage = driver.findElement(By.xpath("//h1"));

    public SuccessOrderPageObject2(WebDriver driver) {
        super(driver);
    }

    public String getActualMessage(){
        waitForElementToAppear(actualMessage);
        return actualMessage.getText();
    }

}