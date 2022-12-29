package com.ohj.chapter8;

public class HeapDemo {
    public static void main(String[] args) throws InterruptedException {

        //返回虚拟机中堆的内存总量
        long initialMemory=Runtime.getRuntime().totalMemory() /1024/ 1024;

        //返回虚拟机中堆的最大内存
        long maxMemory=Runtime.getRuntime().maxMemory() /1024/1024;

        System.out.println("-Xms:"+initialMemory+"M");  //575M
        System.out.println("-Xmx:"+maxMemory+"M");  //575M

        // -XX:+PrintGCDetails

        //TimeUnit.SECONDS.sleep(10000000);
    }
}
