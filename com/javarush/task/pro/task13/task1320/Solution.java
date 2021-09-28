package com.javarush.task.pro.task13.task1320;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        String monthString = switch (monthIndex) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Недействительный месяц";
        };
        return monthString;
    }
/*
    Вариант решения 2:
    String monthString;
        switch (monthIndex) {
        case 1: monthString = "Январь"; break;
        case 2: monthString = "Февраль"; break;
        case 3: monthString = "Март"; break;
        case 4: monthString = "Апрель"; break;
        case 5: monthString = "Май"; break;
        case 6: monthString = "Июнь"; break;
        case 7: monthString = "Июль"; break;
        case 8: monthString = "Август"; break;
        case 9: monthString = "Сентябрь"; break;
        case 10: monthString = "Октябрь"; break;
        case 11: monthString = "Ноябрь"; break;
        case 12: monthString = "Декабрь"; break;
        default: monthString = "Недействительный месяц";
    }
        return monthString;
}
*/
}
