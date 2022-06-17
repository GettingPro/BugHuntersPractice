package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.MainPage;
import old.TopListsPage;

public class TC_11_15 extends BaseTest {

    @Test
    public void testErrorMessage() {
        MainPage mainpage = new MainPage(driver);
        mainpage.openMainPage();
        TopListsPage topListsPage = mainpage.navigateToTopListsPage();
        topListsPage.clickSubMenuItem("New comments");
        Assert.assertTrue(topListsPage.verifyNoNewComments());
    }
}
