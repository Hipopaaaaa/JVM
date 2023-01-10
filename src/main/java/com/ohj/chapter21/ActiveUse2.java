package com.ohj.chapter21;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author Hipopaaaaa
 * @create 2023/1/4 15:15
 *  测试类的主动使用： 会调用类的<clinit>()方法
 *  3.当使用类、接口的静态字段时（final修饰特殊考虑），比如，使用getstatic或者putstatic指令。（对应访问变量、赋值变量操作）
 *
 */
public class ActiveUse2 {
    @Test
    public void test1(){
        System.out.println(User.num);
    }
    @Test
    public void test2(){
        //System.out.println(IA.NUM1);  //没有执行clinit
        System.out.println(IA.NUM2);  //有执行clinit
    }
}

class User{
    public static int num=1;
    static{
        System.out.println("User类的初始化过程");
    }
}
interface IA{
    public static final Thread t=new Thread(){
        {
            System.out.println("IA的初始化");
        }
    };
    public static final int NUM1=1;
    public static final int NUM2=new Random().nextInt(10);
}