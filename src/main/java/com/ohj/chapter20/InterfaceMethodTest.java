package com.ohj.chapter20;

public class InterfaceMethodTest {
    //方法调用指令： invokeinterface
    public void invoke3(){
        IA aa=new Test();
        IA.method1(); //调用静态方法
        aa.method2(); //调用默认方法
        aa.method3(); //调用接口方法
    }
}

interface IA{
    //JDK8新特性： 接口允许有静态方法和默认方法。
    public static void method1(){}
    public default void method2(){}
    public void method3();
}

class Test implements IA{
    @Override
    public void method3() {}
}
