package com.ohj.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HeapInstanceTest {
    byte[] buffer=new byte[new Random().nextInt(1024*200)];

    public static void main(String[] args) throws InterruptedException {
        List<HeapInstanceTest> list=new ArrayList();
        while (true){
            list.add(new HeapInstanceTest());
            try {
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
