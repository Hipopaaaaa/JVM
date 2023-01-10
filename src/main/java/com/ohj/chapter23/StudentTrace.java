package com.ohj.chapter23;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hipopaaaaa
 * @create 2023/1/7 21:47
 * 有一个学生浏览网页的记录程序，它将记录每个学生访问过的网站地址。
 * 它又三个部分组成： Student、WebPage和StudentTrace三个类。
 *
 * -XX:+HeapDumpBeforeFullGC -XX:HeapDumpPath=/Users/hipopaaaa/Desktop/student.hprof
 */
public class StudentTrace {
     static List<WebPage> webPages=new ArrayList<WebPage>();

     public static void createWebPages(){
          for (int i = 0; i < 100; i++) {
               WebPage webPage = new WebPage();
               webPage.setUrl("http://www."+Integer.toString(i)+".com");
               webPage.setContent(Integer.toString(i));
               webPages.add(webPage);
          }
     }

     public static void main(String[] args) {
          createWebPages();  //创建100个网页

          Student st3 = new Student(3, "Tom");
          Student st5 = new Student(5, "Jerry");
          Student st7 = new Student(7, "Lily");

          for (int i = 0; i < webPages.size(); i++) {
               if(i%st3.getId()==0){
                    st3.visit(webPages.get(i));
               }
               if(i%st5.getId()==0){
                    st5.visit(webPages.get(i));
               }
               if(i%st7.getId()==0){
                    st7.visit(webPages.get(i));
               }
          }
          webPages.clear();
          System.gc();
     }
}

class Student{
     private int id;
     private String name;
     private List<WebPage> history=new ArrayList<>();

     public Student(int id, String name) {
          this.id = id;
          this.name = name;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public List<WebPage> getHistory() {
          return history;
     }

     public void setHistory(List<WebPage> history) {
          this.history = history;
     }

     public void visit(WebPage webPage){
          if(webPage!=null){
               history.add(webPage);
          }
     }
}

class WebPage{
     private String url;
     private String content;

     public String getUrl() {
          return url;
     }

     public void setUrl(String url) {
          this.url = url;
     }

     public String getContent() {
          return content;
     }

     public void setContent(String content) {
          this.content = content;
     }
}
