package ru.com.Kolekshion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static ru.com.Kolekshion.VsakoRazno.listA;

/**
 * Created by Администратор on 12.11.2016.
 */
public class Main {

    public static void main(String[] args) {

        VsakoRazno vsakoRazno = new VsakoRazno();
        vsakoRazno.vividMassivaForeach();



        Collection<VsakoRazno> collection = new ArrayList();
        collection.add(vsakoRazno);
       // collection.toArray(vsakoRazno.arrayList.toArray());
        System.out.println(collection);
        vivid((ArrayList) collection);

        listA ();



    } // конец методв Main


    public static void vivid(ArrayList col) {

        for (Object str : col) {
            System.out.println(Objects.toString(str));
            System.out.println("Содержимое Колекции "+str);
        }

    }

}// Клнец класса
