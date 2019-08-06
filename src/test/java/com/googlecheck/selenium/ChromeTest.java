package com.googlecheck.selenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;

public class ChromeTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
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
    public void launchTestDocumentXpath() {
        File file = new File("testexamples/testexample7.html");

        driver.get("file:///" + file.getAbsolutePath());
        WebElement div = driver.findElement(By.xpath("//main[@id='js-pjax-container']//div[2]/div[1]"));
        Assert.assertEquals("Test", div.getText());
    }
}
