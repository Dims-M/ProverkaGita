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
        galonn1.setLitr(145.0);
        galonn1.raschetGalloha(galonn1.getLitr());
        galonn1.logi();

        razdelitil();
        Mesaza mesaza = new Mesaza();
       // mesaza.kakoiMesas();
        razdelitil();
        mesaza.kakoimesasShith();



    } //конец майна

    public static void razdelitil (){
        System.out.println("**********************************");
    }
}
