package com.ohj.chapter21;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author Hipopaaaaa
 * @create 2023/1/4 15:35
 *  测试类的主动使用： 会调用类的<clinit>()方法
 *  4. 当使用java.lang.reflect包中的方法反射类的方法时。比如：Class.forName("com.ohj.java.Test")
 *  5. 当初始化子类时，如果发现其父类还没有进行过初始化，则需要先触发其父类的初始化。
 *  6. 如果一个接口定义了default方法，那么直接实现或者间接实现该接口的类的初始化，该接口要在其之前被初始化。
 *  7. 当虚拟机启动时，用户需要指定一个执行的主类（也就是包含`main()`方法的那个类），虚拟机会先初始化这个主类。
 */
public class ActiveUse3 {
     static{
          System.out.println("ActiveUse3的初始化");
     }
     @Test
     public void test1() throws Exception{
          Class<?> clazz = Class.forName("com.ohj.chapter21.Order");
     }

     @Test
     public void test2(){
          System.out.println(Son.num);
     }

     @Test
     public void test3(){
          System.out.println(IB.NUM1);
     }

     @Test
     public void test4(){
          System.out.println(Son.num);
     }

     public static void main(String[] args) {
          System.out.println("hello");
     }
}

class Father{
     static{
          System.out.println("Father类的初始化过程");
     }
}
class Son extends Father implements IB{
     static{
          System.out.println("Son类的初始化过程");
     }
     public static  int num=1;

}

interface IB{
     public static final Thread t=new Thread(){
          {
               System.out.println("IB的初始化");
          }
     };

     public static final int NUM1=new Random().nextInt(10);

     public default void method1(){
          System.out.println("你好");
     }
}

interface IC extends IB{
     public static final Thread t=new Thread(){
          {
               System.out.println("IC的初始化");
          }
     };

     public static final int NUM2=new Random().nextInt(10);

}