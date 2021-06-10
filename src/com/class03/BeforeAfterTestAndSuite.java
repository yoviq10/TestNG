package com.class03;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeAfterTestAndSuite {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I am after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }


}
