package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Tests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("rahulshettyacademy");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("learning");
        WebElement userRadio = driver.findElement(By.xpath("(//*[@class='checkmark'])[2]"));
        userRadio.click();
        WebElement okayButton = driver.findElement(By.id("okayBtn"));
        w.until(ExpectedConditions.visibilityOf(okayButton));
        okayButton.click();
        WebElement terms = driver.findElement(By.name("terms"));
        terms.click();
        WebElement signInButton = driver.findElement(By.id("signInBtn"));
        signInButton.click();

        
    }
}
