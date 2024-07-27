package com.thetestingacademy.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestVWOLoginTest {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        driver.manage().window().maximize();


        WebElement Inputbox = driver.findElement(By.id("login-username"));

        Inputbox.sendKeys("vwo@1secmail.com");


        WebElement password = driver.findElement(By.id("login-password"));

        password.sendKeys("Vwo@12344");


        List<WebElement> checkbox = driver.findElements(By.xpath("//*[name()='svg']"));

        checkbox.get(11).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[@for=\"checkbox-remember\"]//span[@class=\"checkbox-radio-button ng-scope\"]//*[name()=\"svg\"]")))).click();


        WebElement button = driver.findElement(By.id("js-login-btn"));


        button.click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
    }
}
