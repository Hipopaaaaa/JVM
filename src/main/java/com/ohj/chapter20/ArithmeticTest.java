package com.ohj.chapter20;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {
    @Test
    public void method1(){
        int i=10;
        double j=i/0.0;
        System.out.println(j);  //Infinity  无穷大

        double d1=0.0;
        double d2=d1/0.0;
        System.out.println(d2);  //NaN： not a number
    }

    public void method2(){
        int i=10;
        //int a=i++;   a=10 i=11;
        int a=++i;  //a=11,i=11;
    }
}
