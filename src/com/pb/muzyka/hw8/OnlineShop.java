package com.pb.muzyka.hw8;


/*
        Создать класс OnlineShop с методом main.
        В main создать один объект класса Auth.
        Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
        Обработать исключения методов signUp signIn с помощью блоков try-catch.
 */

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Auth auth = new Auth();
        boolean read_NO = true;
        System.out.println("Надо зарегистироватся)");
        do {
            read_NO = signUp(auth);
        }while (read_NO);

        do {
            read_NO = signIn(auth);
        }while (read_NO);
    }

    static public boolean signUp(Auth a) {
        System.out.println("Введите, пожалуйста, регистрационные данные:");
        try {
            String login = inString("Логин");
            String password = inString("Пароль");
            String rePassword = inString("Введите пароль еще раз");
            a.signUp(login, password, rePassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка ввода\t" + e.getMessage());
            return true;
        }
        return false;
    }

    static public boolean signIn(Auth a) {
        System.out.println("Введите, пожалуйста, данные для входа:");
        try {
            String login = inString("Логин");
            String password = inString("Пароль");
            a.signIn(login, password);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка ввода\t" + e.getMessage());
            return true;
        }
        return false;
    }

    public static String inString(String type){
        Scanner in = new Scanner(System.in);
        System.out.print(type + ": ");
        String test = new String("");
        test = in.nextLine();
        return test;
    }
}
