//package com.thetestingacademy.driver;
//
//import com.thetestingacademy.utils.PropertyReader;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import java.io.FileNotFoundException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class DriverManagerSelenoid {
//    public static WebDriver driver;
//
//    public static WebDriver getDriver() {
//        return driver;
//    }
//
//    public static void setDriver(WebDriver driver) {
//        DriverManagerSelenoid.driver = driver;
//    }
//
//
//    public static void init() {
//
//        if (driver == null) {
//            ChromeOptions options = new ChromeOptions();
//            options.setCapability("selenoid:options", new HashMap<String, Object>() {{
//                /* How to add test badge */
//                put("name", "Test badge...");
//
//                /* How to set session timeout */
//                put("sessionTimeout", "15m");
//
//                /* How to set timezone */
//                put("env", new ArrayList<String>() {{
//                    add("TZ=UTC");
//                }});
//
//                /* How to add "trash" button */
//                put("labels", new HashMap<String, Object>() {{
//                    put("automation", "true");
//                }});
//
//                /* How to enable video recording */
//                put("enableVideo", true);
//            }});
//            try {
//                RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
//
//
//        }
//    }
//
//    public static void down() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//
//
//}
