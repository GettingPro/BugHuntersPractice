package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BrowseLanguagesPage;
import pageObjects.MainPage;

public class TC_11_14 extends BaseTest {
    @Test
    public void testFirstTableHeader() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguagesPage();
        String actualResult = browseLanguagesPage.getTableHeaders().get(0).getText();
        Assert.assertEquals(actualResult,"Language");
    }

    @Test
    public void testSecondTableHeader() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguagesPage();
        String actualResult = browseLanguagesPage.getTableHeaders().get(1).getText();
        Assert.assertEquals(actualResult,"Author");

    }
}
