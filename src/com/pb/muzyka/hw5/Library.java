package com.pb.muzyka.hw5;

/*
Класс Reader хранит такую информацию о пользователе библиотеки:
- ФИО
- номер читательского билета
- факультет
- дата рождения
- телефон

- takeBook, который будет принимать количество взятых книг.
Выводит на консоль сообщение
"Петров В. В. взял 3 книги".


- takeBook, который будет принимать переменное количество названий книг.
Выводит на консоль сообщение
"Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".


- takeBook, который будет принимать переменное количество объектов класса Book.
Выводит на консоль сообщение
"Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
 */

import com.sun.javafx.scene.control.behavior.ListCellBehavior;

public class Library {

    private String fio;
    private String number_bilet;
    private String faculty;
    private String date_of_Birth;
    private String telephone;

    public Library(){
            fio = "";
            number_bilet = "";
            faculty = "";
            date_of_Birth = "";
            telephone = "";
    }

    public Library(String fio, String number_bilet, String faculty, String date_of_Birth, String telephone) {
        this.fio = fio;
        this.number_bilet = number_bilet;
        this.faculty = faculty;
        this.date_of_Birth = date_of_Birth;
        this.telephone = telephone;
    }

    public String getFio() {
        return fio;
    }
    public String getNumber_bilet() {
        return number_bilet;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getDate_of_Birth() {
        return date_of_Birth;
    }
    public String getTelephone() {
        return telephone;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setNumber_bilet(String number_bilet) {
        this.number_bilet = number_bilet;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setDate_of_Birth(String date_of_Birth) {
        this.date_of_Birth = date_of_Birth;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void takeBook(String number){
        System.out.println(fio + " взял " + number + " книги");
    }

    public void takeBook(String... books){
        System.out.print(fio + " взял книги : ");
        for (int i = 0; i< books.length; i++){
            if (i != books.length-1){
                System.out.print(books[i] + ", ");
            }
            else {
                System.out.print(books[i]);
            }
        }
        System.out.print("\n");
    }

    public void takeBook(Book... books){
        System.out.print(fio + " взял книги : ");
        for (int i = 0; i< books.length; i++){
            if(i != books.length-1){
                System.out.print(books[i].getName() + " (" + books[i].getAutor() + " " + books[i].getYear() + "), ");
            }
            else {
                System.out.print(books[i].getName() + " (" + books[i].getAutor() + " " + books[i].getYear() + ")");
            }
        }
        System.out.print("\n");
    }

    /*
    Аналогичным образом перегрузить метод returnBook().
    Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
    - "Петров В. В. вернул 3 книги"
    - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
    - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
     */

    public void returnBook(String number) {
        System.out.println(fio + " вернул " + number + " книги");
    }

    public void returnBook(String... books) {
        System.out.print(fio + " вернул книги : ");
        for (int i = 0; i< books.length; i++){
            if (i != books.length-1){
                System.out.print(books[i] + ", ");
            }
            else {
                System.out.print(books[i]);
            }
        }
        System.out.print("\n");
    }

    public void returnBook(Book... books){
        System.out.print(fio + " вернул книги : ");
        for (int i = 0; i< books.length; i++){
            if(i != books.length-1){
                System.out.print(books[i].getName() + " (" + books[i].getAutor() + " " + books[i].getYear() + "), ");
            }
            else {
                System.out.print(books[i].getName() + " (" + books[i].getAutor() + " " + books[i].getYear() + ")");
            }
        }
        System.out.print("\n");
    }

    public void getValue(){
        System.out.println("Пользователь \"" +  this.getFio() + "\", номер билета \"" + this.getNumber_bilet() + "\", факультет \"" + this.getFaculty() + "\", дата рождения \"" + this.getDate_of_Birth()+ "\", номер телефона \"" + this.getTelephone() + "\"");
    }


}
