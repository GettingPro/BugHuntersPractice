package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.BrowseLanguagesPage;
import old.MainPage;

public class TC_11_14 extends BaseTest {

    @Test
    public void testFirstHeaderItem() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        Assert.assertEquals(browseLanguagesPage.getTableHeadersById(1), "Language");
    }

    @Test
    public void testSecondHeaderItem() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        Assert.assertEquals(browseLanguagesPage.getTableHeadersById(2), "Author");
    }
}
