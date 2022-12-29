package com.ohj.chapter2;

public class ClassLoaderTest3 {
    public static void main(String[] args) throws ClassNotFoundException {

        //方式一：
        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader); //null 获取引导类加载器

        //方式二
        ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader1); //获取应用程序类加载器

        //方式三：
        ClassLoader classLoader2 = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader2); //获取应用程序类加载器


    }
}
