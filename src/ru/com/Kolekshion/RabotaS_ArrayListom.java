package ru.com.Kolekshion;
import java.util.*;
//для работы с колекциями необходима стандартная библиотека java.util.*;
/**
 * Created by Администратор on 25.11.2016.
 */
public class RabotaS_ArrayListom {


   public static void main(String[] args) {

      rabotaS_ArreiListom();



   }

   final static String info = "Данный класс работает с колексией ArrayLis " +
           "Аррей лист содержит массив примитивных переменных или сслыки на объекты" +
           " РАЗМЕР массива является Динамическим!! (Т Е увеличевается сам при необходимости)" +
           "************************* " +
           "К базовой колекции JAVA существет 2 основных направления ЭТО " +
           "Колекция  содержит набор обьектов или элементов" +
           "и" +
           "МАР содержит Ключ - значение" +
           "**************" +
           "Аррей лист представляет собой неупорядочную колекцию в которой допустимы дулирующие значения" +
           "И значения такой колеции пронумерована(индексы) от 0 " +
           "****************" +
           "Для работы с колекциями необходима стандартная библиотека java.util.*;" +
           "";


//////////////////////////////////********************************
//  Методы

   public static void rabotaS_ArreiListom() {

      String reg = "Уиня ";

      //Создали массив для добавление а Аррей лист
      String[] antiHeros = {"Jocer ", "Grinch", "Plankton ", "Mistique"};
      String[] moreAntiHeros = {"Jocer ", "Mistique"};

      // Создали Список типа Аррейй Лист
      List<String> list = new ArrayList<>();
      // Создаем для проверки дубликатов
      List<String> list1 = new ArrayList<>();

      // Добавляем в лист с помощь метода фор
      for (String str : antiHeros) {
         //list.add(str);
         list.add(str);
      }

      // Выводим с помощью методв фор
      for (String str1 : antiHeros) {
         System.out.println(str1);
      }
      System.out.println("************");
      // C помощью метода list.add(1, reg) добавляем нужный элемент в нужный индекс
      list.add(1, reg);

      // Выводим с помощью методв фор
      for (String str1 : list) {
         System.out.println(str1);
      }

   // Проверяем на дубликаты в ареей листке
   //list1.add (moreAntiHeros);
      addList (moreAntiHeros,list1);
      VividList(list1);


} // конец метода

   ///
   public static void addList (String [] strings, List list){
      // Метод для автоматического заполненич
      for ( Object str : list ){
         list.add(str);
      }

   }

   public static void VividList ( List list){
      // Метод для Вывода на экран
      for ( Object str : list ){
         System.out.println(str);
      }

   }

} // коней класса
