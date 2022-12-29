package com.ohj.chapter8;

import java.util.concurrent.TimeUnit;

/**
 * 栈上分配测试
 * 关闭逃逸分析：-Xmx256m -Xms256m -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 * 开启逃逸分析：-Xmx256m -Xms256m -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
 */
public class StackAllocation {
    public static void main(String[] args) throws InterruptedException {
        long start=System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        //查看执行时间
        long end =System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start)+"ms");

        //为了方便查看堆中对象的个数，线程sleep
        TimeUnit.SECONDS.sleep(1000000);


        //结果： 开启逃逸分析花费的时间短，因为没有发生GC
    }

    private static void alloc(){
        User user =new User();  //未发生逃逸
    }

    static class User{}
}
