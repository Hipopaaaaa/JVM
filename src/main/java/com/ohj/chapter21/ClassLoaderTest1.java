package com.ohj.chapter21;

/**
 * @author Hipopaaaaa
 * @create 2023/1/5 13:52
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();  //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(systemClassLoader);

        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();  //sun.misc.Launcher$ExtClassLoader@511d50c0
        System.out.println(extClassLoader);

        //试图获取引导类加载器： 失败
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();  //null
        System.out.println(bootstrapClassLoader);


        //#############################

        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Class.forName("com.ohj.chapter21.ClassLoaderTest1").getClassLoader();
        System.out.println(classLoader1);

        //关于数组类的加载：

    }
}
