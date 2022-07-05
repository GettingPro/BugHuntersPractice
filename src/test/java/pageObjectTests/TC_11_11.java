package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import pageObjects.SubmitNewLanguagePage;

public class TC_11_11 extends BaseTest{

    @Test

    public void testSubmitLanguagesError(){
        String actualResult = new MainPage(driver)
                .openMainPage()
                .navigateToSubmitNewLanguagePage()
                .clickSubmitLanguageButton()
                .getErrorText();

        Assert.assertEquals(actualResult, "Error: Precondition failed - Incomplete Input.");
    }
}
