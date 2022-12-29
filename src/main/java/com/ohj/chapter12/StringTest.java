package com.ohj.chapter12;

import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    public void test1() {
        String s1 = "a" + "b" + "c";
        /*
        s1在字节码文件中的形式：String s1="abc"；
         */
        String s2 = "abc";
        System.out.println(s1 == s2); //true，它们指向字符串常量池的同一个常量
        System.out.println(s1.equals(s2)); //true
    }

    @Test
    public void test2() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";

        //若拼接过程中出现了变量，则相当于在堆空间中 new String()，该对象具体的内容为拼接的结果
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4); //true
        System.out.println(s3 == s5); //false
        System.out.println(s3 == s6); //false
        System.out.println(s3 == s7); //false
        System.out.println(s5 == s6); //false
        System.out.println(s5 == s7); //false
        System.out.println(s6 == s7); //false

        //intern(): 判断字符串常量池中是否存在"javaEEhadoop"的值，如果存在，则返回字符串常量池中"javaEEhadoop"的地址。
        //若字符串常量池不存在"javaEEhadoop",则在字符串常量池中加载一份"javaEEhadoop"，并返回此对象的地址。
        String s8 = s7.intern();
        System.out.println(s3 == s8); //true

    }

    @Test
    public void test3() {
        String s1 = "a";
        String s2 = "b";
        /*
        s1+s2的执行流程等价于：
        StringBuilder s=new StringBuilder();
        s.append("a");
        s.append("b");
        s.toString()  -->类似于 new String();
         */
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4); //false
    }

    @Test
    public void test4() {
        final String s1 = "a"; //s1为常量引用
        final String s2 = "b"; //s2为常量引用

        String s3 = "ab";
        String s4 = s1 + s2;  //编译期优化
        System.out.println(s3 == s4); //true
    }
}
