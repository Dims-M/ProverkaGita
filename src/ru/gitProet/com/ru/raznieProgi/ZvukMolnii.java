package ru.gitProet.com.ru.raznieProgi;

import java.util.Scanner;

/**
 * Created by Администратор on 09.10.2016.
 */
public class ZvukMolnii {

     static final int skorostZvuka = 331;

    public static void main(String[] args) {

      // final int skorostZvuka = 331;

        raschetSkorostiZvuka ();

    }

    public static void raschetSkorostiZvuka (){

        System.out.println("Сколько секунд прошло с моментавспушки молнии");
        Scanner scanner = new Scanner(System.in);

        int counSekond = scanner.nextInt();

        System.out.println("Удар молнии произошел на растоянии "+(counSekond*skorostZvuka + " метров \n"));


    }

}
