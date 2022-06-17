package old;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrowseLanguagesPage extends BasePage {


    public BrowseLanguagesPage(WebDriver driver) {
        super(driver);
    }

    private List<WebElement> getSubmenuList() {
        return driver.findElements(By.xpath("//ul[@id='submenu']/li/a"));
    }

    public void clickSubMenuItem(String subItemMenuName){
        for (int i = 0; i < getSubmenuList().size(); i++) {
            if (getSubmenuList().get(i).getText().equalsIgnoreCase(subItemMenuName)) {
                getSubmenuList().get(i).click();
            }
        }
    }


    private List<WebElement> getTableHeadersList() {
        return driver.findElements(By.xpath("//table[@id='category']//tr/th"));
    }

    public boolean verifyFirstSubmenuItem() {
        return getSubmenuList().get(0).getText().equals("0-9");
    }
    public List<WebElement> getAllLanguages(){
        return driver.findElements(By.xpath("//tbody//a[contains(@href,'language')]"));
    }
    public String getAuthorByLanguage(String language) {
        return driver.findElement(By.xpath("//a[text()='"+language+"']/ancestor::node()[2]//td[2]")).getText();
    }
    public String getDateByLanguage(String language) {
        return driver.findElement(By.xpath("//a[text()='"+language+"']/ancestor::node()[2]//td[3]")).getText();
    }
    public String getCommentsByLanguage(String language) {
        return driver.findElement(By.xpath("//a[text()='"+language+"']/ancestor::node()[2]//td[4]")).getText();
    }
    public String verifyTableHeadersByName(String headerName) {
        for (int i = 0; i < getTableHeadersList().size(); i++) {
            if (getTableHeadersList().get(i).getText().equals(headerName)) {
                return getTableHeadersList().get(i).getText();
            }
        }
        return "Header not found!";
    }

    public String getTableHeadersById(int headerId) {
        if (headerId > 0 && headerId < getTableHeadersList().size()) {
            return getTableHeadersList().get(headerId - 1).getText();
        }
        return "";
    }



}
