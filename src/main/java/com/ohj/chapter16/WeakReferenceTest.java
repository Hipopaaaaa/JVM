package com.ohj.chapter16;

import java.lang.ref.WeakReference;
public class WeakReferenceTest {

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
        //创建对象，建立弱引用
        WeakReference<User> userSoftRef = new WeakReference<>(new User(1, "ohj"));

        //从弱引用中获取对象
        System.out.println(userSoftRef.get());  //能获取

        System.gc();
        System.out.println("gc之后。。。");

        //垃圾回收之后获得弱引用中的对象。
        System.out.println(userSoftRef.get());  //null

    }
}
