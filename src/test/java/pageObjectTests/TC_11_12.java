package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SubmitNewLanguagePage;

public class TC_11_12 extends BaseTest {
    @Test

    public void testSubmitLanguagesError() {
        boolean actualResult = new MainPage(driver)
                .openMainPage()
                .navigateToSubmitNewLanguagePage()
                .clickSubmitLanguageButton()
                .verifyErrorMessage();

        Assert.assertTrue(actualResult);
    }
}
