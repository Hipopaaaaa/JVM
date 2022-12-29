package com.ohj.chapter12;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class TestStringTable {
    public static void main(String[] args) throws InterruptedException {
        HashSet<String> set = new HashSet<>();
        int i=0;
        TimeUnit.SECONDS.sleep(10);
        while (true){
            String str = "a" + (i++);
        }
    }
}
