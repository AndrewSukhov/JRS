package com.javarush.task.pro.task10.task1006;

public class GasCar extends Car {

    public GasCar() {
        //        вызвать конструктор родительского класса и передать ему нужные параметры
//        Полезная статья про механизм наследования и про место super при создании класса-потомка.
//                https://javarush.ru/groups/posts/1927-konstruktorih-bazovihkh-klassov--
        super("GasCar");
    }
}
