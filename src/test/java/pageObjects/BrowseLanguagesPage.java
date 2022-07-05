package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrowseLanguagesPage extends BasePage {


    public BrowseLanguagesPage(WebDriver driver) {
        super(driver);
    }

    public enum SubMenu {

        NUMBERS09(By.linkText("0-9"));

        private final By locator;

        SubMenu(By locator) {
            this.locator = locator;
        }
        public String getText(WebDriver driver) {
            return driver.findElement(locator).getText();
        }
    }

    public List<WebElement> getTableHeaders() {
        return driver.findElements(By.xpath("//table[@id='category']/tbody/tr/th"));
    }
}
