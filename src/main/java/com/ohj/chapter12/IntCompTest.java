package com.ohj.chapter12;

public class IntCompTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        testPrimeNumber(1000000);
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start)+"ms");
    }



    public static void testPrimeNumber(int count){
        for (int i = 0; i < count; i++) {
            lable:
            for (int j = 0; j < 100; j++) {
                    for(int k=2;k<=Math.sqrt(j);k++){
                        if(j%k==0){
                            continue lable;
                        }
                    }
            }
        }
    }
}
