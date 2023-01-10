package com.ohj.chapter23;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Hipopaaaaa
 * @create 2023/1/9 17:44
 */
public class JProfilerTest {
     public static void main(String[] args) throws InterruptedException {
          while(true){
               List<Data> list=new ArrayList();
               for (int i = 0; i < 500; i++) {
                    Data data = new Data();
                    list.add(data);
               }
               TimeUnit.MILLISECONDS.sleep(500);
          }
     }
}

class Data{
     private int size=10;
     private byte[] buffer=new byte[1024*1024]; //1MB
     private String info="hello,ohj";
}
