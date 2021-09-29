package com.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape;
        if (countOfCorner == 3) {
            shape = "Треугольник";
        } else if (countOfCorner == 4) {
            shape = "Четырехугольник";
        } else if (countOfCorner == 5) {
            shape = "Пятиугольник";
        } else if (countOfCorner == 6) {
            shape = "Шестиугольник";
        } else if (countOfCorner == 7) {
            shape = "Семиугольник";
        } else if (countOfCorner == 8) {
            shape = "Восьмиугольник";
        } else {
            shape = "Другая фигура";
        }
        return shape;
    }
}
