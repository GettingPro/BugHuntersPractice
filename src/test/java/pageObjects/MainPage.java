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
        public String getText(WebDriver driver) {
            return driver.findElement(locator).getText();
        }

    }


    public enum SubMenu {
        TEAM(By.linkText("Team")),
        SONGLYRICS(By.linkText("Song Lyrics")),
        HISTORY(By.linkText("History")),
        PRIVACY(By.linkText("Privacy"));

        private final By locator;

        SubMenu(By locator) {
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

    public List<WebElement> getCreatorsNames() {
        return driver.findElements(By.xpath("//div[@id='main']//h3"));
    }

//    public void clickSubMenuItem(String menuItem) {
//        for (int i = 0; i < getSubMenu().size(); i++) {
//            if (getSubMenu().get(i).getText().equalsIgnoreCase(menuItem)) {
//                getSubMenu().get(i).click();
//            }
//        }
//    }



    public void openMainPage() {
        driver.get("https://www.99-bottles-of-beer.net/");
    }

    public SubmitNewLanguagePage navigateToSubmitNewLanguagePage() {
        MainMenu.SUBMITNEWLANGUAGE.click(driver);
        return new SubmitNewLanguagePage(driver);
    }

    public BrowseLanguagesPage navigateToBrowseLanguagesPage() {
        MainMenu.BROWSELANGUAGES.click(driver);
        return new BrowseLanguagesPage(driver);

    }

    public TopListsPage navigateToTopListsPage() {
        MainMenu.TOPLISTS.click(driver);
        return new TopListsPage(driver);
    }
}
