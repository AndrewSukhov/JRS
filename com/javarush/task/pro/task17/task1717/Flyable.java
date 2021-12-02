package com.javarush.task.pro.task17.task1717;

/* 
Кто летит?
*/

public interface Flyable {
    default int getMaxSpeed(){
        return 80;
    }
}
