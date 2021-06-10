package com.class03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {


    //2D Array
    @DataProvider
    public Object [] [] loginData(){
        Object[] [] data=new Object[3][2];  //3 rows & 2 columns
        data[0][0]="Admin";
        data[0][1]="Hum@nhrm123";
        data[1][0]="Kseniaa";
        data[1][1]="Syntax123!";
        data[2][0]="Kseniaa";
        data[2][1]="Syntax123!";

        return data;  //we need to use this data somewhere else
    }

    @Test (dataProvider = "loginData")
    public void validLogin(String username, String password){
        System.out.println("Username is: "+username);
        System.out.println("Password is: "+password);
    }

}
