package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.MainPage;
import old.SubmitNewLanguagePage;

public class TC_11_12 extends BaseTest {

    @Test
    public void testErrorMessage() {
        MainPage mainpage = new MainPage(driver);
        mainpage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainpage.navigateToSubmitNewLanguagePage();
        Assert.assertTrue(submitNewLanguagePage.verifyErrorMessageContainsAllRequirements());
    }
}
