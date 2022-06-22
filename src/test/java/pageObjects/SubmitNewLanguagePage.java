package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubmitNewLanguagePage extends BasePage{

    public SubmitNewLanguagePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSubMenu(){
        return driver.findElements(By.xpath("//ul[@id='submenu']//a"));
    }

}
