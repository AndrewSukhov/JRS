package com.javarush.task.pro.task14.task1416;

/* 
Логирование стектрейса
*/

public class Solution {

    public static void main(String[] args) {
        dangerousMethod();
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
