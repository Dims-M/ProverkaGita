package ru.gitProet;

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
    public void Lau() {
        System.out.println("Собака "+name + " лает ");
    }
}
