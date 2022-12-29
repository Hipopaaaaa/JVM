package com.ohj.chapter8;

import java.util.ArrayList;
import java.util.List;

public class GCTest {

    public static void main(String[] args) {
        int i=0;
        try {
            List<String> list=new ArrayList();
            String a="ohj.com";
            while (true){
                list.add(a);
                a=a+a;
                i++;
            }
        } catch (Exception e) {
            System.out.println("遍历次数为："+i);
        }
    }
}
