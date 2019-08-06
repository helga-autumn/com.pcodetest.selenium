package com.googlecheck.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.commons.lang3.RandomStringUtils;

public class FirefoxTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchFirefoxTestGoogle() {
        try {
            String testWord = RandomStringUtils.random(5, 97, 122, true, false);

            driver.get("https://google.com/");

            WebElement element  = driver.findElement(By.xpath("//input[@name='q']"));
            element.sendKeys(testWord);
            element.submit();

            System.out.println(driver.getTitle());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
