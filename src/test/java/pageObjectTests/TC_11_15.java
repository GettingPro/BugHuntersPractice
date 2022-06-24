package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.TopListsPage;

public class TC_11_15 extends BaseTest{
    @Test
    public void testNoNewComments() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        TopListsPage topListsPage = mainPage.navigateToTopListsPage();
        topListsPage.clickSubMenu("New Comments");
        String actualResult = topListsPage.getNewComments().getText();
        Assert.assertEquals(actualResult,"");
    }
}
