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




    }
}

