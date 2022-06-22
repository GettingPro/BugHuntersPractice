package pageObjectTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;

import java.util.List;

public class TC_11_02 extends BaseTest {

    @Test
    public void testLastMenuItem(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        List<WebElement> mainMenu = mainPage.getMainMenu();
        String actualResult = mainMenu.get(5).getText();
        Assert.assertEquals(actualResult,"SUBMIT NEW LANGUAGE");
    }

}
