package com.class03;

import org.testng.annotations.Test;

public class Example {

//runs alphabetically by method name and same group name
    @Test (groups = "smoke")
    public void firstFunction(){
        System.out.println("I am smoke test");
    }

    @Test (groups = "smoke")
    public void secondFunction(){
        System.out.println("I am smoke test");
    }

    @Test (groups = "regression") //this will run last since its not grouped with "smoke"
    public void thirdFunction(){
        System.out.println("I am 3rd test");
    }

    @Test (groups = "smoke")
    public void fourthFunction(){
        System.out.println("I am 4th test");
    }

}
