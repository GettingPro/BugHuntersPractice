package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SubmitNewLanguagePage;

public class TC_11_03 extends BaseTest{

    @Test
    public void testLastMenuItem(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitNewLanguagePage();
        String actualResult = submitNewLanguagePage.getSubMenu().get(0).getText();
        Assert.assertEquals(actualResult,"Submit New Language");
    }
}
