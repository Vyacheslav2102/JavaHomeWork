package com.pb.muzyka.hw6;

/*
Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте животных на прием к ветеринару.
Объект класса Veterinarian создайте с помощью рефлексии.
 */

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) {
        Animal[] an = new Animal[3];
        an[0] = new Cat("Кошачий корм", "в квартире");
        an[1] = new Dog("Мясо", "в будке");
        an[2] = new Horse("Сено", "в загоне");

        try {
            Class clazz = Class.forName("com.pb.muzyka.hw6.Veterinarian");
            Constructor constructor = clazz.getConstructor();
            Object obj = constructor.newInstance();

            for (int i = 0; i < an.length; i++){
                ((Veterinarian) obj).treatAnimal(an[i]);
            }
        }
        catch (Exception e){
            System.out.println("Случился ошибка)");
        }

     }
}
