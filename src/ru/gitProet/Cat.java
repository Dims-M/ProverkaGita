package ru.gitProet;

/**
 * Created by Администратор on 24.09.2016.
 */
public class Cat extends Animal {

    Cat (String name){
      this.name = name;
    }

    String name;

    public void destroySofa (){
        System.out.println("Кошка по имени "+ name + " Начинает царапать софу или кровать");
    }


}
