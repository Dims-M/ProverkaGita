package ru.gitProet.com.ru.raznieProgi;

import java.util.Scanner;

/**
 * Created by Администратор on 06.10.2016.
 */
public class Mesaza {

    private int mesas;

    private String vremaGoda;
    private String mesaGoda;

    public void kakoiMesas() {

        Scanner scanner = new Scanner(System.in);
        mesas = scanner.nextInt();

        //  mesas = a;

        if (mesas == 12 || mesas == 1 || mesas == 2) {
            vremaGoda = "ЗИМА";
            if (mesas == 12) {
                mesaGoda = "Декабрь";
            }
            if (mesas == 1) {
                mesaGoda = "Январь";
            }

            if (mesas == 2) {
                mesaGoda = "Февраль";
            }
        } else if (mesas == 3 || mesas == 4 || mesas == 5) {
            vremaGoda = "ВЕСНА";
            if (mesas == 3) {
                mesaGoda = "Март";
            }
            if (mesas == 4) {
                mesaGoda = "Апрель";
            }
            if (mesas == 5) {
                mesaGoda = "Май";
            }

        } else if (mesas == 6 || mesas == 7 || mesas == 8) {
            vremaGoda = "ЛЕТО";
            if (mesas == 6) {
                mesaGoda = "Июнь";
            }
            if (mesas == 7) {
                mesaGoda = "Июль";
            }
            if (mesas == 8) {
                mesaGoda = "Август";
            }

        } else if (mesas == 9 || mesas == 10 || mesas == 11) {
            vremaGoda = "Белая зима";
            if (mesas == 9) {
                mesaGoda = "Сентябрб";
            }
            if (mesas == 10) {
                mesaGoda = "Октяборь";
            }

            if (mesas == 11) {
                mesaGoda = "Ноябрь";
            }

            if (mesas == 12) {
                mesaGoda = "Декабрь";
            }

        } else {
            vremaGoda = "Не КОРЕКТНЫЕ ДАННЫЕ!!!!";
            mesaGoda = "#@!@@@ОШИБКА№?№%";
        }
        System.out.println("Текущие сосотояние года = " + vremaGoda + " " + mesaGoda);
    }

    public void kakoimesasShith() {

        Scanner scanner = new Scanner(System.in);
        mesas = scanner.nextInt();

        switch (mesas) {

            case 1: {
                vremaGoda = "Белая зима";
                mesaGoda = "Январь";
                break;
            }
            case 2: {
                vremaGoda = "Белая зима";
                mesaGoda = "Февраль";
                break;
            }

            case 3: {
                vremaGoda = "Холодная и Робкая Весна";
                mesaGoda = "Март";
                break;
            }
            case 4: {
                vremaGoda = "Смелая Весна";
                mesaGoda = "Апрель";
                break;
            }
            case 5: {
                vremaGoda = "Ласковый Май";
                mesaGoda = "Май";
                break;
            }

            case 6: {
                vremaGoda = "Теплое Лето";
                mesaGoda = "Июнь";
                break;
            }

            case 7: {
                vremaGoda = "Жаркий Июль";
                mesaGoda = "Июль";
                break;
            }

            case 8: {
                vremaGoda = "Задумчивый авгут";
                mesaGoda = "Август";
                break;
            }

            case 9: {
                vremaGoda = "Бабье Лето";
                mesaGoda = "Сентябрь";
                break;
            }

            case 10: {
                vremaGoda = "Прохладная осень";
                mesaGoda = "Октябрь";
                break;
            }
            case 11: {
                vremaGoda = "Первый снег Начало зимы";
                mesaGoda = "Ноябрь";
                break;
            }
            case 12: {
                vremaGoda = "Белая зима";
                mesaGoda = "Декабрь";
                break;
            }

            default: {
                vremaGoda = "Не КОРЕКТНЫЕ ДАННЫЕ!!!!";
                mesaGoda = "#@!@@@ОШИБКА№?№%";
                break;

            }

        }

        System.out.println("Текущие сосотояние года = " + vremaGoda+ " "+ mesaGoda);


    }
}


