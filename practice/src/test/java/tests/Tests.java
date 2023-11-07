package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        String labelText = driver.findElement(By.cssSelector("label[for='benz']")).getText();
        WebElement checkbox = driver.findElement(By.id("checkBoxOption2"));
        checkbox.click();
        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(labelText);
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys(labelText);
        WebElement alertButton = driver.findElement(By.id("alertbtn"));
        alertButton.click();
        System.out.println(driver.switchTo().alert().getText());
    }
}
