package com.pb.muzyka.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Создать пакет hw8

        Создать класс Auth, который содержит поля login и password и методы:

        - signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
        Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры. Если логин не соответствует требованиям нужно выбросить WrongLoginException.
        Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания. Также password и confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
        Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)

        - signIn (вход на сайт) принимающий login и password.
        Проверяет что login и password соответствуют значениям из полей класса.
        Если нет - выбрасывает исключение WrongLoginException.

        WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение и передает его в конструктор класса Exception.

        Создать класс OnlineShop с методом main.
        В main создать один объект класса Auth.
        Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
        Обработать исключения методов signUp signIn с помощью блоков try-catch.
*/
public class Auth {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

/*
 - signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
        Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры.
        Если логин не соответствует требованиям нужно выбросить WrongLoginException.
        Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания.
         Также password и confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
        Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)
 */
    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException
    {
        //Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры
        Pattern patternLog = Pattern.compile("[a-zA-Z0-9]{5,20}");
        Matcher matcherLog = patternLog.matcher(login);
        if(!matcherLog.matches())
            throw new WrongLoginException("Логин должен быть от 5 до 20 символов. Логин должен содержать только латинские буквы и цифры.");

        //Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания.
        Pattern patternPas = Pattern.compile("[a-zA-Z0-9_]{5,}");
        Matcher matcherPas = patternPas.matcher(confirmPassword);
        if(!matcherPas.matches())
            throw new WrongPasswordException("Длинна пароля более 5, может сождержать только латинские буквы и цифры и знак подчеркивания.");

        if (!password.equals(confirmPassword))
            throw new WrongPasswordException("Пароли не совпадают");

        setLogin(login);
        setPassword(password);

    }
/*
- signIn (вход на сайт) принимающий login и password.
        Проверяет что login и password соответствуют значениям из полей класса.
        Если нет - выбрасывает исключение WrongLoginException.
 */
    public void signIn(String login, String password) throws WrongLoginException
    {
        if (getLogin().equals(login)&&getPassword().equals(password))
            System.out.println("Вы успешно вошли на ресурс");
        else
            throw new WrongLoginException("Данные для входа введены не корректно");
    }
}
