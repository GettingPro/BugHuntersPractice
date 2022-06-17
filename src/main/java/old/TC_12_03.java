package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.BrowseLanguagesPage;
import old.MainPage;

public class TC_12_03 extends BaseTest {

    @Test
    public void testTableHeaders() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        String[] expectedHeaders = new String[]{"Language", "Author", "Dates", "Comments", "Rate"};
        for (String header : expectedHeaders) {
            Assert.assertEquals(browseLanguagesPage.verifyTableHeadersByName(header),header);
        }
    }
}
