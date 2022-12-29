package com.ohj.chapter2;

public class StringTest {
    public static void main(String[] args) {

        //不会加载项目中自定义的java.lang包下的String，因为双亲委派机制，加载该类时，会从应用程序类加载器-->扩展类加载器-->引导类加载器，
        // 最终引导类加载器可以加载，因此加载的是核心包下的String
        java.lang.String str = new java.lang.String();

        System.out.println("hello");  //只有hello
    }
}
