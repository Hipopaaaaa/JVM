package com.ohj.chapter20;

import java.io.IOException;

public class ExceptionTest {

    public void throwOne(int i) throws RuntimeException, IOException {
        if(i==0){
            throw new RuntimeException("参数为0");
        }
    }

    public void throwArithmetic(){
        int i=10/0;
        System.out.println(i);
    }


    public void throw3() {
        int i=0;
        try {
            i=10/0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }catch (RuntimeException e){
            throw new RuntimeException();
        }
    }

    public static String func(){
        String str="hello";
        try {
            return str;
        }finally {
           str="ohj";
           // return str="ohj"; 若添加了return，则返回的是ohj而不是hello
        }
    }

    public static void main(String[] args) {
        //System.out.println(func());  //hello
        A();
    }


    public static void A(){
        try {
            System.out.println("进入A");
            throw new RuntimeException("A的异常");
        }finally {
            System.out.println("A的finally");
        }
    }
}
