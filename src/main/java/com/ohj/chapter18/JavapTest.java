package com.ohj.chapter18;

public class JavapTest {

    private int num;
    boolean flag;
    protected char gender;
    public String info;
    public static final int COUNTS=1;

    static {
        String url="www.ohj.com";
    }

    {
        info="java";
    }

    public JavapTest(){

    }

    private JavapTest(boolean falg){
        this.flag=falg;
    }

    private void methodPrivate(){

    }

    int getNum(int i){
        return num+i;
    }
    protected char showGender(){
        return gender;
    }
    public void showInfo(){
        int i=10;
        System.out.println(info+i);
    }
}
