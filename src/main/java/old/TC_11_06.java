package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.MainPage;

public class TC_11_06 extends BaseTest{

    @Test
    public void testCreatorsNames() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickSubMenuItem("team");
        Assert.assertTrue(mainPage.verifyCreatorsNames());
    }

}
