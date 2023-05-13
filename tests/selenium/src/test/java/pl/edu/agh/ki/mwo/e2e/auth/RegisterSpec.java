package pl.edu.agh.ki.mwo.e2e.auth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pl.edu.agh.ki.mwo.e2e.Const;

import static org.assertj.core.api.Assertions.assertThat;


public class RegisterSpec {

    WebDriver driver;
    AuthPage page;

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromiumdriver().create();
        page = new AuthPage(driver);

    }

    @Test
    @DisplayName("[LOGOWANIE.1] should check if submit button is inactive")
    void  defaultSubmitBtnStatus(){
        this.page.navi(Const.LOGIN_URL);

        assertThat(this.page.submitBtnIsEnabled()).isFalse();

}


}

