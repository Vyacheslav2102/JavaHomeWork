package com.pb.muzyka.hw6;

/*
В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
Метод sleep, например, может выводить на консоль "Такое-то животное спит".
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.

 */

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public Animal() {
        this.food = "";
        this.location = "";
    }
    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Животное издает звучи природ))");
    }
    public void eat(){
        System.out.println("Животное ест" + food);
    }
    public void sleep(){
        System.out.println("Животное спит в" + location);
    }

}
