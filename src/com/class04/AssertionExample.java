package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExample {

    WebDriver driver;

    @BeforeClass
    void setUp(){

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
                driver=new ChromeDriver();
                driver.get("https://opensource-demo.orangehrmlive.com");

    }

    @Test(priority = 1)
    void logoTest(){

        WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"logo is not displayed on the pg");
    }

   @Test (priority = 2)
    void homePage(){
       String title= driver.getTitle();  //capturing title of pg
       Assert.assertEquals("OrangeHRM", title,"Title is not matched"); //test will pass if title = OrangeHRM

    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
