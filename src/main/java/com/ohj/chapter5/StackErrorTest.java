package com.ohj.chapter5;

//栈中的异常
public class StackErrorTest {

    //记录main调用的次数，即为JVM栈的容量，默认情况下这个为10823 每台设备都不同
    private static int count=1; //修改后为1873

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
