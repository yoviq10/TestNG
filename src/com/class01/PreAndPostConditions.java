package com.class01;

import org.testng.annotations.*;

public class PreAndPostConditions {
    //will execute alphabetically
    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("I am Before Test method"); //pre conditions before test
    }
    @AfterTest
    public void afterTestMethod(){
        System.out.println("I am After Test method");  //pre conditions executed after all cases
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am Before Method function, which will execute before every test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am After Method function, which will execute after every test");
    }


    @Test
    public void firstFunction(){          //test case 1
        System.out.println("I am first function test case");
    }

    @Test
    public void secondFunction(){    // test case 2
        System.out.println("I am second function test case");
    }



}
