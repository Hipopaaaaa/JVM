package com.ohj.chapter2;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2
        
        //获取其上层： 扩展类加载器
        ClassLoader exClassLoader = systemClassLoader.getParent();
        System.out.println(exClassLoader); //sun.misc.Launcher$ExtClassLoader@677327b6

        //获取其上层： 获取不到引导类加载器
        ClassLoader bootstrapClassLoader = exClassLoader.getParent();
        System.out.println(bootstrapClassLoader); //null

        //对于用户自定义类来说,默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类使用引导类加载器进行加载的，因此为null
        System.out.println(String.class.getClassLoader()); //null
    }
}
