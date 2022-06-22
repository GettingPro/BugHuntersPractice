package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage(){
        driver.get("https://www.99-bottles-of-beer.net/");
    }

    public String getMainPageHeader(){
        return driver.findElement(By.xpath("//div[@id='header']/h1")).getText();
    }

    public List<WebElement> getMainMenu(){
        return driver.findElements(By.xpath("//ul[@id='menu']//a"));
    }
}
