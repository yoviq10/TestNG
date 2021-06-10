package com.class04;

import org.testng.annotations.Test;

public class PriorityTest {


    @Test (priority = 1, enabled = true)
    void test1(){
        System.out.println("I am test 1");
    }

    @Test(priority = 2, enabled = true)
    void test2(){
        System.out.println("I am test 2");
    }


    @Test (priority = 3, enabled = true)
    void test3(){
        System.out.println("I am test 3");
    }

    @Test(priority = 4, enabled = false)
    void test4(){
        System.out.println("I am test 4");
    }

}
