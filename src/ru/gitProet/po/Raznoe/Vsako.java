package ru.gitProet.po.Raznoe;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import ru.gitProet.ru.com.krestikiNoliki.Sorter;

import java.util.Random;

/**
 * Created by Администратор on 28.09.2016.
 */
public class Vsako {

    static public void vizovContinue ( int abs){
        int coun = abs;

        while (true){

            if (abs == 10){
                break;
            }
            abs++;
            if (abs == 3){
                continue;
            }
            System.out.println("Результат = "+ abs);

            if (abs >= 100){
                break;
            }
        }
    }

    static public void vizovDoWhile (int dsa){
        System.out.println("-----------------------");
        int count = dsa;

                M: // Метка Аналог го ще
                do {

                    if (count == 0) {
                        System.out.println("Первое значение равно = " + count);
                    }

                    if (count  == 5){
                        System.out.println("Выход из цикла с помощью Метки");
                       break   M; // метка
                    }
                    if (count == 10){
                        System.out.println("Выход их цикла");
                        break ;
                    }
                    count++;
                    if (count == 3){
                        System.out.println("работалала команда 'continue'");
                        continue;
                    }

                    System.out.println("Результат = "+ count);

                    if (count >= 100){
                        System.out.println("Максимальное значение = "+count);
                        break;
                    }

                } while (true);
    }


   public static void rabotaSMetkoi (int asd){
       System.out.println("Работа с меткаю для прорывания циклов");
       int a = asd;

       M: // Метка выхода из всех ниже стоящих циклов.
       while (true) { // Бесконечные циклы
           while (true) {
               System.out.println("Coдержимое переменной = " + a);
               while (a == 9) {
                   //System.out.println("Coдержимое переменной = " + a);
                   a++;
                   System.out.println("Сработал брейк");
                   break M ;
               }
               a++;
           }
       }
   }

    public static Integer slolemmieChisel (Integer a, Integer b){
        System.out.println("Изучаем алгоритмы!!");

        Integer summa;
        int d = 0;

        System.out.println("Вариант№1");
        summa = a*b;
        System.out.println("Tекущие сложение 2х сумм равно = "+ summa);

        System.out.println("Вариант№2 с помощью циклов");

        for (int i=0; i<=b; i++ ){
            System.out.println("Текущие значение первой переменной а = "+ d);
            // d += a;
            d = d+a;


        }
        return  summa;
    }

    public static void sortirovkaPuzirkon (){

        int [] mas = new int[10]; // создали массив для сортировки

        for (int i = 0; i <mas.length; i++ ){ // Заполняем массив случайными данными
            Random random = new Random();
            mas[i] = random.nextInt(1000);

            System.out.print(mas[i] +" ");
            // ИЛИ
           // mas[i] =  (int) Math.random()*100;
        }
        System.out.println();
        System.out.println();

        Sorter sorter = new Sorter(mas);
        mas = sorter.bubbleSort();

        for (int asd:mas) {
            System.out.print(asd+" ");
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < mas.length; i++){

            System.out.println("Содержиние текущего массива = "+ mas[i]);
        }

    }


}
