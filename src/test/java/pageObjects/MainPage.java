package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        driver.get("https://www.99-bottles-of-beer.net/");
    }

    public String getMainPageHeader() {
        return driver.findElement(By.xpath("//div[@id='header']/h1")).getText();
    }

    public List<WebElement> getMainMenu() {
        return driver.findElements(By.xpath("//ul[@id='menu']//a"));
    }

    public List<WebElement> getSubMenu() { return driver.findElements(By.xpath("//ul[@id='submenu']//a"));}

    public List <WebElement> getCreatorsNames() {return driver.findElements(By.xpath("//div[@id='main']//h3"));}

    public void clickSubMenuItem(String menuItem){
        for (int i = 0; i < getSubMenu().size(); i++) {
            if(getSubMenu().get(i).getText().equalsIgnoreCase(menuItem)) {
                getSubMenu().get(i).click();
            }
        }
    }



    public SubmitNewLanguagePage navigateToSubmitNewLanguagePage() {
        for (WebElement menuItem : getMainMenu()) {
            if (menuItem.getText().equals("SUBMIT NEW LANGUAGE")) {
                menuItem.click();
                return new SubmitNewLanguagePage(driver);
            }
        }
        return null;
    }

    public BrowseLanguagesPage navigateToBrowseLanguagesPage() {
        for (int i = 0; i < getMainMenu().size(); i++) {
            if (getMainMenu().get(i).getText().equalsIgnoreCase("Browse Languages")) {
                getMainMenu().get(i).click();
                return new BrowseLanguagesPage(driver);
            }
        }
        return null;
    }
}
