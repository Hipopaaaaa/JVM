package com.ohj.chapter22;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @author Hipopaaaaa
 * @create 2023/1/6 15:30
 */
public class GCTest {
     public static void main(String[] args) throws InterruptedException {
          ArrayList<byte[]> list=new ArrayList<>();
          for (int i = 0; i < 1000; i++) {
               byte[] arr = new byte[1024 * 100];//100kb
               list.add(arr);
               TimeUnit.SECONDS.sleep(1);
          }
     }

}
