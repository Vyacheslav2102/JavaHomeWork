package com.pb.muzyka.hw2;
import java.util.Scanner;

/*
Создайте две целочисленных переменные с именами operand1 и operand2.
Предложите ввести значения operand1 и operand2 пользователю.
Также предложите пользователю ввести знак арифметической операции и поместите его в строковую переменную sign.
Пусть калькулятор может только складывать, отнимать, умножать и делить.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль. И если таковая имеется,
то отмените выполнение арифметической операции и уведомите об ошибке пользователя.
 */


public class Calculator {

    public static int inDataNumber(String number){ //передаем номер числа
        int num1 = 0;
        Scanner in = new Scanner(System.in);
        Boolean proverka = true;
        do {
            System.out.print("Введите " + number +" число : ");
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

    public static String inCgar(){
        String znak = "";
        Scanner in = new Scanner(System.in);
        Boolean proverka = true;
        do {
            System.out.print("Введите знак операции : ");
            znak = in.next();
            if (znak.equals("+")||znak.equals("-")||znak.equals("*")||znak.equals("/")){
                proverka = false;
            }else {
                System.out.print("Введено не корректное значение попробуй еще раз !" + "\n");
            }
        }while(proverka);

        return znak;
    }


    public static void calculation(int a, int b, String znak){
        int res = 0;
        switch (znak){
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                if (b != 0){
                    res = a / b;
                }
                else {
                    System.out.print("Попытка деления на 0!");
                }
        }
        if (b == 0 && znak.equals("/")){
            System.out.print("Ошибка !\n");
        }else{
            System.out.print("Результат " + a + " " + znak + " " + b + " = "  + res);
        }
    }

    public static void main(String[] args) {

        int operand1;
        int operand2 = 0;
        String sign = "";

        operand1 = inDataNumber("первое");
        sign = inCgar();
        operand2 = inDataNumber("второе");

        calculation(operand1,operand2,sign);

    }
}
