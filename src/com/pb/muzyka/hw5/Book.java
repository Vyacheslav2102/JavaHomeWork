package com.pb.muzyka.hw5;

/*
Класс Book хранит такую информацию о книге:
- название
- автор книги
- год издания
Типы полей выбирать на свое усмотрение.
 */

public class Book {
    private String name;
    private String autor;
    private String year;

    public Book(){
        name = "";
        autor = "";
        year = "";
    }

    public Book(String name, String autor, String year){
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public String getAutor() {
        return autor;
    }
    public String getYear() {
        return year;
    }

    public void getValue() {
        System.out.println("Название книги \"" +  this.getName() + "\", ее автор \"" + this.getAutor() + "\", год ее выпуска \"" + this.getYear() + "\"");
    }
}
