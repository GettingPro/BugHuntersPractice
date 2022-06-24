package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SubmitNewLanguagePage;

public class TC_11_13 extends BaseTest {
    @Test
    public void testText() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitNewLanguagePage();
        String actualResult = submitNewLanguagePage.getImportantInfo().get(0).getText();

        Assert.assertEquals(actualResult,"IMPORTANT: Take your time! The more carefully you fill out this form " +
                "(especially the language name and description), the easier it will be for us and the faster your language " +
                "will show up on this page. We don't have the time to mess around with fixing your descriptions etc. " +
                "Thanks for your understanding.");
    }

}
