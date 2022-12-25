package tests;

import PageObjectsTest1.BasePage;
import PageObjectsTest2.MainMenuPageObject1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrderByChildShoes extends BaseTest {
    private static final String MESSAGE = "Оформлення замовлення";

    @Test
    public void buyNewChildShoes() {
        String actualMessage1 = new MainMenuPageObject1(driver)
                .NavigateToChildMenu()
                        .ChooseChildShoes()
                                .NavigateToInfo()
                                        .DoChildShoesOrder()
                                                .getActualMessage();
        Assert.assertTrue(actualMessage1.contains(MESSAGE));
    }
}
