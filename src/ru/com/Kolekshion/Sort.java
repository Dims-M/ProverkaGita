package ru.com.Kolekshion;

import java.util.Random;

/**
 * Created by Администратор on 18.11.2016.
 */
public class Sort {
    String oiasanie = "Класс отвечает за сортировку массивов";


    public static void sorttMassiv (){

        // создали масив в 10 элементами
        int [] nums = new int[10];
        int countRandom = 0;
        // метод рандом для заполнения массива

        Random random = new Random();

        for (int strTemp : nums) {
            System.out.println("Текущие состояние массива = " + strTemp);
        }
        // заполняем случайным значение от 0 до 100
        for (int i = 0; i <nums.length; i++){
            countRandom = random.nextInt(100);
            nums[i] = countRandom;
            // заполняем случайным значение от 0 до 100
        }
        System.out.println();
        for (int strTemp2 : nums) {
            System.out.println("Текущие состояние массива = " + strTemp2);
        }






    }




} //Конец класса
