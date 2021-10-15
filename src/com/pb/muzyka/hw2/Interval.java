package com.pb.muzyka.hw2;
import java.util.Scanner;

/*2) Напишите программу определения интервала.
Создайте класс Interval в пакете hw2.
Предложите пользователю ввести целое число и сохраните его в переменную с произвольным именем.
Программа должна выяснить в какой промежуток попадает введенное число [0 -14] [15 - 35] [36 - 50] [51 - 100].
Вывести на экран сообщение с подходящим промежутком.
Если введенное число не попадает в один из имеющихся промежутков, то вывести соответствующее сообщение.
 */
public class Interval {
    public static int inDataNumber(){
        int num1 = 0;
        Scanner in = new Scanner(System.in);
        Boolean proverka = true;
        do {
            System.out.print("Введите число : ");
            if (in.hasNextInt()){
                num1 = in.nextInt();
                proverka = false;
            }else {
                in.next();
                System.out.print("Введено не корректное значение попробуй еще раз !" + "\n");
            }
        }while(proverka);

        return num1;
    }

    public static void hde(int num){
        if(num >= 0 && num <= 14){
            System.out.print("Число ввходит в диапазон от 0 до 14 включительно!" + "\n");
        }
        else if(num >= 15 && num <= 35){
            System.out.print("Число ввходит в диапазон от 15 до 35 включительно!" + "\n");
        }
        else if(num >= 36 && num <= 50){
            System.out.print("Число ввходит в диапазон от 36 до 50 включительно!" + "\n");
        }
        else if(num >= 51 && num <= 100){
            System.out.print("Число ввходит в диапазон от 51 до 100 включительно!" + "\n");
        }
        else{
            System.out.print("Число не входит ни в один из дипазонов!" + "\n");
        }
        System.out.print("Введенное значение - " + num + "\n");

        if(num > 100){
            System.out.print("Число привышает диапазон!" + "\n");
        }
        if(num < 0){
            System.out.print("Число меньше диапазона!" + "\n");
        }
    }

    public static void main(String[] args) {
        int number = 0;
        number = inDataNumber();
        hde(number);
    }
}
