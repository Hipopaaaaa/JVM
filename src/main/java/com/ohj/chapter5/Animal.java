package com.ohj.chapter5;

public class Animal {
    public void eat(){
        System.out.println("动物进食");
    }

}

interface Huntable{
    void hunt();
}

class Dog extends Animal implements  Huntable{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void hunt() {
        System.out.println("捕食耗子，多管闲事");
    }
}

class Cat extends Animal implements Huntable{


    public Cat(){
        super();  //早期绑定 super()就是父类的无参构造器
    }

    public Cat(String name){
        this();  //早期绑定 this()就是Cat的无参构造器
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void hunt() {
        System.out.println("捕食耗子，天经地义");
    }
}

class AnimalTest{
    public void showAnimal(Animal animal){
        animal.eat();  //晚期绑定  根据animal的不同，eat()方法就不同
    }

    public void showHunt(Huntable huntable){
        huntable.hunt();  //晚期绑定  根据animal的不同，hunt(）方法就不同
    }
}