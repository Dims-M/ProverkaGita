package ru.gitProet.com.ru.raznieProgi;

import java.util.Scanner;

/**
 * Created by Администратор on 06.10.2016.
 */
public class Mesaza {

    private int mesas ;

   private String vremaGoda;
   private String mesaGoda;

    public void kakoiMesas() {

        Scanner scanner = new Scanner(System.in);
        mesas= scanner.nextInt();

      //  mesas = a;

        if (mesas == 12 || mesas == 1 || mesas == 2) {
            vremaGoda = "ЗИМА";
            if (mesas == 12){
                mesaGoda = "Декабрь";
            }
            if (mesas == 1){
                mesaGoda = "Январь";
            }

            if (mesas == 2){
                mesaGoda = "Февраль";
            }
        } else if (mesas == 3 || mesas == 4 || mesas == 5) {
            vremaGoda = "ВЕСНА";
            if (mesas == 3){
                mesaGoda = "Март";
            }
            if (mesas == 4){
                mesaGoda = "Апрель";
            }
            if (mesas == 5){
                mesaGoda = "Май";
            }

        } else if (mesas == 6 || mesas == 7 || mesas == 8) {
            vremaGoda = "ЛЕТО";
            if (mesas == 6){
                mesaGoda = "Июнь";
            }
            if (mesas == 7){
                mesaGoda = "Июль";
            }
            if (mesas == 8){
                mesaGoda = "Август";
            }

        } else if (mesas == 9 || mesas == 10 || mesas == 11) {
            vremaGoda = "Белая зима";
            if (mesas == 9){
                mesaGoda = "Сентябрб";
            }
            if (mesas == 10){
                mesaGoda = "Октяборь";
            }

            if (mesas == 11){
                mesaGoda = "Ноябрь";
            }

            if (mesas == 12){
                mesaGoda = "Декабрь";
            }

        }
        System.out.println("Текущие сосотояние года = " + vremaGoda+ " "+ mesaGoda);
    }

}