package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public enum MainMenu {

        START(By.linkText("Start")),
        BROWSELANGUAGES(By.linkText("Browse Languages")),
        SEARCHLANGUAGES(By.linkText("Search Languages")),
        TOPLISTS(By.linkText("Top Lists")),
        GUESTBOOK(By.linkText("Guestbook")),
        SUBMITNEWLANGUAGE(By.linkText("Submit new Language"));

        private final By locator;

        MainMenu(By locator) {
            this.locator = locator;
        }

        public void click(WebDriver driver) {
            driver.findElement(locator).click();
        }
    }

    @FindBy(xpath = "//div[@id='header']/h1")
    WebElement mainPageHeader;


    public String getMainPageHeader() {
        return mainPageHeader.getText();
    }

    public List<WebElement> getMainMenu() {
        By mainMenuBy = By.xpath("//ul[@id='menu']//a");
        return driver.findElements(mainMenuBy);
    }

    public List<WebElement> getSubMenu() {
        return driver.findElements(By.xpath("//ul[@id='submenu']//a"));
    }

    public List<WebElement> getCreatorsNames() {
        return driver.findElements(By.xpath("//div[@id='main']//h3"));
    }

    public void clickSubMenuItem(String menuItem) {
        for (int i = 0; i < getSubMenu().size(); i++) {
            if (getSubMenu().get(i).getText().equalsIgnoreCase(menuItem)) {
                getSubMenu().get(i).click();
            }
        }
    }

    public void openMainPage() {
        driver.get("https://www.99-bottles-of-beer.net/");
    }

    public SubmitNewLanguagePage navigateToSubmitNewLanguagePage() {
        MainMenu.SUBMITNEWLANGUAGE.click(driver);
        return new SubmitNewLanguagePage(driver);
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

    public TopListsPage navigateToTopListsPage() {
        for (int i = 0; i < getMainMenu().size(); i++) {
            if (getMainMenu().get(i).getText().equalsIgnoreCase("Top Lists")) {
                getMainMenu().get(i).click();
                return new TopListsPage(driver);
            }
        }
        return null;
    }
}
