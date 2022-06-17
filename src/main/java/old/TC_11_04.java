package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.BrowseLanguagesPage;
import old.MainPage;

public class TC_11_04 extends BaseTest {

    @Test
    public void testFirstSubmenuItem(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        Assert.assertTrue(browseLanguagesPage.verifyFirstSubmenuItem());
    }
}
