package com.ohj.chapter20;

import org.junit.jupiter.api.Test;

public class ClassCastTest {
    @Test
    public void upCast(){
        int i=123123123;
        float f=i;
        System.out.println(f);  //1.2312312E8 --> 123123120

        long l=123123123123123123L;
        double d=l;
        System.out.println(d); //1.2312312312312312E17  --> 123123123123123120
    }

    public void downCast(){
        long l=10L;
        byte b=(byte) l;
    }

    @Test
    public void test(){
        double d=Double.NaN;
        int i=(int) d;
        System.out.println(d);  //NaN
        System.out.println(i);  //0
    }
    @Test
    public void test2(){
        double d=Double.POSITIVE_INFINITY; //正无穷大
        float f=(float) d;
        System.out.println(f); //Infinity
    }

    @Test
    public void test3(){
        double d=Double.POSITIVE_INFINITY; //无穷大
        int i=(int) d;
        long l=(long) d;
        System.out.println(i);  //2147483647  等于 Integer.MAX_VALUE
        System.out.println(l);  //9223372036854775807  等于 Long.MAX_VALUE
    }
}
