package com.pb.muzyka.hw4;
import java.util.Scanner;

/*
Создайте класс Anagram в пакете hw4.
Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.
Пример анаграмм:
Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
Я в мире — сирота. -> Я в Риме — Ариост.
При выполнении задания использовать метод(ы).
 */



public class Anagram {

    public static String inString(String num){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите " + num + " строку: \n");
        String in_str = new String("");
        in_str = in.nextLine();
        return in_str;
    }
    public static void delChar(String[] arr){
        String[] char_arr = {",",".","!","?",":",";"};
        for (int i =0; i<arr.length;i++){
            for (int j = 0; j<char_arr.length;j++){
                int index = arr[i].indexOf(char_arr[j]);
                if(index != -1){
                    arr[i] = arr[i].substring(0,index);
                }
            }
        }
    }

    public static void main(String[] args) {
        String first = inString("первую");
        String second = inString("второую");
        String[] words_first =  first.split(" ");
        String[] words_second = second.split(" ");
        delChar(words_first);
        delChar(words_second);
        int res_str = 0; // результирубщий масив


        for (int i=0; i< words_first.length; i++){ // перебор первого масива слов
            for (int j=0; j<words_first.length; j++){ // перебор второго масива слов

                String[] char_words_first = words_first[i].toUpperCase().split(""); // разбирее первого слова на буквы (первая строка)
                String[] char_words_second = words_second[j].toUpperCase().split("");// разбирее первого слова на буквы (вторая строка)
                int res_word = 0; // результирующая переменная (буквы)

                if(char_words_first.length == char_words_second.length){ // если слова одинаковы по длинне

                    for (int a =0; a < char_words_first.length; a++){ // перебор первого слова по буквам
                        for (int b = 0; b < char_words_second.length; b++){ // перебор второго слова по буквам

                            if(char_words_first[a].equals(char_words_second[b])){ // если буквы одинаковые
                                res_word++; // увеличиваем переменную
                            }
                        }
                    }
                    if (res_word == char_words_first.length){
                        res_str++;
                    }
                }
            }
        }

        if(res_str == words_first.length){
            System.out.print("Данные строки являются анаграммами");
        }
    }
}
