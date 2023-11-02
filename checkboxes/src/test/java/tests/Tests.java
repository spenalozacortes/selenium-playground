package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() {
        WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        checkbox.click();
        Assert.assertTrue(checkbox.isSelected(), "Checkbox is not selected!");
        checkbox.click();
        Assert.assertFalse(checkbox.isSelected(), "Checkbox is selected!");

        int checkboxCount = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
        System.out.println("There are " + checkboxCount + " checkboxes on this page.");
    }
}
