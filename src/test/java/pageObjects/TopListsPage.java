package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopListsPage extends BasePage {


    public TopListsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSubMenu() {
        return driver.findElements(By.xpath("//ul[@id='submenu']/li/a"));
    }

    public WebElement getNewComments() {
        return  driver.findElement(By.xpath("//div[@id='main']/p"));
    }

    public void clickSubMenu (String menuItem) {
        for (int i = 0; i < getSubMenu().size(); i++) {
            if (getSubMenu().get(i).getText().equalsIgnoreCase(menuItem)) {
                getSubMenu().get(i).click();
            }

        }
    }
}
