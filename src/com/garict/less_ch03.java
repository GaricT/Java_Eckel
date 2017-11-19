package com.garict;

class LessOne{
    float fFloat;
}

class Assign{
    static void fFloat(LessOne y){
        y.fFloat = 9.9f;
    }
}
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
}

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
        // Упражнение 4
        LineMove.fDist(20f, 1.5f);
        LineMove.fPrnRes();
        LineMove.fDist(60f, 1f);
        LineMove.fPrnRes();
        LineMove.fSpeed(120f, 0.5f);
        LineMove.fPrnRes();
        LineMove.fPeriod(120f, 85f);
        LineMove.fPrnRes();
    }

}
