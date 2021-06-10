package com.class02;

import org.testng.annotations.Test;

public class PriorityExample2 {

    @Test(priority = 3)
    public void logoutMethod(){
        System.out.println("this execution should come later");
    }

    @Test(priority = 1)
    public void loginMethod(){
        System.out.println("This execution should come first");
    }

    @Test(priority = 2)
    public void enterCredentialMethod(){
        System.out.println("This execution should come in the end");
    }

    @Test(priority = 4)
    public void enterValidCredentials(){
        System.out.println("This execution should come in the end");
    }

}

