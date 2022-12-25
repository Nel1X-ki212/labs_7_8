import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class TestNGClass {
    WebDriver driver;
    private static final String ZHENSHINAM_UA_URL = "https://intertop.ua/ua/zhenshinam/";
    private static final String MESSAGE = "Оформлення замовлення";

    @BeforeTest
    public void setDriver(){
        chromedriver().setup();
    }
    @BeforeMethod
    public void testsSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ZHENSHINAM_UA_URL);
    }
    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }

    @Test(priority = 1)
    public void buyNewWomanShoes(){
        WebElement shoesElement = driver.findElement(By.xpath("//a/img[@title='Кросівки для міста ECCO  ELO Wмодель ZW7573']"));
        shoesElement.click();

        WebElement sizeOfShoesField = driver.findElement(By.xpath("//input[@placeholder='Оберіть розмір']"));
        sizeOfShoesField.sendKeys("41");
        WebElement clickElement = driver.findElement(By.xpath("//b[@class='c']"));
        clickElement.click();
        WebElement basketButton = driver.findElement(By.xpath("//div[@class='pay-bt']"));
        basketButton.click();

        WebElement confirmButton = driver.findElement(By.xpath("//a[@class='cart-top-outer-link']"));
        confirmButton.click();

        driver.get("https://intertop.ua/ua/checkout/");

        WebElement actualMessage = driver.findElement(By.xpath("//h1"));
        WebElement waitToVisibleText = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOf(actualMessage));
        Assert.assertTrue(actualMessage.getText().contains(MESSAGE));
    }

    @Test(priority = 2)
    public void buyNewChildShoes(){
        WebElement childrensElement = driver.findElement(By.xpath("//a[contains(text(),'Дітям')]"));
        childrensElement.click();

        WebElement lookAtItems = driver.findElement(By.xpath("//div[@class='submit-area dbKey0']/div[@class='IButton IButton--secondary']"));
        lookAtItems.click();

        WebElement shoesElement = driver.findElement(By.xpath("//a/img[contains(@src, 'https://intertop.ua/load/ZK3995/412x550/MAIN.jpg')]"));
        shoesElement.click();

        WebElement sizeOfShoesField = driver.findElement(By.xpath("//input[@placeholder='Оберіть розмір']"));
        sizeOfShoesField.sendKeys("27");
        WebElement clickElement = driver.findElement(By.xpath("//b[@class='c']"));
        clickElement.click();
        WebElement basketButton = driver.findElement(By.xpath("//div[@class='pay-bt']"));
        basketButton.click();

        WebElement confirmButton = driver.findElement(By.xpath("//a[@class='cart-top-outer-link']"));
        confirmButton.click();

        driver.get("https://intertop.ua/ua/checkout/");

        WebElement actualMessage = driver.findElement(By.xpath("//h1"));
        WebElement waitToVisibleText = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOf(actualMessage));
        Assert.assertTrue(actualMessage.getText().contains(MESSAGE));
    }

    @Test(priority = 3)
    public void buyNewBag(){
        WebElement chooseField = driver.findElement(By.xpath("//a/img[@src='/upload/aniart/784/78435e9a95671f5acc0fe4dd7847d250.jpg']"));
        chooseField.click();

        WebElement bagElement = driver.findElement(By.xpath("//a/img[contains(@src, 'https://intertop.ua/load/SO77/412x550/MAIN.jpg')]"));
        bagElement.click();
        WebElement basketButton = driver.findElement(By.xpath("//div[@class='pay-bt']"));
        basketButton.click();

        WebElement confirmButton = driver.findElement(By.xpath("//a[@class='cart-top-outer-link']"));
        confirmButton.click();

        driver.get("https://intertop.ua/ua/checkout/");

        WebElement actualMessage = driver.findElement(By.xpath("//h1"));
        WebElement waitToVisibleText = new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.visibilityOf(actualMessage));
        Assert.assertTrue(actualMessage.getText().contains(MESSAGE));
    }
}
