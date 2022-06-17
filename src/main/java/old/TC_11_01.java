package old;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import old.MainPage;

public class TC_11_01 extends BaseTest {

    @Test
    public void testMainPageTitle() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        Assert.assertTrue(mainPage.verifyMainPageTitle());
    }

    @Test
    public void testMainPageTitleLyrics() {
        MainPage mainPage = new MainPage(driver)
                .openMainPage()
                .clickSubMenuItem("m");


        System.out.println(driver.findElement(By.xpath("//div[@id='main']")).getText());
    }

}
