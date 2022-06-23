package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubmitNewLanguagePage extends BasePage {

    public SubmitNewLanguagePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSubMenu() {
        return driver.findElements(By.xpath("//ul[@id='submenu']//a"));
    }

    public WebElement getSubmitLanguageButton() {
        return driver.findElement(By.xpath("//input[@type='submit']"));
    }

    public WebElement getError() {
        return driver.findElement(By.xpath("//div[@id='main']/p"));
    }

    public boolean verifyErrorMessage() {
        String[] requirements = new String[]{"Error", "Precondition", "Incomplete", "Input", ":", "-", "."};
        boolean result = true;
        for (int i = 0; i < requirements.length && result; i++) {
            if (!getError().getText().contains(requirements[i])) {
                result = false;
            }
        }
        return result;
    }
}


