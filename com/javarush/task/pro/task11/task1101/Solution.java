package com.javarush.task.pro.task11.task1101;

/* 
Солнечная система — наш дом
*/

import static com.javarush.task.pro.task11.task1101.SolarSystem.*;

public class Solution {

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + age + " лет.");
        //        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + starsCount + " звезды.");
        System.out.println("Звезды по имени " + starName + ".");
        System.out.println("Расстояние к центру галактики составляет " + galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
    }
}
