package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
//        Outer outerObject = new Outer();
//        Outer.Inner innerObject = outerObject.new Inner();

        Outer.Nested nestedObject = new Outer.Nested();
    }
}
