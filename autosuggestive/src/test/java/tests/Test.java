package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement field = driver.findElement(By.id("autocomplete"));
        field.sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.className("ui-menu-item-wrapper"));
        for(WebElement option : options) {
            if(option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }

        driver.quit();
    }
}
