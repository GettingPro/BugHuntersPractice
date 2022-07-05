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

    @FindBy(className = "button")
    WebElement submitLanguageButton;

    @FindBy(xpath = "//div[@id='main']/p")
    WebElement errorMessage;

    public String getFirstSubMenuItem(){
        return firstSubMenuItem.getText();
    }
    public SubmitNewLanguagePage clickSubmitLanguageButton() {
        submitLanguageButton.click();
        return this;
    }

    public String getErrorText() {
        return errorMessage.getText();
    }

    public List <WebElement> getImportantInfo() {
        return  driver.findElements(By.xpath("//div[@id='main']/ul/li"));
    }

    public boolean verifyErrorMessage() {
        String[] requirements = new String[]{"Error", "Precondition", "Incomplete", "Input", ":", "-", "."};
        boolean result = true;
        for (int i = 0; i < requirements.length && result; i++) {
            if (!getErrorText().contains(requirements[i])) {
                result = false;
            }
        }
        return result;
    }
}


