package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        List<WebElement> rows = driver.findElements(By.cssSelector("[name='courses'] tr"));
        System.out.println(rows.size());

        List<WebElement> columns = driver.findElements(By.cssSelector("[name='courses'] th"));
        System.out.println(columns.size());

        List<WebElement> row2 = driver.findElements(By.xpath("(//*[@name='courses']//tr)[3] //td"));
        for(WebElement column : row2) {
            System.out.println(column.getText());
        }

        driver.quit();
    }
}
