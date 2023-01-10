package com.ohj.chapter20;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}

class ReturnExceptionDemo{
    static void methodA(){
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("A中制造异常");
        }finally {
            System.out.println("用A方法的finally");
        }
    }
    static void methodB(){
        try {
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("调用方法B的finally");
        }
    }
}
