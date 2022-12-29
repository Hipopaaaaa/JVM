package com.ohj.chapter2;

import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest2 {

    public static void main(String[] args) {
        System.out.println("**********启动类加载器***********");
        //获取Bootstrap ClassLoader能够加载到api到路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }

        //从上面到路径中随意选择一个类，看他到类加载器是什么: 引导类加载器
        System.out.println(Provider.class.getClassLoader());

        System.out.println("*********扩展类加载器***********");
        //String exDirs = System.getProperty("java.ext.dirs");
        //for (String path : exDirs.split(":")) {
        //    System.out.println(path);
        //}
    }
}
