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

    static public void vizovDoWhile (int dsa){
        int count = dsa;

                do {
                    if (dsa == 0){
                        System.out.println("Первое значение равно = "+ dsa);
                    if (dsa == 1){

                        break;
                    }
                    dsa++;
                    if (dsa == 3){
                        continue;
                    }
                    System.out.println("Результат = "+ dsa);

                    if (dsa >= 100){
                        System.out.println("Максимальное значение = "+dsa);
                        break;
                    }
                }
                }

                while (true);

    }

}
