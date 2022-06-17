package old;


import org.testng.Assert;
import org.testng.annotations.Test;
import old.MainPage;
import old.SubmitNewLanguagePage;

public class TC_11_03 extends BaseTest {

    @Test
    public void testFirstSubmenuItem() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitNewLanguagePage();
        Assert.assertTrue(submitNewLanguagePage.verifyFirstSubmenuItem());
    }
}
