package com.ohj.chapter5;

import java.util.Date;

public class LocalVariableTest {
    private int count;

    public static void main(String[] args) {
        LocalVariableTest localVariableTest = new LocalVariableTest();
        int num=10;
        localVariableTest.test1();
    }

    public void test1(){
        Date date = new Date();
        String name1="ohj.com";
        String info=test2(date,name1);
        System.out.println(date+name1);
    }



    public String test2(Date dateP,String name2){
        dateP=null;
        name2="ouhaojin";
        double weigh=130.5;
        char gender='男';
        return dateP+name2;
    }

    public void test3(){
        this.count++;
    }

    public void test4(){
        int a=0;
        {
            int b=0;
            b=a+1;
        }
        //变量c使用之前已经销毁的变量b的slot
        int c=a+1;
    }

    public void test5(){
        int num;
        //下面代码编译出错： 变量num未进行初始化
       // System.out.println(num);
    }

}
