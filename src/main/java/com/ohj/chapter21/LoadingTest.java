package com.ohj.chapter21;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class LoadingTest {

    public static void main(String[] args) throws Exception {
        //获取String类的Class对象，通过Class对象，可以获取到String类到所有方法信息，字段等数据结构。
        Class<?> clazz = Class.forName("java.lang.String");

        //获取运行时类声明等所有方法
        Method[] ms = clazz.getDeclaredMethods();
        for (Method m : ms) {
            //获取方法的修饰符
            String mod = Modifier.toString(m.getModifiers());
            System.out.print(mod + " ");

            //获取方法的返回值类型
            String retrunType = m.getReturnType().getSimpleName();
            System.out.print(retrunType + " ");

            //获取方法名
            System.out.print(m.getName() + "(");
            //获取方法的参数列表
            Class<?>[] ps = m.getParameterTypes();
            if (ps.length == 0) {
                System.out.print(")");
            }
            for (int i = 0; i < ps.length; i++) {
                char end = (i == ps.length - 1) ? ')' : ',';
                //获取参数的类型
                System.out.print(ps[i].getSimpleName()+end);
            }
            System.out.println();
        }


    }
}
