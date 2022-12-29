package com.ohj.chapter2;

public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r=()->{
            System.out.println(Thread.currentThread().getName()+"开始");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName()+"结束");
        };

        // 效果，只有一个线程能初始化DeadThread，输出，另一个线程等待，因为初始化时被死循环卡住
        new Thread(r,"线程1").start();
        new Thread(r,"线程2").start();
    }
}

class DeadThread{
    static {
        if(true){
            System.out.println(Thread.currentThread().getName()+" 初始化当前类");
            while (true){

            }
        }
    }
}