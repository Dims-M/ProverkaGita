package ru.gitProet.com.ru.raznieProgi;

/**
 * Created by Администратор on 05.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Galonn galonn = new Galonn(5);

        galonn.raschetGalloha(galonn.getLitr());

       // galonn.logi();

        Galonn galonn1 = new Galonn(100.5);
        galonn1.raschetGalloha(100);

        galonn1.logi();



    } //конец майна

}
