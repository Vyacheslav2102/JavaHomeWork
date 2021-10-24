package com.pb.muzyka.hw3;
import java.lang.Math;
import  java.util.Scanner;

/*1. Написать программу игру “Bingo”.
Создайте класс Bingo в пакете hw3.
Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести сообщение о том, что число отгадано.
Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает продолжать угадывать число.
 */

public class Bingo {

    public static int getNumber(){ // Возвращает рандомное число в диапазоне 0-100
        double num = (Math.random()*100)+1;
        long res = Math.round(num);
        int number = (int) res;
        //String number = String.valueOf(res);
        return number;
    }

    public static int inDataNumber(){ //функция ввода числа
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

    public static void chackValue(){
        Boolean res = true;
        int rangomNumber = getNumber();
        int inputNumber = 0;
        int count = 0;
        while (res){
            inputNumber = inDataNumber();
            count ++;
            if(inputNumber == rangomNumber){
                System.out.print("Ура ты угадал!"+ "\n");
                System.out.print("Число попыток : "+ count);
                res = false;
            } else if (inputNumber < rangomNumber){
                System.out.print("К сожалению ты не угадал попробуй число побольше)" + "\n");
            }else if (inputNumber > rangomNumber){
                System.out.print("К сожалению ты не угадал попробуй число поменьше)" + "\n");
            }
        }
    }


    public static void main(String[] args) {
        chackValue();
    }
}
