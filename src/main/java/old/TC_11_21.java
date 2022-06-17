package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import old.MainPage;
import old.SubmitNewLanguagePage;

public class TC_11_21 extends BaseTest {

    @Test
    public void testWordStyleWhiteFont() {
        MainPage mainpage = new MainPage(driver);
        mainpage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainpage.navigateToSubmitNewLanguagePage();
        WebElement IMPORTANT = driver.findElement(By.xpath("//div[@id='main']//ul/li/span"));
        Assert.assertTrue(IMPORTANT.getAttribute("style").contains("color: white"));
    }

    @Test
    public void testWordStyleBoldFont() {
        MainPage mainpage = new MainPage(driver);
        mainpage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainpage.navigateToSubmitNewLanguagePage();
        WebElement IMPORTANT = driver.findElement(By.xpath("//*[text()='IMPORTANT:']"));
        Assert.assertEquals(IMPORTANT.getTagName(), "b");
    }

    @Test
    public void testWordStyleRedBackground() {
        MainPage mainpage = new MainPage(driver);
        mainpage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainpage.navigateToSubmitNewLanguagePage();
        WebElement IMPORTANT = driver.findElement(By.xpath("//div[@id='main']//ul/li/span"));
        Assert.assertTrue(IMPORTANT.getAttribute("style").contains("background-color: red"));
    }

    @Test
    public void testWordStyleAllCapital() {
        MainPage mainpage = new MainPage(driver);
        mainpage.openMainPage();
        SubmitNewLanguagePage submitNewLanguagePage = mainpage.navigateToSubmitNewLanguagePage();
        WebElement IMPORTANT = driver.findElement(By.xpath("//*[text()='IMPORTANT:']"));
        Assert.assertEquals(IMPORTANT.getText().replace(":", ""), "IMPORTANT");
    }

}
