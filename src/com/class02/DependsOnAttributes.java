package com.class02;

import org.testng.annotations.Test;

public class DependsOnAttributes {

    @Test
    public void launchApplication(){
        System.out.println("This is my login test");
    }
    @Test(dependsOnMethods = "launchApplication") //will execute launchApplication method first..providing name of testcase
    public void enterCredentials(){
        System.out.println("This is my dependent method");
    }
}
