package ru.gitProet.ru.com.krestikiNoliki;

/**
 * Created by Администратор on 01.10.2016.
 */
public class Sorter {

    private int []mas; // Создали переменную для хранения ссылки на нужный нам массив обьектов

    public  Sorter (int []mas){ // Конструктор
        this.mas = mas;
    }

    //метод для сортировки!!!

    private void swap (int[]mas, int index){

        int temp = mas[index-1];
        mas[index-1] = mas[index];
        mas[index] = temp;

    }


    public int [] bubbleSort (){
        System.out.println("Работаем сартировщик массивов");
        int [] rezMas = mas;  // Для хранения аригинальных значений

        for (int i = 1; i < rezMas.length; i++){ // Механизм сортировки

            for ( int j = rezMas.length; j > i; j--){

                if (rezMas[j-1] > rezMas[j]){
               swap(rezMas,j);

                }
            }



        }


        return rezMas;
    }

}
