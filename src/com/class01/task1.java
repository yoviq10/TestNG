package com.class01;

import org.testng.annotations.*;

public class task1 {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("I am before class");
    }

    @BeforeMethod
    public void beforeMethod1(){
        System.out.println("I am before method1");
    }

    @Test
    public void testCase1(){
        System.out.println("This is first test case");
    }

    @Test
    public void testCase2(){
        System.out.println("This is second test case");
    }


    @AfterMethod
    public void afterMethod2(){
        System.out.println("I am after method2");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("I am after class");
    }
}

