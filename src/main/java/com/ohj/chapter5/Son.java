package com.ohj.chapter5;

 class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str){
        System.out.println("father"+str);
    }

    public final void showFinal(){
        System.out.println("father show final");
    }

    public void showCommon(){
        System.out.println("father 普通方法");
    }
}


public class Son extends Father{
    public Son() {
        super();
    }
    public Son(int age){
        this();
    }
    public static void showStatic(String str){
        System.out.println("son"+str);
    }
    private void showPrivate(String str){
        System.out.println("son private"+str);
    }
    public void show(){
        //以下四种方法都是非虚方法
        showStatic("ohj.com");
        super.showStatic("good");
        showPrivate("hello");
        super.showCommon();


        showFinal();
    }
}