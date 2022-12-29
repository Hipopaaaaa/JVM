package com.ohj.chapter9;

import java.util.concurrent.TimeUnit;

public class StaticFieldTest {
    private static byte[] arr=new byte[1024*1024*100]; //100mb

    public static void main(String[] args) throws InterruptedException {
        System.out.println(StaticFieldTest.arr);

        TimeUnit.SECONDS.sleep(10000000);
    }
}
