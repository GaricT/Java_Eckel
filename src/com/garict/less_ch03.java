package com.garict;

import java.util.Random;

//=================================================================
class LessOne{
    float fFloat;
} /* class LessOne{ */
//=================================================================

class Assign{
    static void fFloat(LessOne y){
        y.fFloat = 9.9f;
    }
} /* class Assign{ */
//=================================================================

// Класс для расчетов параметров для равномерного, линейного движения
class LineMove{
    // Результат вычислений
    private static float res;

    // Метод вывода результата
    static void fPrnRes(){

        System.out.println("Результат: " + res);

    } /* static void fPrnRes(){ */

    // Метод вычисления скорости
    static void fSpeed(float dist, float period){
        if (period == 0){
            res = 0;
            System.out.println("Деление на ноль не возможно.");
        }
        else {
            res =  dist / period;
        }
    } /* static void fSpeed(float dist, float period){ */

    // Метод вычисления пути
    static void fDist(float speed, float period){

        res = speed * period;

    } /* static void fDist(float speed, float period){ */

    // Вычисление времени движения
    static void fPeriod(float dist, float speed){

        if (speed == 0){
            res = 0;
            System.out.println("Деление на ноль не возможно.");
        }
        else {
            res =  dist / speed;
        }

    } /* static void fPeriod(float dist, float speed){ */
} /* class LineMove{ */
//=================================================================

class Dog{
    String name;
    String says;

} /* class Dog{ */
//=================================================================

class Coin{
    public static void fThrow(){
        Random side = new Random();
        int i = Integer.max(1, side.nextInt(100));
/*
        System.out.println("i: " + i);
        System.out.println("i % 2 : " + ( i % 2) );
*/

        if ((i % 2) == 0 ){
            System.out.println("Орел");
        }
        else {
            System.out.println("Решка");
        }

    } /* public static void fThrow(){ */
} /* class Coin{ */
//=================================================================

