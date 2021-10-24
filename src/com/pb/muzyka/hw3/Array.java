package com.pb.muzyka.hw3;
import java.lang.Math;
import  java.util.Scanner;


/*Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
Вывести на экран введенный массив.
Подсчитать сумму всех элементов массива и вывести ее на экран.
Подсчитать и вывести на экран количество положительных элементов.
Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
Вывести на экран отсортированный массив.

 */

public class Array {

    public static void menu(int[] arr){
        boolean start= true;
        System.out.print("Введите масив)" + "\n");
        inArr(arr);
        int [] cloneArr = copyArr(arr);
        while(start) {
            System.out.print("Что нужно сделать с масивом :" + "\n");
            System.out.print("1 - Вывести на экран введенный массив." + "\n");
            System.out.print("2 - Подсчитать сумму всех элементов массива и вывести ее на экран." + "\n");
            System.out.print("3 - Подсчитать и вывести на экран количество положительных элементов." + "\n");
            System.out.print("4 - Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком." + "\n");
            System.out.print("5 - Вывести на экран отсортированный массив." + "\n");
            System.out.print("6 - Выход." + "\n");
            int res = inDataNumber();
            System.out.print("\n" + "\n" + "\n");
            switch (res){
                case 1 :
                    outArr(cloneArr);
                    break;
                case 2 :
                    sumArr(arr);
                    break;
                case 3 :
                    sumPlusArr(arr);
                    break;
                case 4 :
                    sortArr(arr);
                    System.out.print("Готово)" + "\n");
                    break;
                case 5 :
                    outArr(arr);
                    break;
                case 6 :
                    start= false;
            }
        }
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
    public static void inArr(int[] arr){
        for (int i=0; i<10; i++){
            arr[i] = inDataNumber();
        }
    }
    public static void outArr(int[] arr){
        for (int i=0; i<10; i++){
            System.out.print("Значение " + i + "-го элемента масива : " + arr[i] + "\n");
        }
    }
    public static void sumArr(int[] arr){
        int sum = 0;
        for (int i=0; i<10; i++){
           sum +=  arr[i];
        }
        System.out.print("Сумма элементов масива :" + sum + "\n");
    }
    public static void sumPlusArr(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i=0; i<10; i++){
            if(arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.print("Сумма положительных элементов масива :" + sum + "\n");
        System.out.print("А их колличество :" + count + "\n");
    }
    public static void sortArr(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static  int[] copyArr(int[] arr){
        int[] cloneArr = arr.clone();
        return cloneArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        menu(arr);
    }
}
