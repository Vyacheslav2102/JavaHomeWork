package com.pb.muzyka.hw6;

/*
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
 */

import java.util.Objects;

public class Cat extends Animal {
    private String work;

    public Cat(){
       super();
       this.work = "Ловит мышей";
    }
    public Cat(String food, String location){
        super(food,location);
        this.work = "Ловит мышей";
    }

    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот маукает");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест" + getFood());
    }

    @Override
    public String toString() {
        return "Кот проживет в" + getLocation() + "и выполняет работу : " +  getWork() + ", кот питается : " + getFood();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return getWork() == cat.work;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWork());
    }
}
