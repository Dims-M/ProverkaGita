package ru.gitProet.po.Raznoe;

/**
 * Created by Администратор on 23.09.2016.
 */
public class Animal {

    String name;
    String svet;
    String poroda;
    String rost;

    int age;
    int vozrast;

    boolean pol = false; // епо умолчанию женский.

    public String voice (){
        System.out.println("Издаю звуки");
        return null;
    }

    public String Lau (){
        System.out.println("Лай из метода предка");
        return null;
    }

}
