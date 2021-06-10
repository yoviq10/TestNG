package com.class04;

import org.testng.annotations.*;

public class PracticeAnnotations {

    @BeforeTest
   void beforeTest(){
       System.out.println("This will execute before the test");
   }

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }
    @Test
    void test1(){
        System.out.println("This is test 1...");
    }

   @Test
    void test2(){
        System.out.println("This is test 2...");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @AfterClass  //will execute after execution of class
    void afterClass(){
        System.out.println("This will execute after class");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after the test");
    }
}
