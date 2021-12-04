package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        String array[] = new String[6];
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        for (int i = 0; i < array.length; i++) {
            if (tokenizer.hasMoreTokens()) {
                array[i] = tokenizer.nextToken();
            }
        }
        return array;
    }
}
