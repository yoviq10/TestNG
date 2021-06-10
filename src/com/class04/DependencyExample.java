package com.class04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {


    @Test
    void startCar(){
        System.out.println("Car started");
        Assert.fail();  //will make test method fail
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("Car driving");
    }


    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("Car stopped");
    }

    @Test (dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true) //will run true even though line 12 makes method fail
    void parkCar(){
        System.out.println("Car parked");
    }




}
