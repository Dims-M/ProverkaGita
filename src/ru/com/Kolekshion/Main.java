package ru.com.Kolekshion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static ru.com.Kolekshion.Sort.bolsort;
import static ru.com.Kolekshion.VsakoRazno.listA;
import static ru.com.Kolekshion.VsakoRazno.rabotaS_LIST;
import static ru.com.Kolekshion.VsakoRazno.randomMetodMassiv;

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
        rabotaS_LIST();
        razdelitel();

        // Coртировка пузырьком
        //sorttMassiv();
        bolsort(randomMetodMassiv(10));

        razdelitel ();
        ///
        RabotaS_Massivami rabotaS_massivami = new RabotaS_Massivami();
        rabotaS_massivami.vivodStringMassiva(rabotaS_massivami.food);
        rabotaS_massivami.menaemAdresa (1,2);
        rabotaS_massivami.vivodStringMassiva(rabotaS_massivami.food);



    } // конец методв Main


    public static void vivid(ArrayList col) {

        for (Object str : col) {
            System.out.println(Objects.toString(str));
            System.out.println("Содержимое Колекции "+str);
        }

    }

    public static  void  razdelitel (){
        System.out.println("*****************************");
    }

}// Клнец класса
