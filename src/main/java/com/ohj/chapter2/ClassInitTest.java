package com.ohj.chapter2;

public class ClassInitTest {
    public static int num=1;

    static {
        num=2;
        number=20;
    }
    //number在 linking的prepare阶段会 =0  -->在initialization阶段 =20  --> 10
    private static int number=10;
    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number); //10
    }
}
