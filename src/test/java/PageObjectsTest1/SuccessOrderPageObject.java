package PageObjectsTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// page_url = about:blank
public class SuccessOrderPageObject extends BasePage{
    private WebElement actualMessage = driver.findElement(By.xpath("//h1"));

    public SuccessOrderPageObject(WebDriver driver) {
        super(driver);
    }

    public String getActualMessage(){
        waitForElementToAppear(actualMessage);
        return actualMessage.getText();
    }

}