package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_1 {
    WebDriver driver;
    @Test
    public void test_1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("ali");;
        driver.switchTo().alert().accept();


       // WebDriverWait wait=new WebDriverWait(driver,5);
      //  wait.until(ExpectedConditions.alertIsPresent());
       // driver.switchTo().alert().accept();


    }
}
