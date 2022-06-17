package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.BrowseLanguagesPage;
import old.MainPage;

public class TC_12_04 extends BaseTest {

    @Test
    public void testMathematicaAuthor() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        browseLanguagesPage.clickSubMenuItem("M");
        Assert.assertEquals(browseLanguagesPage.getAuthorByLanguage("Mathematica"), "Brenton Bostick");
    }

    @Test
    public void testMathematicaDate() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        browseLanguagesPage.clickSubMenuItem("M");
        Assert.assertEquals(browseLanguagesPage.getDateByLanguage("Mathematica"), "03/16/06");
    }

    @Test
    public void testMathematicaComments() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        browseLanguagesPage.clickSubMenuItem("M");
        Assert.assertEquals(browseLanguagesPage.getCommentsByLanguage("Mathematica"), "1");
    }
}
