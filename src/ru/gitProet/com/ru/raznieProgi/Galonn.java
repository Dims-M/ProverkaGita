package ru.gitProet.com.ru.raznieProgi;

import java.io.Reader;

/**
 * Created by Администратор on 05.10.2016.
 */
public class Galonn {

   private final double PI = 3.79;
   private double litr;
    private  double summa;

    double [] temmpp = new double[10];

    public double getLitr() {
        return litr;
    }

    public void setLitr(double litr) {
        this.litr = litr;
    }

    public Galonn(double litr) {
        this.litr = litr;
    }

    public void raschetGalloha (double znach){
        znach = litr;
        System.out.println("Расчитывается сколько литров у указынах галонах!!");

         summa = PI * znach;
        System.out.println("Вы ввели: "+ znach+ "галонов"+ " И это = "+ summa+ " литров");

        temmp(temmpp);
    }

    public void temmp (double temmpp []) {
        this.temmpp = temmpp;
        J:
        for (int i = 0; i < temmpp.length; i++) {

            if (temmpp[i] <= 0.0) {
                temmpp[i] = summa;
               System.out.println("Сохраненно в логах");
                break J ;
            }

            }
       // System.out.println("Сохраненно в логах");

    }

    public  void  logi (){

        for (int i = 0; i < temmpp.length; i++){
            if (temmpp[i] != 0){
                System.out.print("Данные в логах: ");
                System.out.println(temmpp[i]);
               continue;
                // break ;
            }

            if (temmpp[i] == 0) {
                System.out.println("Данных нет");
                break;
            }

        }

    }

}
