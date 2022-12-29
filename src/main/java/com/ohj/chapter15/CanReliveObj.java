package com.ohj.chapter15;

import java.util.concurrent.TimeUnit;

public class CanReliveObj {
    public static CanReliveObj obj; //GC Root

    @Override
    protected void finalize() throws Throwable {
        System.out.println("调用当前类重写的finalize方法");
        obj=this;  //this就是 堆中的一个没有被引用的，且即将被回收的CanReliveObj对象。
    }

    public static void main(String[] args) throws InterruptedException {
        obj=new CanReliveObj();
        System.out.println(obj.hashCode());  //1360875712
        obj=null;
        //此时 堆中new出来的一个CanReliveObj对象没有任何引用。

        System.gc(); //垃圾回收，会调用CanReliveObj对象的finalize方法。
        System.out.println("第一次GC");
        TimeUnit.SECONDS.sleep(200000);
        if(obj==null){
            System.out.println("CanReliveObj is dead");
        }else {
            System.out.println("CanReliveObj is live");
            System.out.println(obj.hashCode());  //1360875712  证明是堆中的同一个CanReliveObj对象。
        }

        obj=null;
        System.gc();
        System.out.println("第二次GC");
        TimeUnit.SECONDS.sleep(2);
        if(obj==null){
            System.out.println("CanReliveObj is dead");
        }else {
            System.out.println("CanReliveObj is live");
        }
    }
}
