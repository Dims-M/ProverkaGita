package ru.com.Kolekshion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 12.11.2016.
 */
public class VsakoRazno {


//    VsakoRazno () {
//       // String[] mas = new String[3];
//        ArrayList<String[]> arrayList = new ArrayList();
//        arrayList.add(mas);
//    }


    ArrayList<String[]> arrayList = new ArrayList();


    // Создали строковой массив и заполнили его значениями
    public static String[] mas = {"aaa ", "bbb ", "ccc "};

    public void vividMassivaForeach() {
// вывод значений массива с помощью цикла foreach
        for (String srt : mas) {
            System.out.printf("Содержание массива = " + srt + "\n");

        }

        arrayList.add(mas);
        //добавили в колекцию аррейЛист массив
        razdelitel();
        for (String str : mas) {
                // вывод разделителя
            System.out.println("Вывод жанных которые содержатся в  ArrayList " + str);

        }

        System.out.println("Вывод данных из колекции с помощью цикла for");
            int asd = arrayList.size();
        for (int a = 0; a  < asd; a++ ){

            System.out.println( arrayList.get(a));

            }

    } // конец метода


    public static void listA () {
        razdelitel();
        List<Zapisi_I_zametki> list = new ArrayList<>();

        Zapisi_I_zametki zapisi = new Zapisi_I_zametki();
        Zapisi_I_zametki zapis2 = new Zapisi_I_zametki();
        Zapisi_I_zametki zapis3 = new Zapisi_I_zametki();

        zapisi.setProbniy(1000);

        list.add(zapisi);
        list.add(zapis2);
        list.add(zapis3);


        System.out.println(list);
        System.out.println(list.get(0));

        for (Zapisi_I_zametki z : list) {
            System.out.println("Получаем ссылки на объект");
            System.out.println(z);
        }

        for (Zapisi_I_zametki z : list) {
            boolean bol = false;
            if (bol == z.equals(1)) {
                System.out.println("Значение хранимое в Листе равно 0");
            } else {
                System.out.println(z.getProbniy());
            }
            System.out.println(z.getProbniy());
        }
    }

    public static void razdelitel (){
        System.out.println("**************************");
    }
}
 // коонец класса
