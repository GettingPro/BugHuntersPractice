package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import old.GuestBookPage;
import old.MainPage;

public class TC_12_06 extends BaseTest {

    @Test
    public void testErrorMessageDisplayed() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        GuestBookPage guestBookPage = mainPage.navigateGuestBookPage();
        guestBookPage.clickSubMenuItem("Sign Guestbook");
        String code = "" + ((int) (Math.random() * 200) + 100);
        guestBookPage.fillOutForm(
                "MyName",
                "Toronto",
                "myemail@gmail.com",
                "HomePage",
                "" + code + "",
                "MyComments");
        Assert.assertTrue(guestBookPage.verifyErrorMessageDisplayed());
    }
}