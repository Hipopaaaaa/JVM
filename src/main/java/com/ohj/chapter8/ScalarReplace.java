package com.ohj.chapter8;

/**
 * 标量替换测试：
 * 关闭标量替换： -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 * 开启标量替换： -Xmx100m -Xms100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 */
public class ScalarReplace {
    public static class User{
        public int id;
        public String name;
    }

    public static void alloc(){
        User user = new User(); //未发生逃逸
        user.id=5;
        user.name="ohj";
    }

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end =System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start)+"ms");

        //结果是开启标量替换后花费的时间少，并且没有GC
    }
}
