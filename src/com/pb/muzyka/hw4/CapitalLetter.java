package com.pb.muzyka.hw4;
import java.util.Scanner;

/*1. Создайте класс CapitalLetter в пакете hw4.
Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
Строку должен ввести пользователь.
Пример работы:
Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
При выполнении задания использовать метод(ы).
 */




public class CapitalLetter {

    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty())
            return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    } // делает первую букву заглавной
    public static void outArr(String[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print("Значение " + i + "-го элемента масива : " + arr[i] + "\n");
        }
    } // вывовд по словам (для себя)
    public static void UpperrArr(String[] arr) {
        for (int i = 0; i < arr.length; i ++){
            arr[i] = firstUpperCase(arr[i]);
        }
    }
    public static void concatenatingStrings(String[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i ++){
            res += arr[i] + " ";
        }
        res.trim();
        System.out.print("Строка с заглавными букЫвами: \n" + res + "\n");
    }
    public static String inString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: \n");
        String test = new String("");
        test = in.nextLine();
        return test;
    }


    public static void main(String[] args) {
        String in = inString();
        String[] words =  in.split(" ");
        UpperrArr(words);
        System.out.print("Введенная строка: \n" + in + "\n");
        concatenatingStrings(words);
    }
}
