package com.ohj.chapter16;

import java.lang.ref.SoftReference;
//设置JVM：  -Xms10m，-Xmx10m
public class SoftReferenceTest {

    public static class User{
        public int id;
        public String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "[id="+id+", name="+name+"]";
        }
    }

    public static void main(String[] args) {
        //创建对象，建立软引用
        SoftReference<User> userSoftRef = new SoftReference<>(new User(1, "ohj"));

        //从软引用中获取对象
        System.out.println(userSoftRef.get());  //能获取

        System.gc();
        System.out.println("gc之后。。。");

        //垃圾回收之后获得软引用中的对象。
        System.out.println(userSoftRef.get());  //能获取，此时内存还够

        try {
            byte[] bytes = new byte[1024 * 1024 * 7];  //触发GC，内存不够，报OOM
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //再次从软引用中获取数据。
            System.out.println(userSoftRef.get()); //null， 内存不足，软引用的对象被回收。
        }


    }
}
