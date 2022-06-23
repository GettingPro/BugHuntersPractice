package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SubmitNewLanguagePage;

public class TC_11_12 extends BaseTest {
    @Test

    public void testSubmitLanguagesError() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitNewLanguagePage();
        submitNewLanguagePage.getSubmitLanguageButton().click();

        Assert.assertTrue(submitNewLanguagePage.verifyErrorMessage());
    }
}
