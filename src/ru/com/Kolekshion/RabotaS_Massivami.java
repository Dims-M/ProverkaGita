package ru.com.Kolekshion;

/**
 * Created by Администратор on 25.11.2016.
 */
public class RabotaS_Massivami {


   public static String [] food = {" Привет ", " Пользователь ", " Наш" };

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

    public static void menaemAdresa (int a, int b){

        for (int i = 0; i < food.length;i++ ){

            String temp = food[b];
            food[b] = food[a];
            food[a] = temp;
        }

    }


} // Конец класса
