package com.ohj.chapter2;

public class ClinitTest {

    //演示没有<clinit>()的情况

    //以下 变量a、b都属于成员变量，不是类变量，因此不会有<clinit>()

    //private int a=1;

    private static int c=10;  //类变量 ，生成<clinit>()
    public static void main(String[] args) {
        //int b=2;
    }
}
