package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        if (month == Month.DECEMBER) {
            return  Month.JANUARY;
        }
        return  Month.values()[month.ordinal() + 1];
    }
/*
    лаконичное решение:
          int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
          return Month.values()[ordinal];
*/
}
