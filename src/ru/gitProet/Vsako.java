package ru.gitProet;

/**
 * Created by Администратор on 28.09.2016.
 */
public class Vsako {

    static public void vizovContinue ( int abs){
        int coun = abs;

        while (true){

            if (abs == 10){
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
        System.out.println("-----------------------");
        int count = dsa;

                do {

                    if (count == 0) {
                        System.out.println("Первое значение равно = " + count);
                    }
                    if (count == 10){
                        System.out.println("Выход их цикла");
                        break;
                    }
                    count++;
                    if (count == 3){
                        System.out.println("работалала команда 'continue'");
                        continue;
                    }

                    System.out.println("Результат = "+ count);

                    if (count >= 100){
                        System.out.println("Максимальное значение = "+count);
                        break;
                    }

                } while (true);

    }

}
