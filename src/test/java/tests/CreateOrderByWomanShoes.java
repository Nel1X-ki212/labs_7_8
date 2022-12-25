package tests;

import PageObjectsTest1.MainMenuPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrderByWomanShoes extends BaseTest {
    private static final String MESSAGE = "Оформлення замовлення";

    @Test
    public void buyNewWomanShoes() {
        String actualMessage = new MainMenuPageObject(driver)
                .NavigateShoesElement()
                        .DoOrder()
                                .getActualMessage();
        Assert.assertTrue(actualMessage.contains(MESSAGE));
    }

}
