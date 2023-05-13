package pl.edu.agh.ki.mwo.e2e.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pl.edu.agh.ki.mwo.e2e.BasePage;
import pl.edu.agh.ki.mwo.e2e.Const;

public class NaviPage extends BasePage {

    @FindBy(css = ".nav-item > a[href='"+ Const.LOGIN_URL +"']")
    WebElement loginItem;

    public NaviPage(WebDriver driver){
        super(driver);
    }
}
