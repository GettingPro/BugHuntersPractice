package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GuestBookPage extends BasePage {

    public GuestBookPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getNameField() {
        return driver.findElement(By.name("name"));
    }

    private WebElement getLocationField() {
        return driver.findElement(By.name("location"));
    }

    private WebElement getEMailField() {
        return driver.findElement(By.name("email"));
    }

    private WebElement getHomepageField() {
        return driver.findElement(By.name("homepage"));
    }

    private WebElement getSecurityCodeField() {
        return driver.findElement(By.name("captcha"));
    }

    private WebElement getMessageField() {
        return driver.findElement(By.name("comment"));
    }

    private WebElement getSubmitButton() {
        return driver.findElement(By.name("submit"));
    }


    private List<WebElement> getSubmenuList() {
        return driver.findElements(By.xpath("//ul[@id='submenu']/li/a"));
    }

    public void clickSubMenuItem(String subItemMenuName) {
        for (int i = 0; i < getSubmenuList().size(); i++) {
            if (getSubmenuList().get(i).getText().equalsIgnoreCase(subItemMenuName)) {
                getSubmenuList().get(i).click();
            }
        }
    }

    public void fillOutForm(String name, String location, String email, String homepage, String captcha, String comment) {
        getNameField().sendKeys(name);
        getLocationField().sendKeys(location);
        getEMailField().sendKeys(email);
        getHomepageField().sendKeys(homepage);
        getSecurityCodeField().sendKeys(captcha);
        getMessageField().sendKeys(comment);
        getSubmitButton().click();
    }

    public boolean verifyErrorMessageDisplayed(){
        return driver.findElement(By.xpath("//p[contains(text(),'Error')]")).isDisplayed();
    }


}
