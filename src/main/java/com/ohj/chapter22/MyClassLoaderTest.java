package com.ohj.chapter22;

import java.lang.reflect.Method;

/**
 * @author Hipopaaaaa
 * @create 2023/1/5 20:55
 * 使用自定义类加载器进行类的加载
 */
public class MyClassLoaderTest {
     public static void main(String[] args) {
          //传入字节码文件路径
          MyClassLoader loader = new MyClassLoader("/Users/hipopaaaa/Desktop/");
          try {
               //要加载的类
               Class<?> clazz = loader.loadClass("Demo1");
               System.out.println("加载此类的类加载器为："+clazz.getClassLoader().getClass().getName());  //com.ohj.chapter22.MyClassLoader
               Object obj = clazz.newInstance();
               Method method = clazz.getMethod("hi");
               method.invoke(obj);  //成功输出
          } catch (Exception e) {
               throw new RuntimeException(e);
          }
     }
}
