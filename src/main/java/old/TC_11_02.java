package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.MainPage;


public class TC_11_02 extends BaseTest {


    @Test
    public void testLastMenuItem(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        Assert.assertTrue(mainPage.verifyLastMenuItem());
    }

}
