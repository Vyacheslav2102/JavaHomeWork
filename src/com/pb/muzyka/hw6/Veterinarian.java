package com.pb.muzyka.hw6;

/*
Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
Пусть этот метод печатает на экран food и location пришедшего на прием животного.

 */

public class Veterinarian {

    void treatAnimal(Animal animal){
        System.out.println("Животное класа " + animal.getClass().getName() + ", ест " +animal.getFood() + ", проживает : " + animal.getLocation());
    }
}
