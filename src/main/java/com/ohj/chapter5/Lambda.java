package com.ohj.chapter5;


@FunctionalInterface
interface Func{
    public boolean func(String str);
}

public class Lambda {
    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambdaTest = new Lambda();

        //invokedynamic
        Func func= s->{
            return true;
        };
        lambdaTest.lambda(func);

        lambdaTest.lambda(s->{
            return true;
        });
    }


}




