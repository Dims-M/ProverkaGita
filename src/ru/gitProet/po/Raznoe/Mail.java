package ru.gitProet.po.Raznoe;

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

        System.out.println("**********************");

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Тося");
        animals[1] = new Dog("Чарли");
        animals[1] = new Fox();
        animals[1] = new Dog("Авчара");

        for (Animal animal1: animals){ // Цикл для обхода всех массивов и вивода данных из них
            System.out.println(animal1);
        }

        System.out.println("---------------");
//        for (int i = 0; i < animals.length; i++){
//            System.out.println(animals[i]);
//           System.out.println(animals[i].Lau());
//
//           // System.out.println(animals[i].voice());
//        }

        Vsako.vizovContinue(12);
        Vsako.vizovDoWhile(1);
        Vsako.rabotaSMetkoi(1);
        System.out.println("---------------");
     // int asddf =  slolemmieChisel(2,10);
      //  System.out.println(asddf);
        System.out.println("---------------");
       // sortirovkaPuzirkon();



    } // конец класса Main
}
