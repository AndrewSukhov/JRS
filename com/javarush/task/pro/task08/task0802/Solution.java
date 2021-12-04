package com.javarush.task.pro.task08.task0802;

/* 
Утильный класс: часть 2
*/
public class Solution {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        return Math.pow(number, power);
    }
}

//public class Solution {
//
//    public static double sqrt(double a) {
//        return a * a;
//    }
//
//    public static double cbrt(double a) {
//        return a * a * a;
//    }
//
//    public static double pow(int number, int power) {
//        int result = number;
//        if(power == 0) {
//            return 1;
//        }
//        for(int i = 1; i < power; i++) {
//            result *= number;
//        }
//        return power < 0 ? 1d / result : result;
//    }
//}
