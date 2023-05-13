package pl.edu.agh.ki.mwo.e2e.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.edu.agh.ki.mwo.e2e.Const;

public class AuthPage {

    @FindBy (css="[placeholder='Username']")
    private WebElement userNameField;

    @FindBy (css="[placeholder='Email']")
    private WebElement emailField;

    @FindBy (css="[placeholder='Password']")
    private WebElement passwordField;

    @FindBy (css="button.btn")
    private WebElement submitButton;

    WebDriver driver;



    public void navi(String url){
        this.driver.get(Const.BASE_URL + url);
    }

    public boolean submitBtnIsEnabled(){
        return this.submitButton.isEnabled();
    }
}
