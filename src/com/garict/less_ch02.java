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
//
    }

}

// Упражнение 7
class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment () {StaticTest.i++;}
}