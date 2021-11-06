package com.pb.muzyka.hw6;

/*
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
 */

import java.util.Objects;

public class Dog extends Animal {
    private String work;

    public Dog(){
        super();
        this.work = "Охраняет";
    }
    public Dog(String food, String location){
        super(food,location);
        this.work = "Охраняет";
    }

    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест" + getFood());
    }

    @Override
    public String toString() {
        return "Собака питается : "+ getFood() + "проживает в : " + getLocation() + ", и выполянет свою работу : " + work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(getWork(), dog.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWork());
    }
}
