package ru.com.Kolekshion;

import static ru.com.Kolekshion.VsakoRazno.razdelitel;

/**
 * Created by Администратор on 27.11.2016.
 */
public class Main2 {

    public static String strokaProbnai = "абвгдаетсджвжаьлв! ";
    public static String abs = "Енот ";
    public static String bsd = "Полоскун ";
    public static String krendel = "       крендель       ";

    public static void main(String[] args) {

        RabotaS_Massivami rabotaS_massivami = new RabotaS_Massivami();


       // rabotaS_massivami.poiscIndekcaV_Sting(3,strokaProbnai);
    //    rabotaS_massivami.poiscIndekcaV_Sting(0,strokaProbnai);
        rabotaS_massivami.poiscIndekcaV_Sting(17,strokaProbnai);
        razdelitel ();
        rabotaS_massivami.poisc_PO_IndekcaV_Sting("г",strokaProbnai);
        rabotaS_massivami.poisc_PO_IndekcaV_Sting("а",strokaProbnai);
        rabotaS_massivami.poisc_PO_IndekcaV_Sting("д",strokaProbnai);
        razdelitel ();
        rabotaS_massivami.poisc_PO_IndekcaV_Sting(3 ,strokaProbnai);
        rabotaS_massivami.poisc_PO_IndekcaV_Sting(0 ,strokaProbnai);
        rabotaS_massivami.poisc_PO_IndekcaV_Sting(4 ,strokaProbnai);
        rabotaS_massivami.poisc_PO_IndekcaV_Sting(17 ,strokaProbnai);
        razdelitel ();
        System.out.println(strokaProbnai.charAt(1));
        razdelitel();
        System.out.println(strokaProbnai.indexOf("тсд"));
        razdelitel();

        System.out.println(abs.concat(bsd));
        System.out.println(abs.replace('о', 'О'));
        System.out.println(bsd.replace('о', 'О'));
        razdelitel();

        System.out.println("Длина переменной " + krendel + " = "+ krendel.length());
        System.out.println(krendel.toUpperCase()); // Верхний регистр
        System.out.println(krendel.toLowerCase()); // нижний регистр
        System.out.println(krendel.trim()); // Убираем все пробелы




    } // коней метода Майн



} // коней уласса
