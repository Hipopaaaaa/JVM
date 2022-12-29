package com.ohj.chapter17;

import java.util.ArrayList;
import java.util.List;

public class GCLogTest {
    public static void main(String[] args) {
        List<byte[]> list=new ArrayList();
        for (int i = 0; i < 500; i++) {
            byte[] arr = new byte[1024 * 100];  //100kb
            list.add(arr);
        }
    }
}
