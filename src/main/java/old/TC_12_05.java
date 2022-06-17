package old;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import old.BrowseLanguagesPage;
import old.MainPage;

public class TC_12_05 extends BaseTest {

    @Test
    public void testLanguagesStartWithNumber() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
        BrowseLanguagesPage browseLanguagesPage = mainPage.navigateToBrowseLanguages();
        browseLanguagesPage.clickSubMenuItem("0-9");
        int actualResult = 0;
        for (WebElement element: browseLanguagesPage.getAllLanguages()) {
           if (Character.isDigit(element.getText().charAt(0))){
               actualResult++;
           }
        }
        Assert.assertEquals(actualResult, 10);
    }
}
