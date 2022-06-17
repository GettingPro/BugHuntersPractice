package old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopListsPage extends BasePage {

    public TopListsPage(WebDriver driver) {
        super(driver);
    }


    private List<WebElement> getSubmenuList() {
        return driver.findElements(By.xpath("//ul[@id='submenu']/li/a"));
    }
    private WebElement getNewComments(){
        return driver.findElement(By.xpath("//div[@id='main']/p"));
    }

    public void clickSubMenuItem(String subItemMenuName) {
        for (int i = 0; i < getSubmenuList().size(); i++) {
            if (getSubmenuList().get(i).getText().equalsIgnoreCase(subItemMenuName)) {
                getSubmenuList().get(i).click();
            }
        }
    }

    public boolean verifyNoNewComments(){
        return getNewComments().getText().equals("");
    }


}
