package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine() + text;
        int i = 1;
        while (i <= 10) {
            System.out.println(result);
            i++;
        }
    }
}
