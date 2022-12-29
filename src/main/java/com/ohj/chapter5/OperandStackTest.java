package com.ohj.chapter5;

public class OperandStackTest {

    public void testAddOperation(){
        byte i=15;
        int j=8;
        int k=i+j;
    }

    public int getSum(){
        int m=10;
        int n=20;
        int k=m+n;
        return k;
    }

    public void testGetSum(){
        int i = getSum();
        int j=10;
    }


    //面试题： i++和 ++i的区别
    public void add(){
        int i1=10;
        i1++;

        int i2=10;
        ++i2;

    }
}
