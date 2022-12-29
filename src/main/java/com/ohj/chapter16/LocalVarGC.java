package com.ohj.chapter16;

public class LocalVarGC {

    public void localvarGC1() {
        byte[] buffer = new byte[10 * 1024 * 1024];
        System.gc();  //不会释放
    }

    public void localvarGC2() {
        byte[] buffer = new byte[10 * 1024 * 1024];
        buffer = null;
        System.gc();  //会释放
    }

    public void localvarGC3() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        System.gc(); //不会释放， 查看字节码文件，虽然buffer的作用域结束，但slot还在，相当于引用还在
    }

    public void localvarGC4() {
        {
            byte[] buffer = new byte[10 * 1024 * 1024];
        }
        int value = 10;
        System.gc(); //会释放，查看字节码文件， buffer作用域结束，value变量占用了buffer的slot，buffer引用不存在
    }
    public void localvarGC5(){
        localvarGC1();
        System.gc();  //会释放，当执行完localvarGC1后，栈帧弹出，buffer引用消失，但堆内的对象还在
    }

    public static void main(String[] args) {
        LocalVarGC localVarGC = new LocalVarGC();
        localVarGC.localvarGC4();
    }
}
