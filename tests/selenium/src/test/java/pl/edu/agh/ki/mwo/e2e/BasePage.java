package pl.edu.agh.ki.mwo.e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pl.edu.agh.ki.mwo.e2e.Const;

public class BasePage {


    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navi(String url){
        this.driver.get(Const.BASE_URL + url);
    }

}
