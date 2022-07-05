package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SubmitNewLanguagePage extends BasePage {

    public SubmitNewLanguagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Submit New Language")
    WebElement firstSubMenuItem;

    public String getFirstSubMenuItem(){
        return firstSubMenuItem.getText();
    }
    public WebElement getSubmitLanguageButton() {
        return driver.findElement(By.xpath("//input[@type='submit']"));
    }

    public WebElement getError() {
        return driver.findElement(By.xpath("//div[@id='main']/p"));
    }

    public List <WebElement> getImportantInfo() {return  driver.findElements(By.xpath("//div[@id='main']/ul/li"));}

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


