// Для запуска в командной строке - закомментировать package
package com.garict;
import java.util.*;

class tstclass01 {
    int fI;
    String fTxt;
    int storage (String s){
        return s.length() * 2;
    }
}

public class less_ch02 {
    public static void main (String[] args){
//        tstclass01 vTstCl = new tstclass01();
//        vTstCl.fTxt = "New data";
//        System.out.println("fI = " + vTstCl.fI);
//        System.out.println("fTxt = " + vTstCl.fTxt);
//        System.out.println("storage() = " + vTstCl.storage(vTstCl.fTxt));

// Упраженение 7
/*
        Incrementable.increment();
        System.out.println(StaticTest.i);
*/
// Упражнение 8
/*
        // Порождаем новые объект класса StaticTest
        StaticTest StatCls = new StaticTest();
        // Присваиваем статическому полю новое значени, теперь 49 будет как в StatCls.i так и в StaticTest.i
        StatCls.i = 49;
        // Вызываем инкремент для значения StaticTest.i, теперь там 50
        Incrementable.increment();
        // Порождаем еще один объект класса
        StaticTest StatCls02 = new StaticTest();
        // Творим сумашествие: В новый объект записываем сумму значений из объекта класса и самого класса
        StatCls02.i = StatCls.i + StaticTest.i;
        // Убеждаемся, что везде одинаковое значение
        System.out.println("StaticTest.i = " + StaticTest.i);
        System.out.println("StatCls.i    = " + StatCls.i);
        System.out.println("StatCls02.i  = " + StatCls02.i);
*/
// Упражнение 9
/*
        int     vInt01 = 3;
        Integer vInt02 = new Integer(4);
        int     vInt03 = vInt02;
        vInt02 = vInt02 + vInt01;
        System.out.println(vInt01);
        System.out.println(vInt03);
*/
// Упраженение 10
/*
        // Нумерация идет от 0, узнать сколько передано параметров можно через args.length
        if (args.length > 0 ){
            System.out.println("Первый параметр: " + args[0]);
        }
        else {
            System.out.println("Нет параметров командной строки");
        }
*/
// Упражнение 11
        AllTheColorsOfTheRainbow NewPalette = new AllTheColorsOfTheRainbow();
        System.out.println("Текущий оттенок: " + NewPalette.getAnIntegerRepresentingColors());
        NewPalette.changeTheHueOfTheColor(4);
        System.out.println("Текущий оттенок: " + NewPalette.getAnIntegerRepresentingColors());
        NewPalette.changeTheHueOfTheColor(4);
        System.out.println("Текущий оттенок: " + NewPalette.getAnIntegerRepresentingColors());
        NewPalette.changeTheHueOfTheColor(3);
    } /* public static void main (String[] args) */

}

// Упражнение 7
class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment () {StaticTest.i++;}
}

class AllTheColorsOfTheRainbow{
    private int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue){
        if (anIntegerRepresentingColors == newHue){
            System.out.println("Оттенок уже установлен, укажите другой");
        }
        else {
            System.out.println("Оттенок изменен");
            anIntegerRepresentingColors = newHue;
        }
    } /* void changeTheHueOfTheColor(int newHue) */
    int getAnIntegerRepresentingColors (){
        return anIntegerRepresentingColors;
    }
}