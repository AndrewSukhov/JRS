package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("AndrewA", 4.5);
        grades.put("AndrewS", 4.4);
        grades.put("AndrewD", 4.3d);
        grades.put("AndrewF", 4.2d);
        grades.put("AndrewG", 4.1d);
    }
}
