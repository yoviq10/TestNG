package com.class04;

import org.testng.annotations.*;

public class PracticeAnnotations2 {

    @BeforeSuite
    void beforeSuite(){
    System.out.println("This will execute before the test suite");
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
    void test3(){
        System.out.println("This is test 3...");
    }

    @Test
    void test4(){
        System.out.println("This is test 4...");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @AfterClass  //will execute after execution of class
    void afterClass(){
        System.out.println("This will execute after class");
    }

    @AfterSuite  //after completion of test
    void afterSuite(){
        System.out.println("This will execute after the test Suite");
    }
}




