package com.ohj.chapter20;

public class SynchronizedTest {

    private int i=0;
    private Object obj=new Object();

    public void test(){
        //使用引用obj所指的Object类型对象中的监视计数器
        // （该监视计数器在对象头）
        synchronized (obj){
            try {
                i--;
                int i=10/0;
            }finally {
                i--;
            }
        }
    }
}
