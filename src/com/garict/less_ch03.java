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
        // Упражнение 7
        Coin.fThrow();
        Coin.fThrow();
        Coin.fThrow();
        Coin.fThrow();
        Coin.fThrow();




    }

}
