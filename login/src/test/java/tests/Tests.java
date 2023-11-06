package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));

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

        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'btn-primary')]")));
        List<WebElement> addButtons = driver.findElements(By.xpath("//*[contains(@class, 'btn-info')]"));
        for (WebElement button : addButtons) {
            button.click();
        }

        WebElement checkoutButton = driver.findElement(By.xpath("//*[contains(@class, 'btn-primary')]"));
        checkoutButton.click();

        driver.quit();
    }
}
