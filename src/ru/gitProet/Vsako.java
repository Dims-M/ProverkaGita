package ru.gitProet;

/**
 * Created by Администратор on 28.09.2016.
 */
public class Vsako {

    static public void vizovContinue ( int abs){
        int coun = abs;

        while (true){

            if (abs == 1){

                break;
            }
            abs++;
            if (abs == 3){
                continue;
            }
            System.out.println("Результат = "+ abs);

            if (abs >= 100){
                break;
            }
        }

    }

}
