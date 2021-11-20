package com.pb.muzyka.hw8;

/*
        WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение и передает его в конструктор класса Exception.

 */
public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String s) {
        super(s);
    }
}
