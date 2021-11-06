package com.pb.muzyka.hw6;

/*
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
 */

import java.util.Objects;

public class Horse extends Animal {
    private String work;

    public Horse(){
        super();
        this.work = "Котает)";
    }
    public Horse(String food, String location){
        super(food,location);
        this.work = "Котает)";
    }

    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void makeNoise() {
        System.out.println("Конь ржет");
    }

    @Override
    public void eat() {
        System.out.println("Конь ест" + getFood());
    }

    @Override
    public String toString() {
        return "Конь живет в :" + getLocation() + ", питается : " + getFood() + ", выполняет работу :" + getWork();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(getWork(), horse.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWork());
    }
}
