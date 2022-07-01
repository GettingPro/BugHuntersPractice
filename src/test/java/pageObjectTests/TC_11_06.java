package pageObjectTests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;

public class TC_11_06 extends BaseTest {
    @Test
    public void testCreatorsNames() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        MainPage.SubMenu.TEAM.click(driver);
        String expectedResult = "Oliver Schade Gregor Scheithauer Stefan Scheler";

        String actualResult = "";
        for (WebElement names : mainPage.getCreatorsNames()) {
            actualResult += names.getText().concat(" ");
        }
        Assert.assertEquals(actualResult.trim(), expectedResult);

    }
}
