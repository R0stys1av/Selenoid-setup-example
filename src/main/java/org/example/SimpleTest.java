package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
   public void simpleTest() throws MalformedURLException {
       FirefoxOptions firefoxOptions = new FirefoxOptions();
       WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), firefoxOptions);
//         for local run
//         WebDriver driver = new FirefoxDriver(firefoxOptions);


       try{
           driver.get("https://demoqa.com/automation-practice-form");

           WebElement element = driver.findElement(By.id("firstName"));
           element.sendKeys("Jonh");

           WebElement elementLastName = driver.findElement(By.id("lastName"));
           elementLastName.sendKeys("Doe");
           element.clear();
           element.sendKeys("Max");

           WebElement phoneNumberFiled = driver.findElement(By.id("userNumber"));
           phoneNumberFiled.clear();
           phoneNumberFiled.sendKeys("1234567890");

           WebElement radioMalBtn = driver.findElement(By.cssSelector("label[class='custom-control-label']"));
           radioMalBtn.click();
           Thread.sleep(10000);

       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       } finally {
           driver.quit();
       }
   }
}