package com.class01;
/*
 1.setup - open browser and application
 2.Login
 3.close
*/
import org.testng.annotations.Test;

public class FirstTestcase {

    @Test(priority =1) //will execute in a particular order
    void setup(){
        System.out.println("Opening browser"); //setup method
    }
    @Test(priority = 2)
    void login(){
        System.out.println("This is login test"); //test method
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("closing browser");
    }
}
