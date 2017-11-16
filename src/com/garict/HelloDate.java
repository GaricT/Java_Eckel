//: object/HelloDate.java
// Для запуска в командной строке - закомментировать package
package com.garict;
// Для генерации добавить в "Other command line argument" строку "-encoding UTF-8 -docencoding UTF-8 -charset UTF-8"
import java.util.*;

/** Первая программа пример-книги.
 * Выводит строку и текущее число
 * @author GarictT :-)
 * @author Брюс Эккель
 * @version 4.0
 */
// Упражнение 12
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     */
    public static void main (String[] args) {
        System.out.println("Привет, сегодня: ");
        System.out.println(new Date());
    }
} /* Output: (55% match)
Привет, сегодня:
Thu Nov 16 22:04:23 MSK 2017
*///:~
