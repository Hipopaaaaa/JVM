package com.ohj.chapter20;

public class IfSwitchGotoTest2 {

    public void switch1(int select){
        int num=0;
        switch (select){
            case 1:
                num=10;
                break;
            case 2:
                num=20;
                break;
            case 3:
                num=30;
                break;
        }
    }


    public void switch2(int select){
        int num=0;
        switch (select){
            case 100:
                num=10;
                break;
            case 500:
                num=20;
                break;
            case 300:
                num=30;
                break;
        }
    }

    //jdk7新特效，引入String类型。
    // 实际上使用了先比较hashcode，再equals来定位case。
    public void switch3(String capital) {
        int num;
        switch (capital) {
            case "A":
                num = 10;
                break;
            case "B":
                num = 20;
                break;
            case "C":
                num = 30;
                break;
        }
    }

    public void forInt(){
        //循环结构其实就是用goto+比较指令来实现的
        for (int i = 0; i < 100; i++) {
            String str="ohj";
        }
    }

}
