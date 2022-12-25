package tests;

import PageObjectsTest3.MainMenuPageObject2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrderBagPlaceInfo extends BaseTest {
    private static final String MESSAGE = "TOP INTERTOP";
    @Test
    public void buyBag() {
        String actualMessage2 = new MainMenuPageObject2(driver)
                .NavigateToUaDeals()
                        .ChooseBag()
                                .ShowBagOrderPlaceInfo()
                                        .getActualMessage();
        Assert.assertTrue(actualMessage2.contains(MESSAGE));
    }
}
