package com.ohj.chapter21;

import org.junit.jupiter.api.Test;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 测试类的主动使用： 会调用类的<clinit>()方法
 * 1. 当创建一个类的实例时，比如使用new关键字，或者通过反射、克隆、反序列化。
 * 2. 当调用类的静态方法时，即当使用了字节码invokestatic指令。
 */
public class ActiveUse1 {

    public static void main(String[] args) {
        Order order = new Order();
    }

    //序列化的过程：
    @Test
    public void test1() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("order.bat")));
        oos.writeObject(new Order());
        oos.close();
    }
    //反序列化过程(验证)：
    @Test
    public void test2() throws Exception{
        ObjectInputStream ois=new ObjectInputStream(Files.newInputStream(Paths.get("order.bat")));
        Order order = (Order) ois.readObject();
        ois.close();
    }

    @Test
    public void test3(){
        Order.method();
    }
}

class Order implements Serializable {
    static {
        System.out.println("Order类的初始化过程");
    }

    public static void method(){
        System.out.println("Order method()....");
    }
}
