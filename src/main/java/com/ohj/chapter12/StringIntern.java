package com.ohj.chapter12;

public class StringIntern {
    public static void main(String[] args) {
        String s=new String("1");
        s.intern();
        String s2="1";
        System.out.println(s==s2);  //false

        String s3=new String("1")+new String("1");
        String s4="11";
        s3.intern();
        System.out.println(s3==s4);  //jdk6: false  jdk7+:true
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s3.intern().hashCode());

    }
}
