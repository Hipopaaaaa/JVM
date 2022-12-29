package com.ohj.chapter8;

public class SynchronizedTest {
    public void f(){
        Object hollis = new Object();
        synchronized (hollis){
            System.out.println(hollis);
        }
    }
}
