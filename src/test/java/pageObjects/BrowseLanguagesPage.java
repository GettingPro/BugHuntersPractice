package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrowseLanguagesPage extends BasePage {


    public BrowseLanguagesPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSubMenu() {
        return driver.findElements(By.xpath("//ul[@id='submenu']//a"));
    }
}
