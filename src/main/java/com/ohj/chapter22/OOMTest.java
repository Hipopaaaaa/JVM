package com.ohj.chapter22;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author Hipopaaaaa
 * @create 2023/1/7 16:51
 */
public class OOMTest {

     public static void main(String[] args) throws InterruptedException {
          ArrayList<Picture> list=new ArrayList();
          while (true){
               TimeUnit.MILLISECONDS.sleep(50);
               list.add(new Picture(new Random().nextInt(100*50)));
          }
     }
}
class Picture{
     private byte[] pixels;

     public Picture(int length) {
         this.pixels=new byte[length];
     }

     public Picture() {
     }
}