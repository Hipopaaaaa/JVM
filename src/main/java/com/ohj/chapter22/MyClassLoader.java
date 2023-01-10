package com.ohj.chapter22;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Hipopaaaaa
 * @create 2023/1/5 20:55
 * 自定义类加载器
 */
public class MyClassLoader extends ClassLoader{
    //字节码文件的路径
    private String byteCodePath;

    public MyClassLoader(String byteCodePath) {
        this.byteCodePath = byteCodePath;
    }

    public MyClassLoader(ClassLoader parent, String byteCodePath) {
        super(parent);
        this.byteCodePath = byteCodePath;
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        BufferedInputStream bis = null;
        ByteArrayOutputStream baos = null;
        try {
            //获取字节码文件的完整路径
            String fileName=byteCodePath+className+".class";
            bis = new BufferedInputStream(new FileInputStream(fileName));
            //把文件中的数据写入内存中的字节数组流。
            baos = new ByteArrayOutputStream();
            int len;
            byte[] data = new byte[1024];
            while ((len=bis.read(data))!=-1){
                baos.write(data,0,len);
            }
            //把文件的数据转换成字节数组
            byte[] byteCodes = baos.toByteArray();
            //根据字节数组生成Class对象
            Class<?> clazz = defineClass(null, byteCodes, 0, byteCodes.length);
            return clazz;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(baos!=null){
                    baos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(bis!=null){
                    bis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
