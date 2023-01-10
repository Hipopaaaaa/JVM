package com.ohj.chapter21;

import java.util.concurrent.TimeUnit;

public class StaticDeadLockMain extends Thread{
    private char flag;
    public StaticDeadLockMain(char flag){
        this.flag=flag;
        this.setName("Thread"+flag);
    }

    @Override
    public void run() {
        try {
            Class.forName("com.ohj.chapter21.Static"+flag);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName()+"over");
    }

    public static void main(String[] args) {
        StaticDeadLockMain loadA = new StaticDeadLockMain('A');
        StaticDeadLockMain loadB = new StaticDeadLockMain('B');
        loadA.start();
        loadB.start();
    }
}



class StaticA {
    static {
        try {
            TimeUnit.SECONDS.sleep(1);
            Class.forName("com.ohj.chapter21.StaticB");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Static A init OK");
    }

}

class StaticB {
    static {
        try {
            TimeUnit.SECONDS.sleep(1);
            Class.forName("com.ohj.chapter21.StaticA");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Static A init OK");
    }
}