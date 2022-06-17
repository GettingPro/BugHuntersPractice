package old;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SubmitNewLanguagePage extends BasePage {


    public SubmitNewLanguagePage(WebDriver driver) {
        super(driver);
    }

    private List<WebElement> getSubmenuList(){
        return driver.findElements(By.xpath("//ul[@id='submenu']/li/a"));
    }

    private List<WebElement> getImportantInfoList() {
        return driver.findElements(By.xpath("//div[@id='main']//ul/li"));
    }

    private WebElement getSubmitLanguageButton(){
        return  driver.findElement(By.xpath("//input[@name='submitlanguage']"));
    }
    private WebElement getErrorMessage(){
        return  driver.findElement(By.xpath("//div[@id='main']/p"));
    }


    public boolean verifyFirstSubmenuItem(){
        return getSubmenuList().get(0).getText().equals("Submit New Language");
    }
    public boolean verifyFirstImportantListItem(){
        return getImportantInfoList().get(0).getText().equals("IMPORTANT: Take your time! " +
                "The more carefully you fill out this form (especially the language name and description)," +
                " the easier it will be for us and the faster your language will show up on this page. " +
                "We don't have the time to mess around with fixing your descriptions etc." +
                " Thanks for your understanding.");
    }

    public boolean verifyErrorMessage(){
        getSubmitLanguageButton().click();
        return getErrorMessage().getText().equalsIgnoreCase("Error: Precondition failed - Incomplete Input.");
    }

    public boolean verifyErrorMessageContainsAllRequirements(){
        String[] requirements = new String[] {"Error","Precondition","Incomplete","Input","failed",":","-","."};
        boolean result = true;
        getSubmitLanguageButton().click();
        for (int i = 0;i < requirements.length && result; i++) {
            if (!getErrorMessage().getText().contains(requirements[i])) {
                result = false;
            }
        }
        return result;
    }



}
