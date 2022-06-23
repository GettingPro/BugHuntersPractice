package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SubmitNewLanguagePage;

public class TC_11_11 extends BaseTest{

    @Test

    public void testSubmitLanguagesError(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitNewLanguagePage();
        submitNewLanguagePage.getSubmitLanguageButton().click();
        String actualResult = submitNewLanguagePage.getError().getText();
        Assert.assertEquals(actualResult, "Error: Precondition failed - Incomplete Input.");
    }
}
