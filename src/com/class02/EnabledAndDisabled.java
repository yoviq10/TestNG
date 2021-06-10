package com.class02;

import org.testng.annotations.Test;

public class EnabledAndDisabled {

    @Test(enabled = false)
    public void logoutMethod(){
        System.out.println("this execution should come later");
    }

    @Test(enabled = true)
    public void loginMethod(){
        System.out.println("This execution should come first");
    }

    @Test(enabled = true)
    public void enterCredentialMethod(){
        System.out.println("This execution should come in the end");
    }


}
