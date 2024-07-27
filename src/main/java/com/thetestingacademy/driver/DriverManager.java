package com.thetestingacademy.driver;

import com.thetestingacademy.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.FileNotFoundException;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }


    public static void init(){
        String browser = null;
        try {
            browser = PropertyReader.readKey("browser");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if( driver == null){
            switch (browser){
                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--start-maximized");
                    edgeOptions.addArguments("--guest");
                    driver = new EdgeDriver(edgeOptions);
                    break;
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--start-maximized");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                default:
                    System.out.println("Not browser Found!!");
            }


        }
    }

    public static void down(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
