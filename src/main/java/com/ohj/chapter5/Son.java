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
        //invokespecial
        super();
    }
    public Son(int age){
        //invokespecial
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
        //invokestatic
        showStatic("ohj.com");
        //invokestatic
        super.showStatic("good");
        //invokespecial
        showPrivate("hello");
        //invokespecial
        super.showCommon();

        //invokevirtual   因为此方法是final，不能被子类重写，因此是非虚方法。 但没加super.  因此编译器认为是虚方法。
        showFinal();

        //invokevirtual  子类没重写，就调用父类的info(),子类重写了，就调用子类的info()，因此编译期间不能确定。
        info();
        //invokevirtual  子类没重写，但是没显示的写super. 因此认为是虚方法
        showCommon();

        //invokeinterface
        Test test=null;
        test.methodA();

    }

    public void info(){

    }
}

interface Test{
     void methodA();
}