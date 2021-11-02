package com.pb.muzyka.hw5;

/*
Класс Library используется как демонстрация работы классов Book и Reader.
Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
Выполняются такие действия:
- печатаются все книги.
- печатаются все читатели.
- демонстрируется работа всех вариантов методов takeBook() и returnBook().
 */

import java.util.Scanner;

public class Reader {

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

    public static void menu(Library[] lib, Book[] books) {
        boolean start= true;
        while(start) {
            System.out.print("Что нужно сделать :" + "\n");
            System.out.print("1 - Вывести все книги" + "\n");
            System.out.print("2 - Вывести всех пользователей." + "\n");
            System.out.print("3 - Демонстрация функций takeBook()" + "\n");
            System.out.print("4 - Демонстрация функций returnBook()." + "\n");
            System.out.print("5 - Выход." + "\n");
            int res = inDataNumber();
            System.out.print("\n" + "\n" + "\n");
            switch (res){
                case 1 :
                    getBooks(books);
                    break;
                case 2 :
                    getLib(lib);
                    break;
                case 3 :
                    getLib_takeBook( lib, books);
                    break;
                case 4 :
                    getLib_returnBook( lib, books);
                    break;
                case 5 :
                    start= false;
            }
        }
    }

    public static void getBooks(Book[] books) {
        for (int i = 0; i<books.length; i++){
            books[i].getValue();
        }
    }
    public static void getLib(Library[] lib) {
        for (int i = 0; i<lib.length; i++){
            lib[i].getValue();
        }
    }

    public static void getLib_takeBook(Library[] lib, Book[] books) {
        for (int i = 0; i<lib.length; i++){
            lib[i].takeBook(Integer.toString(i));
        }
        System.out.print("\n" + "\n" + "\n");
        for (int i = 0; i<lib.length; i++){
            lib[i].takeBook(books[0].getName(), books[1].getName(), books[2].getName(), books[3].getName(), books[4].getName());
        }
        System.out.print("\n" + "\n" + "\n");
        for (int i = 0; i<lib.length; i++){
            lib[i].takeBook(books[i]);
        }
    }

    public static void getLib_returnBook(Library[] lib, Book[] books) {
        for (int i = 0; i<lib.length; i++){
            lib[i].returnBook(Integer.toString(i));
        }
        System.out.print("\n" + "\n" + "\n");
        for (int i = 0; i<lib.length; i++){
            lib[i].returnBook(books[0].getName(), books[1].getName(), books[2].getName(), books[3].getName(), books[4].getName());
        }
        System.out.print("\n" + "\n" + "\n");
        for (int i = 0; i<lib.length; i++){
            lib[i].returnBook(books[i]);
        }
    }

    public static void main(String[] args) {
        Book[] books = new Book[] {
                new Book("НИ СЫ. Будь уверен в своих силах и не позволяй сомнениям мешать тебе двигаться вперед", "Джен Синсеро", "19 мая 2021"),
                new Book("Букварь", "Надежда Жукова", "22 июля 2021"),
                new Book("НЕ НОЙ. Вековая мудрость, которая гласит: хватит жаловаться пора становиться богатым", "Джен Синсеро", "12 июля 2021"),
                new Book("НЕ ТУПИ. Только тот, кто ежедневно работает над собой, живет жизнью мечты","Джен Синсеро","7 октября 2021"),
                new Book("Хочу — Mогу — Надо. Узнай себя и действуй!","Марина Мелия","30 июля 2021")
        };

        Library[] lib = new Library[] {
                new Library("Музыка В. В.", "1", "1", "21.02.2020", "+380993414783"),
                new Library("Бучинский К. В.", "2", "2", "20.04.1994", "+380931126981"),
                new Library("Сирош Т. Н.", "3", "3", "05.03.1984", "+380663934227"),

        };

        menu(lib, books);

    }

}
