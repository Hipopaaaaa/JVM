package com.ohj.chapter20;

import java.util.Date;

public class MethodInvokeReturnTest {

    //方法调用指令： invokespecial
    public void invoke1(){
        //情况1： <init>()
        Date date = new Date();
        Thread t1 = new Thread();

        //情况2： 父类方法
        super.toString();

        //情况3： 私有方法
        methodPrivate();
    }

    private void methodPrivate(){}

    //方法调用指令： invokestatic
    public void invoke2(){
        methodStatic();
    }
    public static void methodStatic(){}

    //方法调用指令： invokevirtual
    public void invoke4(){
        Thread t1=null;
        t1.run(); //允许后才知道是空指针异常
    }
}


