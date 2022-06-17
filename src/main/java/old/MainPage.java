package old;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage {

    public static final String PAGE_TITLE = "99 Bottles of Beer";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getMainPageTitle() {
        By mainPageTitleBy = By.xpath("//h1[text()='" + PAGE_TITLE + "']");
        return driver.findElement(mainPageTitleBy);
    }

    private List<WebElement> getMainMenuList() {
        return driver.findElements(By.xpath("//ul[@id='menu']/li/a"));
    }

    private List<WebElement> getSubmenuList() {
        return driver.findElements(By.xpath("//ul[@id='submenu']/li/a"));
    }

    private List<WebElement> getCreatorsList() {
        return driver.findElements(By.xpath("//div[@id='main']/h3"));
    }




    public MainPage openMainPage() {
        driver.get("http://www.99-bottles-of-beer.net/");
        return this;
    }

    public MainPage clickSubMenuItem(String subItemMenuName){
        for (int i = 0; i < getSubmenuList().size(); i++) {
            if (getSubmenuList().get(i).getText().equalsIgnoreCase(subItemMenuName)) {
                getSubmenuList().get(i).click();
            }
        }
        return this;
    }

    public boolean verifyMainPageTitle() {
        return getMainPageTitle().getText().equals(PAGE_TITLE);
    }

    public boolean verifyLastMenuItem() {
        return getMainMenuList().get(getMainMenuList().size() - 1).getText().equals("SUBMIT NEW LANGUAGE");
    }

    public boolean verifyCreatorsNames() {
        boolean result = false;
        String[] creatorsNames = new String[]{"Oliver Schade", "Gregor Scheithauer", "Stefan Scheler"};
        for (int i = 0; i < creatorsNames.length; i++) {
            result = false;
            for (int j = 0; j < getCreatorsList().size(); j++) {
                if (getCreatorsList().get(i).getText().equals(creatorsNames[j])) {
                    result = true;
                }
            }
        }
        return result;
    }

    public SubmitNewLanguagePage navigateToSubmitNewLanguagePage() {
        for (int i = 0; i < getMainMenuList().size(); i++) {
            if (getMainMenuList().get(i).getText().equalsIgnoreCase("SUBMIT NEW LANGUAGE")) {
                getMainMenuList().get(i).click();
                return new SubmitNewLanguagePage(driver);
            }
        }
        return null;
    }

    public BrowseLanguagesPage navigateToBrowseLanguages() {
        for (int i = 0; i < getMainMenuList().size(); i++) {
            if (getMainMenuList().get(i).getText().equalsIgnoreCase("BROWSE LANGUAGES")) {
                getMainMenuList().get(i).click();
                return new BrowseLanguagesPage(driver);
            }
        }
        return null;
    }

    public TopListsPage navigateToTopListsPage() {
        for (int i = 0; i < getMainMenuList().size(); i++) {
            if (getMainMenuList().get(i).getText().equalsIgnoreCase("TOP LISTS")) {
                getMainMenuList().get(i).click();
                return new TopListsPage(driver);
            }
        }
        return null;
    }

    public GuestBookPage navigateGuestBookPage() {
        for (int i = 0; i < getMainMenuList().size(); i++) {
            if (getMainMenuList().get(i).getText().equalsIgnoreCase("GUESTBOOK")) {
                getMainMenuList().get(i).click();
                return new GuestBookPage(driver);
            }
        }
        return null;
    }


}
