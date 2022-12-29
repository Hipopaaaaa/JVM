package com.ohj.chapter16;

import java.util.ArrayList;
import java.util.List;

public class StopTheWorldDemo {

    public static class PrintThread extends Thread{
        public final long startTime=System.currentTimeMillis();

        @Override
        public void run() {
            while (true){
                //每秒打印时间
                long t=System.currentTimeMillis() -startTime;
                System.out.println(t/1000+"."+t%1000);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class WorkThread extends Thread{
        List<byte[]> list=new ArrayList();

        @Override
        public void run() {
            while (true){
                for (int i = 0; i < 1000; i++) {
                    byte[] buffer = new byte[1024];
                    list.add(buffer);
                }
                if(list.size()>10000){
                    list.clear();
                    System.gc();  //出现STW
                }
            }
        }
    }


    public static void main(String[] args) {
        new PrintThread().start();
        new WorkThread().start();


    }
}
