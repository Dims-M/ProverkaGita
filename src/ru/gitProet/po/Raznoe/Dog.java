package ru.gitProet.po.Raznoe;

/**
 * Created by Администратор on 24.09.2016.
 */
public class Dog extends Animal {

    Dog (){

    }
    Dog(String name){
        this.name = name;
    }
    @Override
    public String Lau() {
        System.out.println("Собака "+name + " лает ");
        return null;
    }
}
