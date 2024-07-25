package com.thetestingacademy.tests;

import com.thetestingacademy.pages.pageObjectModel.LoginPage_POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_POM {
    @Test
    public void testLoginNegativeVWO(){
        WebDriver driver = new EdgeDriver();
        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("admin@gmail.com","admin");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }

    @Test
    public void testLoginNegativeVWO2(){
        WebDriver driver = new EdgeDriver();
        LoginPage_POM loginPagePom = new LoginPage_POM(driver);
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds("pramod@gmail.com","admin");
        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
