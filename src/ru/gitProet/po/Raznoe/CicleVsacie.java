package ru.gitProet.po.Raznoe;

/**
 * Created by Администратор on 08.10.2016.
 */
public class CicleVsacie {
    public static void main(String[] args) {

        int count= 0;



       // System.out.println("Работает цикл while");
        while (count < 100){

            if (count ==0){
                System.out.println("Работает цикл while");
            }

            System.out.println("Счетчик цикла" + count);
            count++;
        }

        //Расчет среднего значения

        int a = 100;
        int b = 200;
        System.out.println("Расчет Средние значение двух числе" +" "+ a +" и "+b);

        while (++a < --b){
            // цикл работает пока условие остается ИСТИНЫМ. По постоянно увеличивающая а меньше постоянно уменьшающей и.
            // И когда из значения станут равно(Одинаковыми) То цикл прервется
          //  System.out.println("Средние значение двух числе" +" "+ a +" и "+b+" = " + a);
        }
        System.out.println("Средние значение двух числе = " + a);


        System.out.println("Цикл do while");

        a = 100;
        b =200;
        do {
            System.out.println("Такт "+ a);


        } while (++a < --b);
        System.out.println(" Вычеслено средние е значение двух чисел с помощью Цикла do while = " + a);


        System.out.println("Стандартный цикл for !!!");

        a = 100;
        b =200;

        for (int i =a; b > a; i++){
            System.out.println("Такт цикла for"+ i);

            if ( i == 150){
                System.out.println("150");
            }

            --b;

        }




    }
}

