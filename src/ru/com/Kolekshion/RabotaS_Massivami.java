package ru.com.Kolekshion;

import java.util.Random;

/**
 * Created by Администратор on 25.11.2016.
 */
public class RabotaS_Massivami {

    static int asd = 4 ;

   static int temp;

   public static String [] food = {" Привет ", " Пользователь ", " Наш" };

    public static int [] massivInt = new int[asd];

    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public static void vivodStringMassiva (String []str ){
        System.out.println("Вывод содержимого строкового массива!");

        for (String stroka : str){
            System.out.println(stroka);
        }
    }

    public static void vivodIntMassiva (int []str ){
        System.out.println("Вывод содержимого bynjdjuj массива!");

        for (int stroka : str){
            System.out.println(stroka);
        }
    }


    public static int[] menaemAdresa_v_Int (int a, int b, int [] objects){

                massivInt  = objects;

                for (int i = 0; i < massivInt.length;i++ ) {
                    temp = massivInt[b];

                    massivInt[b] = massivInt[a];
                    massivInt[a] = temp;
                    break;

        }

        System.out.println("Cработал обмен индексов*****");
        for (int j: massivInt )
            System.out.print(" " +j);

        return objects;
    }

    public static String[] menaemAdresa_v_Strinf (int a, int b, String [] objects){

        food = objects;

        for (int i = 0; i < food.length;i++ ){

            String  temp = food[b];

            food[b] = objects[a];
            food[a] = temp;

            System.out.println("Cработал обмен индексов*****");
            for (String strd: food )
                System.out.print(" " + strd);
        }
        return food;
    }


    public static int [] randomMassiva (int dlina){
        asd = dlina;
        System.out.println("Рандомное заполнение миссива");

       int [] znach = new int[dlina];

        Random random = new Random();

        for (int i  = 0; i < znach.length; i++ ){
            int temp =random.nextInt(1000);
            znach[i] = temp;
            massivInt[i] = temp;
        }
//
//        for (int chislo : znach){
//            System.out.println(chislo);
//        }



        return znach;


    }



} // Конец класса
