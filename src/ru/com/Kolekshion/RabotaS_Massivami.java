package ru.com.Kolekshion;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 25.11.2016.
 */
public class RabotaS_Massivami {

    static int asd = 4 ;

   static int temp;

   public static String [] food = {" Привет ", " Пользователь ", " Наш" };

   public static String [] foode = {"Салат ", "Акрошка ", "Лапша", "Пирог", "Чай ", "Выпей яду Адцки сaтана )))"};

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

            food[b] = food[a];
            food[a] = temp;
            break;

        }
        System.out.println("Cработал обмен индексов*****");
        for (String strd: food )
            System.out.print(" " + strd );
        System.out.println(" ");
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

    public static void poiskV_massiveString (Object [] objects){

        System.out.println("введите данные на поиск");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        String [] str =  new  String[10];
        boolean proverka = true;

      //  if (objects == str){
            // Проверка на тип массива

            str = (String[]) objects;
            String stroka = scanner.nextLine();

            for (String  temp : str){
                if (temp.startsWith(stroka)){
                    System.out.println("Поиск завершен " + temp);
                    continue;
                }

                else {
                    System.out.println("Поиск не дал результатов. Измените поисковый запрос.");
                }

            }

            while (proverka)
        System.out.println("Вывести все элементы массива?");
        System.out.println("Да(1) или Нет(0)");

        int tempVvod =  scanner1.nextByte();
        if (tempVvod == 1){

        }

        if (tempVvod ==2){
            System.out.println("Пограмма завершила свою работу");
           proverka = false;
        }
      //  }


    }





} // Конец класса
