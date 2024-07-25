package com.thetestingacademy.pages.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage_POM {

    // Contains
    // Page Locators

    WebDriver driver;
    public  LoginPage_POM(WebDriver driver){
        this.driver = driver;
    }

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    // Page Actions
    // loginT
    public String loginToVWOInvalidCreds(String user,String pwd) {
        driver.get("https://app.vwo.com");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String error_msg_text  = error_msg.getText();
        String error_msg_attribute_dataqa  = error_msg.getAttribute("data-qa");
        return error_msg_text;
    }
}
