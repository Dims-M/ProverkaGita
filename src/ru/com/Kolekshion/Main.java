package ru.com.Kolekshion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static ru.com.Kolekshion.RabotaS_Massivami.foode;
import static ru.com.Kolekshion.RabotaS_Massivami.massivInt;
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
//        RabotaS_Massivami rabotaS_massivami = new RabotaS_Massivami();
//        rabotaS_massivami.vivodStringMassiva(rabotaS_massivami.food);
//      //  rabotaS_massivami.menaemAdresa_v_Int (1,2,rabotaS_massivami.randomMassiva(10));
//        rabotaS_massivami.vivodStringMassiva(rabotaS_massivami.food);
//      //  rabotaS_massivami.randomMassiva(10);
//        rabotaS_massivami.vivodIntMassiva(massivInt);
//        rabotaS_massivami.menaemAdresa_v_Int(0, 1, rabotaS_massivami.massivInt);
//        rabotaS_massivami.menaemAdresa_v_Int(0,1,massivInt);
//        System.out.println(rabotaS_massivami.menaemAdresa_v_Int(0,1,massivInt));
//        rabotaS_massivami.menaemAdresa_v_Int(0, 1, rabotaS_massivami.massivInt);
//        rabotaS_massivami.vivodIntMassiva(massivInt);
//        rabotaS_massivami.menaemAdresa_v_Int(1,2,massivInt);
//        rabotaS_massivami.vivodIntMassiva(massivInt);

        razdelitel ();
        RabotaS_Massivami rabotaS_massivami1 = new RabotaS_Massivami();

        rabotaS_massivami1.randomMassiva(4);
        rabotaS_massivami1.vivodIntMassiva(massivInt);
        rabotaS_massivami1.menaemAdresa_v_Int(1,2,massivInt);
        rabotaS_massivami1.vivodIntMassiva(massivInt);

        razdelitel();
        razdelitel();
        rabotaS_massivami1.vivodStringMassiva(foode);
        rabotaS_massivami1.vivodStringMassiva(foode);
        System.out.println("Длина массива" +foode.length);

        rabotaS_massivami1.menaemAdresa_v_Strinf(5,0,foode );
        rabotaS_massivami1.menaemAdresa_v_Strinf(4,1,foode );
        razdelitel();
        razdelitel();
        razdelitel();
        razdelitel();
        rabotaS_massivami1.poiskV_massiveString(foode);





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
