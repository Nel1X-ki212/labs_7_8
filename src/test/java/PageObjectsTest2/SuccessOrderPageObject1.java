package PageObjectsTest2;

import PageObjectsTest1.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessOrderPageObject1 extends BasePage {
    private WebElement actualMessage = driver.findElement(By.xpath("//h1"));

    public SuccessOrderPageObject1(WebDriver driver) {
        super(driver);
    }

    public String getActualMessage(){
        waitForElementToAppear(actualMessage);
        return actualMessage.getText();
    }

}