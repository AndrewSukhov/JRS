package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n > 0){
            multiArray = new int[n][];
            for (int i = 0; i < multiArray.length; i++) {
                int j = console.nextInt();
                multiArray[i] = new int[j];
            }
        }
    }
}
//public class Solution {
//    public static int[][] multiArray;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        multiArray = new int[n][];
//        for (int i = 0; i < n; i++) {
//            int size = Integer.parseInt(scanner.nextLine());
//            multiArray[i] = new int[size];
//        }
//    }
//}
