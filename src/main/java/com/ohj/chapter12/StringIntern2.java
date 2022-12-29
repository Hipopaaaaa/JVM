package com.ohj.chapter12;

import java.util.concurrent.TimeUnit;

public class StringIntern2 {
    public static final int MAX_COUNT=100*10000;
    public static final String[] arr=new String[MAX_COUNT];
    public static void main(String[] args) {

        Integer[] data=new Integer[]{1,2,3,4,5,6,7,8,9,10};
        long start=System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            //arr[i]=new String(String.valueOf(data[i%data.length]));
            arr[i]=new String(String.valueOf(data[i%data.length])).intern();
        }

        try {
            TimeUnit.SECONDS.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            System.gc();
        }
    }
}
