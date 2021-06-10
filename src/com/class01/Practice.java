package com.class01;

import org.testng.annotations.*;

public class Practice {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("I am before class");
    }

    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("I am before test method");
    }

    @Test
    public void testCase1(){
        System.out.println("This is first test case");
    }

    @Test
    public void testCase2(){
        System.out.println("This is second test case");
    }

    @Test
    public void testCase3(){
        System.out.println("This is third test case");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("I am after test method");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("I am after class");
    }
}
