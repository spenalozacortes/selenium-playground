package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Tests {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> windowsIterator = windows.iterator();
        String parentWindow = windowsIterator.next();
        String childWindow = windowsIterator.next();
        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.tagName("h3")).getText());

        driver.quit();
    }
}
