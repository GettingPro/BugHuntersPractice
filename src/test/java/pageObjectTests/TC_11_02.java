package pageObjectTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;

import java.util.List;

public class TC_11_02 extends BaseTest {

    @Test
    public void testLastMenuItem(){
        new MainPage(driver)
                .openMainPage();
        String actualResult = MainPage.MainMenu.SUBMITNEWLANGUAGE.getText(driver);
        Assert.assertEquals(actualResult,"Submit new Language");
    }

}
