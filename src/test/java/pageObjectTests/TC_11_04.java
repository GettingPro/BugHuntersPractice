package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BrowseLanguagesPage;
import pageObjects.MainPage;

public class TC_11_04 extends BaseTest {

    @Test
    public void testFirstSubMenuItem() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguagesPage();
        String actualResult = BrowseLanguagesPage.SubMenu.NUMBERS09.getText(driver);
        Assert.assertEquals(actualResult,"0-9");
    }

}
