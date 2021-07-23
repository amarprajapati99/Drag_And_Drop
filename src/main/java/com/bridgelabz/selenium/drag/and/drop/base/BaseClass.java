package com.bridgelabz.selenium.drag.and.drop.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClass{

    public static WebDriver driver;

    @BeforeTest ()
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver (options);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage ().timeouts ().pageLoadTimeout (20,TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}

