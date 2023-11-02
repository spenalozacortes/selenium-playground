package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Stephanie");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hola@hola.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password123");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("03/11/1990");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert")).getText());

        driver.quit();
    }
}
