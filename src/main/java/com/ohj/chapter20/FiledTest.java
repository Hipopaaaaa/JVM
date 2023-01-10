package com.ohj.chapter20;

public class FiledTest {
    public void test(){
        Order or = new Order();
        or.name="ohj";
        System.out.println(or.name);
    }
}

class Order{
    String name;
}
