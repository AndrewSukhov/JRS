package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int half = array.length / 2;
        int halfPlusOne = half + 1;

        if (array.length % 2 == 0) {
            Arrays.fill(array, 0, half, valueStart);
            Arrays.fill(array, half, array.length, valueEnd);
        } else {
            Arrays.fill(array, 0, halfPlusOne, valueStart);
            Arrays.fill(array, halfPlusOne, array.length, valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}

//public class Solution {
//    public static int[] array = new int[20];
//    public static int valueStart = 10;
//    public static int valueEnd = 13;
//
//    public static void main(String[] args) {
//        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
//        Arrays.fill(array, 0, firstPart, valueStart);
//        Arrays.fill(array, firstPart, array.length, valueEnd);
//        System.out.println(Arrays.toString(array));
//    }
//}
