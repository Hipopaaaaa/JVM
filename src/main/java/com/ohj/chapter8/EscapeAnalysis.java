package com.ohj.chapter8;

public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /*
    方法返回EscapeAnalysis对象，发生逃逸
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /*
    为成员属性赋值，发生逃逸（obj使用到了方法内new的对象）
     */
    public void setObj(){
        this.obj=new EscapeAnalysis();
    }

    /*
    对象的作用域仅在当前方法中有效，没有发生逃逸
     */
    public void useEscapeAnalysis(){
        EscapeAnalysis escapeAnalysis = new EscapeAnalysis();
    }

    /*
    引用成员变量的值，发生逃逸（getInstance()所返回的对象无论是它自己new一个，还是obj，都发生了逃逸）
     */
    public void useEscapeAnalysis2(){
        EscapeAnalysis e=getInstance();
    }
}
