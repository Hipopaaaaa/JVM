package com.ohj.chapter20;

public class IfSwitchGotoTest {

    public void compare(){
        short s1=1;
        short s2=2;
        if(s1<s2){
            s1=3;
        }else {
            s1=4;
        }
    }

    public void compare2(){
        double s1=1;
        double s2=2;
        if(s1<s2){
            s1=3;
        }else {
            s1=4;
        }
    }
    public void compare3(){
        int s1=1;
        int s2=2;
        if(s1<s2){
            s1=3;
        }else {
            s1=4;
        }
    }

    public void compare4(){
        double a=0;
        if(a!=0){
            a=10;
        }else {
            a=20; //执行
        }
    }




}