public class less_ch03 {
    static void f(boolean b){}
    static void StrLog (String iStr1, String iStr2){
        int i = iStr1.compareTo(iStr2);

        System.out.println("iStr1 : " + iStr1);
        System.out.println("iStr2 : " + iStr2);
        System.out.println("");
        System.out.println("iStr1 > iStr2       = " + (i > 0 ? "yes" : "no"));
        System.out.println("iStr1 < iStr2       = " + (i < 0 ? "yes" : "no"));
        System.out.println("iStr1 = iStr2       = " + (i == 0 ? "yes" : "no"));
        System.out.println("");
        System.out.println("iStr1 == iStr2      = " + (iStr1 == iStr2));
        System.out.println("iStr1 != iStr2      = " + (iStr1 != iStr2));
        System.out.println("");
        System.out.println("iStr1.equals(iStr2) = " + iStr1.equals(iStr2));
    }
    public static void main(String[] args){
/*
        // Упражнение 2
        LessOne objLOne01 = new LessOne();
        LessOne objLOne02 = new LessOne();
        // Инициализация
        objLOne01.fFloat = 3.21f;
        objLOne02.fFloat = 4.56f;
        System.out.println("1: " + objLOne01.fFloat + " : " + objLOne02.fFloat);
        // Присваиваем
        objLOne01 = objLOne02;
        System.out.println("2: " + objLOne01.fFloat + " : " + objLOne02.fFloat);
        // Изменяем поле в 1 классе
        objLOne01.fFloat = 77.11f;
        System.out.println("3: " + objLOne01.fFloat + " : " + objLOne02.fFloat);
        // Изменяем поле во 2 классе
        objLOne02.fFloat = 88.22f;
        System.out.println("3: " + objLOne01.fFloat + " : " + objLOne02.fFloat);
*/
/*
        // Упраженение 3
        LessOne objFloat = new LessOne();
        objFloat.fFloat = 3.3f;
        System.out.println("1. fFloat = " + objFloat.fFloat);
        Assign.fFloat(objFloat);
        System.out.println("2. fFloat = " + objFloat.fFloat);
*/
/*
        // Упражнение 4
        LineMove.fDist(20f, 1.5f);
        LineMove.fPrnRes();
        LineMove.fDist(60f, 1f);
        LineMove.fPrnRes();
        LineMove.fSpeed(120f, 0.5f);
        LineMove.fPrnRes();
        LineMove.fPeriod(120f, 85f);
        LineMove.fPrnRes();
*/

/*
        // Упраженение 5
        Dog MyDog01  = new Dog();
        Dog MyDog02  = new Dog();
        MyDog01.name = "Бобик";
        MyDog01.says = "Гав";
        MyDog02.name = "Тобик";
        MyDog02.says = "Тяф-тяф";

        System.out.println("1. " + MyDog01.name + ":" + MyDog01.says);
        System.out.println("2. " + MyDog02.name + ":" + MyDog02.says);

        // Упражение 6
        Dog HellsDog  = new Dog();

        MyDog01.says = HellsDog.says = "МрМур!";
        MyDog01.name = HellsDog.name = "Кот";

        System.out.println("3. " + MyDog01.says + ":" + HellsDog.says);
        System.out.println("MyDog01.name == HellsDog.name     : " + (MyDog01.name == HellsDog.name));
        System.out.println("MyDog01.says == HellsDog.says     : " + (MyDog01.says == HellsDog.says));
        System.out.println("MyDog01.name.equals(HellsDog.name): " + MyDog01.name.equals(HellsDog.name));
        System.out.println("MyDog01.says.equals(HellsDog.says): " + MyDog01.says.equals(HellsDog.says));
        System.out.println("MyDog01.equals(HellsDog)          : " + MyDog01.equals(HellsDog));

        HellsDog.name = "Лютик";
        HellsDog.says = "Заходи на огонёк";


        MyDog01 = HellsDog;
        System.out.println("4. " + MyDog01.name + ":" + MyDog01.says);
        System.out.println("MyDog01.name == HellsDog.name     : " + (MyDog01.name == HellsDog.name));
        System.out.println("MyDog01.equals(HellsDog)          : " + MyDog01.equals(HellsDog));
        System.out.println("MyDog01.says.equals(HellsDog.says): " + MyDog01.name.equals(HellsDog.name));
*/
/*
        // Упражнение 7
        Coin.fThrow();
        Coin.fThrow();
        Coin.fThrow();
        Coin.fThrow();
        Coin.fThrow();
*/
/*
        // Упражнение 8
        long vVal = 16L;
        System.out.println("DEC " + vVal + " : " + Long.toBinaryString(vVal));
        vVal = 017L;
        System.out.println("DEC " + vVal + " : " + Long.toBinaryString(vVal));
        vVal = 0x0EL;
        System.out.println("DEC " + vVal + " : " + Long.toBinaryString(vVal));
*/
/*
        // Упражнение 9
        float  vValF = 1f;
        double vValD = 1d;

        vValF = Float.MAX_VALUE;
        System.out.println("MAX float: " + vValF);
        vValF = Float.MIN_VALUE;
        System.out.println("MIN float: " + vValF);

        vValD = Double.MAX_VALUE;
        System.out.println("MAX double: " + vValD);
        vValD = Double.MIN_VALUE;
        System.out.println("MIN double: " + vValD);
*/
/*
        // Упражнение 10
        long f1 = 0xAA;
        long f2 = 0x55;
        System.out.println("1: " + Long.toBinaryString(f1));
        System.out.println("2:  " + Long.toBinaryString(f2));
        System.out.println("&:  " + Long.toBinaryString(f1 & f2));
        System.out.println("|: " + Long.toBinaryString(f1 | f2));
        System.out.println("|: " + Long.toBinaryString(f1 ^ f2));
        System.out.println("|: " + Long.toBinaryString(~f2));
*/
/*
        // Упражнение 11
        int f = 0x1fff;
        System.out.println("1: " + Integer.toBinaryString(f ));
        f <<= 18;
        System.out.println("2: " + Integer.toBinaryString(f));
        System.out.println("3: " + f);
*/
/*
        // Упражнение 12
        int f = 0xffff;
        System.out.println(f + " : " + Integer.toBinaryString(f));
        f <<= 31;
        System.out.println(f + " : " + Integer.toBinaryString(f));
        System.out.println(f + " >>> 21 = " + Integer.toBinaryString(f >>> 21));
        System.out.println(f + " >>  21 = " + Integer.toBinaryString(f >> 21));
*/
/*
        // Упражнение 13
        char vStr = 'A';
        System.out.println( vStr + " :" +  Integer.toBinaryString(vStr));
        // 65 числовой код 'A' что в ASCII, что в UTF-8
        System.out.println( (int)vStr + ":" +  Integer.toBinaryString((int)vStr));
        vStr = 'B';
        System.out.println( vStr + " :" +  Integer.toBinaryString(vStr));
        System.out.println( (int)vStr + ":" +  Integer.toBinaryString((int)vStr));

        vStr = 'a';
        System.out.println( vStr + " :" +  Integer.toBinaryString(vStr));
        System.out.println( (int)vStr + ":" +  Integer.toBinaryString((int)vStr));
        vStr = 'b';
        System.out.println( vStr + " :" +  Integer.toBinaryString(vStr));
        System.out.println( (int)vStr + ":" +  Integer.toBinaryString((int)vStr));
*/
        // Упражнение 14
        String Str1 = new String("test");
        String Str2 = new String("test");

        System.out.println("Присваивание через: new String(\"\")");
        StrLog(Str1, Str2);

        // Java и указатели, это нечто...
        System.out.println("");
        System.out.println("Прямое присваивание: Str1 = \"test\"; Str2 = \"test \";");
        Str1 = "test";
        Str2 = "test";
        StrLog(Str1, Str2);
    }

}
