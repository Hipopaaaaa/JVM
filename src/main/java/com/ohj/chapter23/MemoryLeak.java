package com.ohj.chapter23;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Hipopaaaaa
 * @create 2023/1/9 17:50
 */
public class MemoryLeak {
     public static void main(String[] args) throws InterruptedException {
          while(true){
               List<Bean> beanList=new ArrayList();
               for (int i = 0; i < 500; i++) {
                    Bean data = new Bean();
                    data.list.add(new byte[1024*10]);//10kb
                    beanList.add(data);
               }
               TimeUnit.MILLISECONDS.sleep(500);
          }
     }
}

class Bean{
     int size=10;
     String info="hello,ohj";
     static ArrayList list=new ArrayList();
}
