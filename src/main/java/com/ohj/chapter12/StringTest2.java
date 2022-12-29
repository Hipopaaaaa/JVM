package com.ohj.chapter12;

public class StringTest2 {
    public static void main(String[] args) {

        long start=System.currentTimeMillis();
        //method1(100000); //3001
        method2(100000);  //14ms
        long end=System.currentTimeMillis();

        System.out.println("花费的时间为："+(end-start)+"ms");
    }


    public static void method1(int count){
        String str="";
        for (int i = 0; i < count; i++) {
            str=str+"a";
        }
    }


    public static void method2(int count){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < count; i++) {
            str.append("a");
        }
    }
}
