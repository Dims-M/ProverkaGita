package ru.com.Kolekshion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 12.11.2016.
 */
public class VsakoRazno {

    ArrayList<String[]> arrayList = new ArrayList();


    // Создали строковой массив и заполнили его значениями
    public String[] mas = {"aaa ", "bbb ", "ccc "};

    public void vividMassivaForeach() {
// вывод значений массива с помощью цикла foreach
        for (String srt : mas) {
            System.out.printf("Содержание массива = " + srt + "\n");

        }

        arrayList.add(mas);
        razdelitel();
        for (String str : mas) {
                // вывод разделителя
            System.out.println("Вывод жанных которые содержатся в  ArrayList " + str);

        }

    } // конец метода



    public void razdelitel (){
        System.out.println("**************************");
    }
}
 // коонец класса
