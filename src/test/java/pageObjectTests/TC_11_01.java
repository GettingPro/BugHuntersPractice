package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;

public class TC_11_01 extends BaseTest {

    @Test
    public void testMainPageHeader(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        String actualResult = mainPage.getMainPageHeader();
        Assert.assertEquals(actualResult,"99 Bottles of Beer");
    }

}
