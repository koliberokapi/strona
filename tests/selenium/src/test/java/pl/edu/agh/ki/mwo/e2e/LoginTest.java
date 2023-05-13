package pl.edu.agh.ki.mwo.e2e;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

class LoginTestTest {

    @Test
    void firstTest(){
        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get("http://localhost:4200/login");
        WebElement loginPageUrl = driver.findElement(By.cssSelector("[href$='login']"));
        loginPageUrl.click();

        WebElement mailField = driver.findElement(By.cssSelector("[placeholder='Email']"));
        mailField.sendKeys("mail@mail.mail");

        WebElement passwordField = driver.findElement(By.cssSelector("[placeholder='Password']"));
        passwordField.sendKeys("password123$");

        System.out.println("text");

    }
}