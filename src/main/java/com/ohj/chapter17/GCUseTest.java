package com.ohj.chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GCUseTest {

    public static void main(String[] args) throws InterruptedException {
        List<byte[]> list=new ArrayList();

        while (true){
            byte[] arr = new byte[100];
            list.add(arr);
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}
