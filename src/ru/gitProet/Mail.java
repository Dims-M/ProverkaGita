package ru.gitProet;

/**
 * Created by Администратор on 23.09.2016.
 */
public class Mail {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Киса";

        Cat cat = new Cat("Муська");
       // cat.name = "Муська";
        cat.destroySofa();
        cat.pol = false;
        cat.voice ();
        cat.Lau();

        Dog dog = new Dog("Арго");
        dog.Lau();



    } // конец класса Main
}
