package ru.gitProet.ru.com.krestikiNoliki;

/**
 * Created by Администратор on 30.09.2016.
 */
public class Main {

    public static void main(String[] args) {

        char[][] map; // массив чаров

        int x = 3;
        int y = 3;

        map = new char[x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                map[i][j] = 'X';
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Содержимое массива = " + map[i][j]);
            }
            System.out.println(); // перенос строки
        }


    }
}
