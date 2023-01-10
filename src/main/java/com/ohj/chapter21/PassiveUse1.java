package com.ohj.chapter21;

import org.junit.jupiter.api.Test;

/**
 * @author Hipopaaaaa
 * @create 2023/1/4 16:48
 *
 * 关于类的被动使用，不会进行类的初始化操作。即不会调用clinit
 * 1.当访问一个静态字段时，只有真正声明这个字段的类才会被初始化。（当通过子类引用父类的静态变量，不会导致子类初始化）
 * 2.通过数组定义类引用，不会触发此类的初始化。
 * 3.引用常量不会触发此类或接口的初始化。因为常量在链接阶段的准备环节就已经被显式赋值了。
 */
public class PassiveUse1 {
    @Test
    public void test1(){
        System.out.println(Child.num);
    }

    @Test
    public void test2(){
        Parent[] parents=new Parent[10];
    }

    @Test
    public void test3() throws ClassNotFoundException {
        Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("com.ohj.chapter21.Parent");
    }
}

class Parent{
    static {
        System.out.println("Parent的初始化");
    }
    public static int num=1;
}
class Child extends Parent{
    static {
        System.out.println("Child的初始化");
    }
}

