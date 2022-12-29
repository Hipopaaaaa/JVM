package com.ohj.chapter16;

public class SystemGCTest {

    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();

        System.runFinalization();  //强制调用使用引用对象的finalize()方法
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("SystemGCTest重写了finalize()");
    }
}
